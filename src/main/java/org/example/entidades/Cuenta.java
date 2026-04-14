package org.example.entidades;

import org.example.logicacuentas.TipoCuenta;

public class Cuenta {
    private int contador = 0;
    private int idCuenta;
    private String titular;
    private double saldo;
    private boolean activa;
    private TipoCuenta tipoDeCuenta;
    private String pass;

    /*
    * para que un usuario pueda realizar cualquier operacion la
    * cuenta tiene que estar activa
    * */

    public Cuenta(String titular, TipoCuenta tipoDeCuenta, String pass) {
        this.idCuenta = contador++;
        this.titular = titular;
        this.saldo = 0;
        this.activa = true;
        this.tipoDeCuenta = tipoDeCuenta;
        this.pass = pass;
    }

    public void depositar(double monto)
    {
        if (monto > 0 && activa == true)
        {
            sumarSaldo(monto);
            System.out.println("El saldo actual de " + this.titular + " es de: " + this.saldo);
        }
        else if(monto < 0 && activa == false)
        {
            System.out.println("El monto a depositar en la cuenta de " + this.titular + " es insuficiente");
        }
        else
        {
            System.out.println("Su cuenta esta inavilitada para hacer esta operación");
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
