package org.example.entidades;

public class Usuario {
    private int idUsuario;
    private int codRol;
    private String username;
    private String password;

    public Usuario(int idUsuario, int codRol, String username, String password) {
        this.idUsuario = idUsuario;
        this.codRol = codRol;
        this.username = username;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public boolean autenticar(String username, String password)
    {
        return
                this.username.equalsIgnoreCase(username)
                        && this.password.equalsIgnoreCase(password);
    }

}
