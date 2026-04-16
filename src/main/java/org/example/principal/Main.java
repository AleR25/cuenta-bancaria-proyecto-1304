package org.example.principal;

import org.example.entidades.Banco;
import org.example.entidades.Cuenta;
import org.example.entidades.Sucursal;
import org.example.usuarios.Administrador;
import org.example.usuarios.Cliente;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //int
        Scanner teclado2 = new Scanner(System.in);//String

        Sucursal sucursalSeleccionada = null;

        Banco financier = new Banco("Financier");
        System.out.println(financier);

        Banco galitcia = new Banco("Galitcia");
        System.out.println(galitcia);

        financier.contratarAdministrador("Juan", "juan123", "Holamundo123");
        System.out.println(financier);

        financier.crearSucursal("Av cordoba", financier.getAdministradores().get(0));
        System.out.println(financier);

        financier.eliminarSucursal(1);
        System.out.println(financier);

        financier.crearSucursal("Av cordoba", financier.getAdministradores().get(0));
        System.out.println(financier);

        /*       VALIDACIONES PARA BANCO*/

        /*COMENZAMOS REALIZANDO EL MENU*/
        System.out.println(
                "BIENVENIDO AL BANCO FINANCIER" +
                "ELIJA EL NUMERO DE LA SUCURSAL A LA QUE ESTA ASOCIADO"
        );

        while (sucursalSeleccionada == null) {
            System.out.print("Ingrese el ID de la sucursal: ");
            int idInput = teclado.nextInt();

            Optional<Sucursal> resultado = financier.seleccionarSucursal(idInput);

            if (resultado.isPresent()) {
                sucursalSeleccionada = resultado.get();
                System.out.println("Sucursal encontrada");
            } else {
                System.out.println("Error: El ID " + idInput + " no fue encontrado. Intente de nuevo.");
                // Al no asignar nada a sucursalSeleccionada, el while vuelve a empezar
            }
        }

        System.out.println("1. SOY ADMINISTRADOR");
        System.out.println("2. SOY CLIENTE");

        int perfil = teclado.nextInt();

        while(perfil != 1 || perfil != 2)
        {
            if (perfil == 1 || perfil == 2) {
                // El proceso de login es el mismo para ambos, lo que cambia es el rol
                System.out.print("Ingrese su nombre de usuario: ");
                String username = teclado2.nextLine();

                System.out.print("Ingrese su contraseña: ");
                String password = teclado2.nextLine();

                if (perfil == 1) {
                    System.out.println("Iniciando sesión como Administrador...");
                    // Lógica para admin
                } else {
                    System.out.println("Iniciando sesión como Cliente...");
                    // Lógica para cliente
                }
            } else {
                System.out.println("Opción no válida. Finalizando programa");
                // Aquí podrías meter esto dentro de otro bucle si querés forzar la elección
            }
        }


    }
}