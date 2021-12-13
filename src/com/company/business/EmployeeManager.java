package com.company.business;

import com.company.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EmployeeManager {

    static List<Employee> Employees = new ArrayList<>();

    public static void createEmployee(Scanner scanner) {
        System.out.println("Введите должность сотрудника\n" +
                "1 - Директор\n" +
                "2 - Рабочий\n" +
                "3 - Менеджер\n");
        int position = scanner.nextInt();
        if (position != 1 & position !=2 & position != 3){
            System.out.println("Неверный ввод");
        }else {
            int id;
            String name;
            int age;
            Gender gender;
            int rate;
            if (Employees.size() == 0) {
                id = 1;
            } else {
                id = Employees.get(Employees.size() - 1).getId() + 1;
            }
            System.out.println("Введите имя:");
            name = scanner.next();
            System.out.println("Введите возраст:");
            age = scanner.nextInt();
            System.out.println("Введите пол (MALE, FEMALE):");
            gender = Gender.valueOf(scanner.next());
            System.out.println("Введите ставку:");
            rate = scanner.nextInt();

            switch (position) {
                case (1):
                    Director director = new Director(id, name, age, gender, rate);
                    Employees.add(director);
                    break;
                case (2):
                    Worker worker = new Worker(id, name, age, gender, rate);
                    Employees.add(worker);
                    break;
                case (3):
                    Manager manager = new Manager(id, name, age, gender, rate);
                    Employees.add(manager);
                    break;
            }
        }
    }

    public static void deleteEmployee (Scanner scanner) {
        System.out.println("Введите ID сотрудника на удаление");
        int id = scanner.nextInt();
        Optional<Employee> employeeToRemove = Employees.stream().filter(x -> x.getId() == id).findFirst();
        if (employeeToRemove == null){
            System.out.println("Сотрудник не найден");
        } else {
            Employees.remove(employeeToRemove.get());
        }

    }

    public static void calculateSalary(Scanner scanner) {
        System.out.println("Введите колличество дней для рассчета ЗП");
        int daysCount = scanner.nextInt();
        for (Employee employee : Employees)
        {
            int salary = employee.getRate() * daysCount;
            System.out.println("id=" + employee.getId() +
                    ", name=" + employee.getName() +
                    ", salary=" + salary);
        }
    }

    public static void showEmployees () {
        System.out.println("Список сотрудников:");
        Employees.forEach(System.out::println);
    }
}
