package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        int opcion;
        double opcion2;

        CuentaBancaria cuenta1 = new CuentaBancaria
                (
                        "AV siempre viva 543",
                        "Juan",
                        "Corriente",
                        1
                );

        CuentaBancaria cuenta2 = new CuentaBancaria
                (
                        "AV cordoba 543",
                        "Pedro",
                        "Corriente",
                        2
                );

        CuentaBancaria cuenta3 = new CuentaBancaria
                (
                        "AV Alem viva 543",
                        "Alejandro",
                        "Corriente",
                        3
                );

        CuentaBancaria cuenta4 = new CuentaBancaria
                (
                        "AV Callao viva 543",
                        "Mateo",
                        "Corriente",
                        4
                );

        List<CuentaBancaria> cuentas = new  ArrayList<>();

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);

        System.out.println(
                "Bienvenido al sistema de gestión de usuarios "
                + " Ingrese el numero de la cuenta que desea gestionar"
        );
        System.out.println("1. Juan");
        System.out.println("2. Pedro");
        System.out.println("3. Alejandro");
        System.out.println("4. Mateo");

        opcion = teclado.nextInt();

        System.out.println("Elige que operación desea realizar");
        System.out.println("1.Transferencia");
        System.out.println("2. Deposito");
        System.out.println("3. Retiro");

        switch (opcion) {
            case 1:
                opcion = teclado.nextInt();

                if (opcion == 1)//transferencia: monto, remitente y destinatario
                {
                    System.out.println("Ingrese el monto a transferir: " );
                    opcion2 = teclado2.nextDouble();

                    System.out.println("Ingrese la cuenta a quien desea transferir: ");
                    System.out.println("1. Juan");
                    System.out.println("2. Pedro");
                    System.out.println("3. Alejandro");
                    System.out.println("4. Mateo");
                    opcion = teclado.nextInt();

                    cuenta1.enviarSaldo(opcion2, cuentas.get(1),cuentas.get(opcion));
                }
                else if (opcion == 2)
                {
                    System.out.println("Ingrese el monto a depositar: ");
                    opcion2 = teclado2.nextDouble();
                    cuenta1.depositoEnCuenta(opcion2);
                }
                else if ()
                {

                }
                break;

            case 2:
                System.out.println("Seleccionaste a Pedro");
                break;

            case 3:
                System.out.println("Seleccionaste a Alejandro");
                break;

            case 4:
                System.out.println("Seleccionaste a Mateo");
                break;

            default:
                System.out.println("Opción inválida");

        }


        cuenta1.depositoEnCuenta(1000.0);
        cuenta1.depositoEnCuenta(500.0);
    }
}