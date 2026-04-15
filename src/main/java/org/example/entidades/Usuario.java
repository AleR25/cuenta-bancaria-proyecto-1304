package org.example.entidades;

public class Usuario {
    private int idUsuario;
    private int codRol;
    private String username;
    private String password;

    public boolean autenticar(String username, String password)
    {
        return
                this.username.equalsIgnoreCase(username)
                && this.password.equalsIgnoreCase(password);
    }
}
