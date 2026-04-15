package org.example.principal;

import org.example.entidades.Banco;
import org.example.entidades.Cuenta;
import org.example.usuarios.Administrador;
import org.example.usuarios.Cliente;

public class Main {
    public static void main(String[] args) {

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

        financier.buscarSucursal(2);
    }
}