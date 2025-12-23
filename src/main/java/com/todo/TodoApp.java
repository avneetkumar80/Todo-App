package com.todo;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    tasks.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++)
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    break;
                case 3:
                    System.out.print("Enter task number to delete: ");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < tasks.size())
                        tasks.remove(index);
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}
