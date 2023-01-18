import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------IF-----------");
        int numeroIf = -5;
        if (numeroIf > 0) {
            System.out.println("La variable numeroIf es: Positivo");
        } else if (numeroIf == 0) {
            System.out.println("La variable numeroIf es: 0");

        } else {
            System.out.println("La variable numeroIf es: Negativo");
        }
        System.out.println("------WHILE-----------");
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("------DO-WHILE----------");
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);
        System.out.println("------FOR----------");
        for(int numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("------SWITCH-----------");
        Scanner lectura= new Scanner(System.in);

        System.out.println("Introduzca una estación");

        String estacion = lectura.nextLine();
        switch (estacion){
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            default:
                System.out.println("El valor no es una estación");
        }

    }
}