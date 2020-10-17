package main;

import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int opcion = 0;
        do {
            System.out.println("Cuantos numeros quieres dar para tu rango?");
            System.out.println("[0] Ningun numero");
            System.out.println("[1] Un numero");
            System.out.println("[2] Dos numeros");
            System.out.println("[3] Salir");
            opcion = sc.nextInt();
            evaluaOpcion(opcion);
        } while(opcion != 3);
    }

    public static void evaluaOpcion(int opcion) {
        Rango r;
        switch (opcion) {
            case 0:
                r = new Rango();
                System.out.println("Los numero entre el rango son: " + r.obtieneNumerosEnRango());
                break;
            case 1:
                int limite = obtieneNumero();
                r = new Rango(limite);
                System.out.println("Los numero entre el rango son: " + r.obtieneNumerosEnRango());
                break;
            case 2:
                int inicial = obtieneNumero();
                int finall = obtieneNumero();
                r = new Rango(inicial, finall);
                System.out.println("Los numero entre el rango son: " + r.obtieneNumerosEnRango());
                break;
        }
    }

    public static int obtieneNumero() {
        System.out.println("Inserte su numero:");
        return sc.nextInt();
    }

}
