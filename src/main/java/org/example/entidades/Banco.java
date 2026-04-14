package org.example.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco
{
    private String nombre;
    private List<Sucursal> sucursales;

    public Banco(String nombre, List<Sucursal> sucursales) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal)
    {
        sucursales.add(sucursal);
    }

    public void eliminarSucursal(int id)
    {

    }
}
