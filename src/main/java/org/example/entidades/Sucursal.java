package org.example.entidades;

import org.example.logicacuentas.TipoCuenta;
import org.example.usuarios.Administrador;
import org.example.usuarios.Cliente;
import org.example.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Sucursal
{
    private int idSucursal;
    private String direccion;
    private Administrador administrador;
    private List<Cuenta> cuentas;
    private List<Cliente> clientes;

    public Sucursal(int idSucursal, String direccion, Administrador administrador) {
        this.idSucursal = idSucursal;
        this.direccion = direccion;
        this.administrador = administrador;
        this.cuentas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void crearCuenta(Cuenta cuenta) //posible tipo cuenta
    {
        cuentas.add(cuenta);
        System.out.println("Cuenta creada correctamente"); //ejecutar un if
    }

    public void solicitudCrearCuenta(int idCliente)
    {
        Solicitud solicitud = new Solicitud(buscarCliente(idCliente));
        administrador.agregarSolicitud(solicitud);
    }

    public void buscarCuenta(int idCuenta)
    {

    }

    public Cliente buscarCliente(int idCliente)
    {
        return clientes.stream()
                .filter(c -> c.getIdUsuario() == idCliente)
                .findFirst()
                .orElse(null);
    }
}
