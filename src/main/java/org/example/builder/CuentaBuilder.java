package org.example.builder;

import org.example.entidades.Cuenta;
import org.example.logicacuentas.TipoCuenta;

public class CuentaBuilder {
    private int contador = 0;

    private int idCuenta;
    private String titular;;
    private TipoCuenta tipoDeCuenta;
    private String pass;

    public CuentaBuilder setTitular(String titular) {
        this.titular = titular;
        return this;
    }

    public CuentaBuilder setTipoDeCuenta(TipoCuenta tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
        return this;
    }

    public CuentaBuilder setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public Cuenta build()
    {
        return new Cuenta(titular, tipoDeCuenta, pass);
    }
}
