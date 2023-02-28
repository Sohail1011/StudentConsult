package appprom;

import java.util.Scanner;

public class AppProm {

    public static void main(String[] args) {
        //Getting the name
        Scanner nom = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String student = nom.nextLine();

        //Reading the numbers
        Scanner x = new Scanner(System.in);
        System.out.println("Ingresa tu primera nota:");
        int n1 = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Ingresa tu segunda nota:");
        int n2 = y.nextInt();
        Scanner u = new Scanner(System.in);
        System.out.println("Ingresa tu tercera nota:");
        int n3 = u.nextInt();

        float prom = (float) (n1 + n2 + n3) / 3;

        //Results
        System.out.println("Tu nombre de estudiante es: " + student);
        System.out.println("El promedio es: " + prom);

        if (prom < 13) {
            System.out.println("Estas desaprobado");
        } else {
            System.out.println("Has aprobado");
        }
    }
}
