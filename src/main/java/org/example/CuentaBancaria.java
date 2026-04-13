package org.example;

public class CuentaBancaria{
    public String nombre;
    public String direccion;
    public String tipoCuenta;
    public Double saldo;
    public int id;

    public CuentaBancaria(String direccion, String nombre, String tipoCuenta, int id) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.saldo = (double) 0;
        this.id = id;
    }

    private Boolean saldoDisponible(Double monto)
    {
        Boolean tieneSaldo = false;
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

    public void enviarSaldo(double monto, CuentaBancaria cuentaRemitente, CuentaBancaria cuentaDestinataria)
    {
        /*
        * El monto a enviar tiene que ser mayor al saldo del Remitente
        * el saldo actualiado se tiene que mostrar en pantalla
        * */
        if (cuentaRemitente.saldoDisponible(cuentaRemitente.saldo)
                && cuentaRemitente.id != cuentaDestinataria.id)
        {
            cuentaRemitente.restarSaldo(monto);
            System.out.println("El saldo actualizado en la cuenta del Remitente: "
                    + cuentaRemitente.nombre
                    + "es de: "
                    + cuentaRemitente.saldo);

            cuentaDestinataria.sumarSaldo(monto);
            System.out.println("El saldo actualizado en la cuenta del Destinatario: "
                    + cuentaDestinataria.nombre
                    + " es: "
                    + cuentaDestinataria.saldo);
        }
        else if (!cuentaRemitente.saldoDisponible(cuentaRemitente.saldo)
                && cuentaRemitente.id != cuentaDestinataria.id)
        {
            System.out.println("No cuenta con los fondos sufientes para realizar la transferencia");
        }
        else
        {
            System.out.println("Transferir a una misma cuenta es un movimiento invalido");
        }
    }

    public void depositoEnCuenta(Double monto)
    {
        if (monto > 0)
        {
            sumarSaldo(monto);
            System.out.println("El saldo actual de " + this.nombre + " es de: " + this.saldo);
        }
        else
        {
            System.out.println("El monto a depositar en la cuenta de " + this.nombre + " es insuficiente");
        }
    }

    public void extraccionDeSaldo(Double monto)
    {
        if (monto > 0 && saldoDisponible(monto))
        {
            restarSaldo(monto);
            System.out.println("El saldo actual de "
                    + this.nombre
                    + " es de: " + this.saldo);

            System.out.println("El monto entregado a "
                    + this.nombre
                    + " es de: " + monto);
        }
        else
        {
            System.out.println("El monto a extraer de la cuenta de "
                    + this.nombre
                    + " es mas del que posee en la cuenta");
        }
    }
}
