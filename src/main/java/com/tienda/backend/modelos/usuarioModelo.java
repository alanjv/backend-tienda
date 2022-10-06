package com.tienda.backend.modelos;

import javax.persistence.*;

@Entity
@Table(name = "tbl_usuarios")
public class usuarioModelo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer idtbl_usario;
    private String usuario;
    private String contrasena;

    public Integer getId_usario() {
        return idtbl_usario;
    }

    public void setId_usario(Integer id_usario) {
        this.idtbl_usario = id_usario;
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
