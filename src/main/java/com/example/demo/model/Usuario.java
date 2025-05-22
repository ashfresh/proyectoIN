package com.example.demo.model; // ajusta según tu estructura

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUsuario")
    private Integer idUsuario;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "Correo", nullable = false, length = 100, unique = true)
    private String correo;

    @Column(name = "Contrasenia", nullable = false, length = 255)
    private String contrasenia;

    @Column(name = "Direccion", nullable = false, length = 255)
    private String direccion;

    @Column(name = "Telefono", nullable = false, length = 20)
    private String telefono;

    @Column(name = "Rol", nullable = false, length = 50)
    private String rol;

    // Constructor vacío requerido por JPA
    public Usuario() {
    }

    // Getters y Setters

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}