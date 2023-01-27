package com.company.homework;



public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 312, 30000, 30);
        persArray[1] = new Employee("Ivanov Ivan2", "Engineer2", "ivivan@mailbox.com2", 3122, 300001, 32);
        persArray[2] = new Employee("Ivanov Ivan3", "Engineer2", "ivivan@mailbox.com2", 3122, 300001, 52);
        persArray[3] = new Employee("Ivanov Ivan4", "Engineer2", "ivivan@mailbox.com2", 3122, 300001, 22);
        persArray[4] = new Employee("Ivanov Ivan5", "Engineer2", "ivivan@mailbox.com2", 3122, 300001, 41);

        for (Employee a : persArray) {
            if (a.getAge() > 40) {
                System.out.println(a);
            }
        }


    }
}