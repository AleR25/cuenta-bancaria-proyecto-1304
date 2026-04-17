package org.example.principal;

import org.example.entidades.Banco;
import org.example.entidades.Cuenta;
import org.example.entidades.Sucursal;
import org.example.menu.AdminController;
import org.example.usuarios.Administrador;
import org.example.usuarios.Cliente;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Sucursal sucursalSeleccionada = null;

        Banco financier = new Banco("Financier");
        Banco galitcia = new Banco("Galitcia");

        financier.contratarAdministrador("Juan", "juan123", "Holamundo123");
        financier.contratarAdministrador("Pedro", "pedro123", "HolaMundo123");

        financier.crearSucursal("Av cordoba", financier.getAdministradores().get(0));
        financier.crearSucursal("Av corrientes", financier.getAdministradores().get(1));

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

        /*SELECCION DE TIPO DE CLIENTE*/
        while (true) {
            System.out.println("1. SOY ADMINISTRADOR");
            System.out.println("2. SOY CLIENTE");

            int perfil = teclado.nextInt();
            teclado.nextLine();

            if (perfil != 1 && perfil != 2) {
                System.out.println("Opción inválida");
                continue;
            }

            System.out.print("Usuario: ");
            String username = teclado.nextLine();

            System.out.print("Contraseña: ");
            String password = teclado.nextLine();

            if (perfil == 1) {
                if (sucursalSeleccionada.getAdministrador().autenticar(username, password)) {
                    AdminController controller = new AdminController(sucursalSeleccionada);
                    controller.iniciar(teclado);
                }
            } else {
                System.out.println("Login cliente (pendiente)");
            }
        }
    }
}