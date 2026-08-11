import java.util.*;
import java.io.*;

public class java_calculator {

    public static void clear_history() {
        System.out.println("Clearing History");
        try {
            BufferedWriter own_writer = new BufferedWriter(new FileWriter("history.txt"));
            own_writer.close();
        } catch (IOException e) {
            System.out.println("Exception Came : " + e.getMessage());
        }
        System.out.println("History Cleared");
    }

    public static void write_history(String user_choice, double result) {
        try {
            BufferedWriter own_writer = new BufferedWriter(new FileWriter("history.txt", true));
            own_writer.write(user_choice + " : " + result);
            own_writer.newLine();
            own_writer.close();
        } catch (IOException e) {
            System.out.println("Exception Came : " + e.getMessage());
        }
    }

    public static void read_history() {
        File history_file = new File("history.txt");

        if (!history_file.exists() || history_file.length() == 0) {
            System.out.println("No History Found");
            return;
        }

        try (BufferedReader own_reader = new BufferedReader(new FileReader(history_file))) {
            String line;
            while ((line = own_reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Exception Came : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To My Calculator");
        System.out.println("It Also Saves History");
        System.out.println("Here You Can Do +, -, *, /, %\n");

        while (true) {
            System.out.print("\n1 - For Calculation\n2 - To View History\n3 - To Clear History\n4 - To Exit The Calculator\n\nEnter Your Choice Please : ");

            int loop_choice;

            try {
                loop_choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input ! Please Enter A Number Between 1 And 4");
                continue;
            }

            if (loop_choice == 1) {
                double result = 0;

                System.out.print("Write Your Calculation Expression : ");
                String user_choice = input.nextLine();
                String[] parts = user_choice.trim().split(" ");

                if (parts.length != 3) {
                    System.out.println("Invalid Format ! Please Use Space Between Numbers And Operator (Example , 8 + 5) : ");
                    continue;
                }

                try {
                    double first_num = Double.parseDouble(parts[0]);
                    String operator = parts[1];
                    double second_num = Double.parseDouble(parts[2]);
                    boolean validOperation = true;

                    switch (operator) {
                        case "+":
                            result = first_num + second_num;
                            break;
                        case "-":
                            result = first_num - second_num;
                            break;
                        case "*":
                            result = first_num * second_num;
                            break;
                        case "/":
                            if (second_num != 0) {
                                result = first_num / second_num;
                            } else {
                                System.out.println("Error : Division By Zero Is Not Possible");
                                validOperation = false;
                            }
                            break;
                        case "%":
                            if (second_num != 0) {
                                result = first_num % second_num;
                            } else {
                                System.out.println("Error : Modulo By Zero Is Not Possible");
                                validOperation = false;
                            }
                            break;
                        default:
                            System.out.println("Invalid Operator ! Use +, -, *, /, Or % Please ");
                            validOperation = false;
                    }

                    if (validOperation) {
                        System.out.println("Result: " + result);
                        write_history(user_choice, result);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Errorm : Please Enter Valid Numbers");
                }
            } else if (loop_choice == 2) {
                read_history();
            } else if (loop_choice == 3) {
                clear_history();
            } else if (loop_choice == 4) {
                System.out.println("\nThank You For Using My Calculator , Good Bye !");
                break;
            } else {
                System.out.println("Invalid Loop Choice , Enter Again : ");
            }
        }

        input.close();
    }
}