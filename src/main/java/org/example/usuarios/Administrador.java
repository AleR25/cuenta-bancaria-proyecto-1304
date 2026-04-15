package org.example.usuarios;

import org.example.entidades.Solicitud;
import org.example.entidades.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario {

    private static int contador = 1;
    private List<Solicitud> solicitudes= new ArrayList<>();

    public Administrador(String username, String password)
    {
        super(contador++, 102, username, password);
    }

    public void agregarSolicitud(Solicitud solicitud)
    {
        this.solicitudes.add(solicitud);
    }
}
