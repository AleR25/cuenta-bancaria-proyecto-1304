package org.example.menu;

import org.example.entidades.Sucursal;

import java.util.Scanner;

public class AdminController
{
    private Sucursal sucursal;

    public AdminController(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void iniciar(Scanner teclado) {
        int opcion;

        do {
            System.out.println("\n--- PANEL ADMIN ---");
            System.out.println("1. Gestionar solicitudes");
            System.out.println("2. Buscar cliente");
            System.out.println("0. Salir");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    gestionarSolicitudes();
                    break;
                case 2:
                    buscarCliente();
                    break;
            }

        } while (opcion != 0);
    }

    private void gestionarSolicitudes() {
        sucursal.getAdministrador().mostrarSolicitudesPendientes();
    }

    private void buscarCliente() {
        System.out.println("Lógica para buscar cliente...");
    }
}
