package org.example.logicacuentas;

public class CuentaCorriente extends TipoCuenta{
    public CuentaCorriente(int idTipoCuenta, String nombreDeTipoCuenta) {
        super(idTipoCuenta, nombreDeTipoCuenta);
    }

    @Override
    public void calcularComisionPorMantenimiento() {

    }

    @Override
    public void calcularIntereses() {

    }
}
