import java.util.*;
import java.io.*;

public class myFileOrganizer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To Waleed4we's Auto File Organizer Peogram");
        System.out.println("You Just Give Your Messy Folder Path And Your Files Will Be Organized Under 10 Seconds");
        System.out.println(
                "Files Will Be Organized Into Categories Like Images, Videos, Audio, Documents, Archives, Executables, and Others");
        System.out.print("\nEnter Your Folder's Path : ");
        String folder_path = input.nextLine();

        File check_file = new File(folder_path);

        if (check_file.exists() && check_file.isDirectory()) {
            System.out.println("Folder found successfully\n\nStarting Files Organization ......");
            File[] files_inside = check_file.listFiles();

            int totalFiles = 0 , failed_move = 0 , successful_move = 0 , renamed_files = 0 ;

            for (File myFiles : files_inside) {

                if (myFiles.isFile()) {
                    totalFiles++;
                    String file_name = myFiles.getName();
                    int index_of_last_dot = file_name.lastIndexOf(".");

                    if (index_of_last_dot != -1 && index_of_last_dot != 0) {

                        String file_Extension = file_name.substring(index_of_last_dot + 1);

                        String category = switch (file_Extension.toLowerCase()) {
                            case "jpg", "png", "webp", "jpeg", "gif", "svg" -> "Images" ;
                            case "mp4", "mkv", "avi", "mov", "webm" -> "Videos" ;
                            case "mp3", "wav", "flac", "aac", "m4a", "ogg" -> "Audio" ;
                            case "pdf", "docx", "txt", "doc", "ppt", "pptx", "xls", "xlsx", "csv" -> "Documents" ;
                            case "zip", "rar", "7z", "tar", "gz", "iso" -> "Archives" ;
                            case "exe", "msi", "apk", "jar" -> "Executables" ;
                            default -> "Others" ;
                        };

                        File category_folder = new File(check_file, category);

                        if (!category_folder.exists()) {
                            category_folder.mkdir();
                        }

                        File destination_file = new File(category_folder, myFiles.getName());

                        if (destination_file.exists()) {

                            String file_name_without_extension = file_name.substring(0, index_of_last_dot);
                            String extension = file_name.substring(index_of_last_dot);

                            int counter = 1;

                            while (destination_file.exists()) {
                                String new_file_name = file_name_without_extension + " (" + counter + ")" + extension;
                                destination_file = new File(category_folder, new_file_name);
                                counter++;
                            }

                            renamed_files++;

                            boolean moved = myFiles.renameTo(destination_file);
                            if (!moved) {
                                System.out.println("Failed to move: " + file_name);
                                failed_move++;
                            } else {
                                successful_move++;
                            }

                        } else {

                            boolean moved = myFiles.renameTo(destination_file);

                            if (!moved) {
                                System.out.println("Failed to move: " + file_name);
                                failed_move++;
                            } else {
                                successful_move++;
                            }

                        }
                    }
                }
            }

            System.out.println("Total Files Found : " + totalFiles);
            System.out.println("Successfully Moved Files : " + successful_move);
            System.out.println("Failed To Move Files : " + failed_move);
            System.out.println("Renamed Files : " + renamed_files);

        } else if (check_file.exists()) {
            System.out.print("The Provided Path Exists , But It Is Not A Folder");
        } else {
            System.out.print(folder_path + " Doesn't Exist");
        }
        input.close();
    }
}

