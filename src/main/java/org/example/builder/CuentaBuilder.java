package org.example.builder;

public class CuentaBuilder {
    private int contador = 0;

    private int id;
    private String titular;
    private double saldo = 0;
    private boolean activa = true;
    private TipoCuenta tipoDeCuenta;
    private String pass;

    public CuentaBuilder setId(int id) {
        this.id = contador++;
        return this;
    }

    public CuentaBuilder setTitular(String titular) {
        this.titular = titular;
        return this;
    }

    public CuentaBuilder setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    public CuentaBuilder setActiva(boolean activa) {
        this.activa = activa;
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
}
