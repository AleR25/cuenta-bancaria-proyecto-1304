package org.example.usuarios;

import org.example.entidades.Solicitud;
import org.example.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {
    private List<Solicitud> solicitudes= new ArrayList<>();

    private static int contador = 1;

    public Administrador(String nombre, boolean asignado, String username, String password)
    {
        super(contador++, 102, nombre, asignado, username, password);
    }

    public void agregarSolicitud(Solicitud solicitud)
    {
        this.solicitudes.add(solicitud);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "solicitudes=" + solicitudes +
                '}';
    }
}
