package org.example.entidades;

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

    public void crearCuenta() //posible tipo cuenta
    {
        /*
        * podría hacer dos listas con una condicional, en el caso
        * que quieran agregar una cuenta entra en la condicional y
        *  podría ser un loop según la cantidad de cuentas quieran
        *  agregar, cuando ingreso al loop, le agrego un ID pero al
        *  mismo tiempo en la otra lista agrego los datos de una cuenta
        * */

    }
}
