package org.example.entidades;

import org.example.builder.CuentaBuilder;
import org.example.logicacuentas.TipoCuenta;

import java.util.ArrayList;
import java.util.List;

public class Sucursal
{
    private int idSucursal;
    private String direccion;
    private List<Cuenta> cuenta;

    public Sucursal(int idSucursal, String direccion) {
        this.idSucursal = idSucursal;
        this.direccion = direccion;
        this.cuenta = new ArrayList<>();
    }

    public void crearCuenta(String titular, TipoCuenta tipoCuenta, String pass) //posible tipo cuenta
    {
        Cuenta cuentaBancaria = new CuentaBuilder()
                .setTitular(titular)
                .setTipoDeCuenta(tipoCuenta)
                .setPass(pass)
                .build();
    }
}
