package org.example.entidades;

import org.example.builder.CuentaBuilder;

import java.util.ArrayList;
import java.util.List;

public class Sucursal
{
    private int id;
    private String direccion;
    private List<Cuenta> cuenta;

    public Sucursal(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
        this.cuenta = new ArrayList<>();
    }

    public void crearCuenta(String titular, ) //posible tipo cuenta
    {
        Cuenta cuentaBancaria = new CuentaBuilder()
                .setTitular(titular)
                .setTipoDeCuenta()
                .setPass()
                .build();
    }
}
