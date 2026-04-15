package org.example.usuarios;

import org.example.entidades.Cuenta;
import org.example.entidades.Solicitud;
import org.example.entidades.Usuario;

public class Cliente extends Usuario {
    private static int contador = 1;

    public Cliente(String username, String password) {
        super(contador++, 101, username, password);
    }


    /*public void solicitarCuenta(Administrador administrador){
        Solicitud solicitud = new Solicitud()
    }*/
}
