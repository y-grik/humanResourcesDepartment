package com.company.test;

import java.util.Scanner;
import static com.company.business.EmployeeManager.*;

public class Main {

    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("Введите команду:\n" +
                    "1 - создать сотрудника\n" +
                    "2 - удалить сотрудника\n" +
                    "3 - вывести список сотрудников\n" +
                    "4 - расчитать зарплату\n" +
                    "5 - выход\n");

            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            if (command == 5) {
                break;
            } else if (command >= 1 && command <= 4){
                switch (command) {
                    case (1):
                        createEmployee(scanner);
                        break;
                    case (2):
                        deleteEmployee(scanner);
                        break;
                    case (3):
                        showEmployees();
                        break;
                    case (4):
                        calculateSalary(scanner);
                        break;
                }
            } else {
                System.out.println("Неверный ввод.");
            }

        }

    }

}
