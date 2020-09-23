package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String[] inputArray;
        ArrayList<Employee> employees = new ArrayList<Employee>();
        while (1 != 0) {
            String input = in.nextLine();
            inputArray = input.split(" ");
            System.out.println(inputArray[0]);
            if (inputArray[0].equals("employee")) {
                Employee newEmployee = new Employee(inputArray[1], inputArray[2], inputArray[3]);
                employees.add(newEmployee);
                System.out.println("Added new employee with  identifier " + newEmployee.getID() + ".");
            }
            else if (inputArray[0].equals("list")) {
                for (Employee employee : employees) {
                    System.out.println(employee.firstName);
                    System.out.println(employee.getID());
                }
            }
            else {
                System.out.println("Error, please enter valid command.");

            }
        }
    }

}
