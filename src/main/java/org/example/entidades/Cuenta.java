package org.example.entidades;

import org.example.logicacuentas.TipoCuenta;

public class Cuenta {
    private int id;
    private String titular;
    private double saldo;
    private boolean activa;
    private TipoCuenta tipoDeCuenta;
    private String pass;

    public Cuenta(int id, String titular, double saldo, boolean activa, TipoCuenta tipoDeCuenta, String pass) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
        this.activa = activa;
        this.tipoDeCuenta = tipoDeCuenta;
        this.pass = pass;
    }

    public void depositar(double monto)
    {
        if (monto > 0)
        {
            sumarSaldo(monto);
            System.out.println("El saldo actual de " + this.titular + " es de: " + this.saldo);
        }
        else
        {
            System.out.println("El monto a depositar en la cuenta de " + this.titular + " es insuficiente");
        }
    }

    public void retirar(double monto)
    {
        if (monto > 0 && puedeRetirar(monto))
        {
            restarSaldo(monto);
            System.out.println("El saldo actual de "
                    + this.titular
                    + " es de: " + this.saldo);

            System.out.println("El monto entregado a "
                    + this.titular
                    + " es de: " + monto);
        }
        else
        {
            System.out.println("El monto a extraer de la cuenta de "
                    + this.titular
                    + " es mas del que posee en la cuenta");
        }
    }

    public boolean puedeRetirar(double monto)
    {
        boolean tieneSaldo;
        if (this.saldo > monto)
        {
            tieneSaldo = true;
        }
        else
        {
            tieneSaldo = false;
        }
        return tieneSaldo;
    }

    private void restarSaldo(double monto)
    {
        this.saldo -= monto;
    }

    private void sumarSaldo(double monto)
    {
        this.saldo += monto;
    }
}
