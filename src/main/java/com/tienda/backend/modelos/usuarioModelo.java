package com.tienda.backend.modelos;

import javax.persistence.*;

@Entity
@Table(name = "tbl_usuarios")
public class usuarioModelo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id_usario;
    private String rol;
    private String usuario;
    private String contrasena;

    public Integer getId_usario() {
        return id_usario;
    }

    public void setId_usario(Integer id_usario) {
        this.id_usario = id_usario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
