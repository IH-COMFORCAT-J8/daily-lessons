package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        List<Student> students = new ArrayList<>();


        while (isRunning) {
            showMenu();
            int selection = 0;

            try {
                selection = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.err.println("Sólo se aceptan números enteros como valor");
                scanner.nextLine();


            }

            switch (selection) {
                case 1:
                    createNewStudent(students);

                    break;
                case 2:
                    addScoreToStudent();
                    break;
                case 3:
                    showAverageStudent();
                    break;
                case 4:
                    showAllStudents(students);
                    break;
                case 5:
                    showAllPassedStudents();
                    break;

                case 6:
                    System.out.println("Hasta pronto!!!");
                    isRunning = false;
                    break;
                default:
                    System.err.println("Introduce un número válido");


            }


        }

    }

    private static void showAllPassedStudents() {
    }

    private static void showAllStudents(List<Student> students) {

        for(Student s : students) {
            System.out.println(s);
        }


    }

    private static void showAverageStudent() {
    }

    private static void addScoreToStudent() {
    }

    private static void createNewStudent(List<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del estudiante:");
        String name =  scanner.nextLine();
        System.out.println("Introduce el apellido del estudiante: ");
        String surname = scanner.nextLine();
        System.out.println("Introduce su edad:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce 1. para estudiante remoto y 2. para estudiante presencial");
        int studentType = scanner.nextInt();
        scanner.nextLine();

        if (studentType == 1) {
            System.out.println("Introduce el enlace de zoom");
            String url = scanner.nextLine();
            RemoteStudent remoteStudent = new RemoteStudent(name, surname, age, url);
            students.add(remoteStudent);

        } else {
            System.out.println("Introduce la dirección:");
            String address = scanner.nextLine();
            OnSiteStudent onSiteStudent = new OnSiteStudent(name, surname, age, address);
            students.add(onSiteStudent);

        }
    }

    private static void showMenu() {
        System.out.println("Selecciona una opción:");
        System.out.println("1. Crear nuevo estudiante");
        System.out.println("2. Añadir nota a un estudiante");
        System.out.println("3. Mostrar media de un estudiante");
        System.out.println("4. Mostrar todos los estudiantes");
        System.out.println("5. Mostrar todos los estudiantes aprobados");
        System.out.println("6. Salir");
    }
}
