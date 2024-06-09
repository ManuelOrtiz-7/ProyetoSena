package main.java.ecom.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendedor")
public class vendedor {

    @Id
    @Column(name = "usuario")
    private int usuario;

    @Column(name = "nombre_vendedor")
    private String nombre_vendedor;

    @Column(name = "apellido_vendedor")
    private String apellido_vendedor;

    @Column(name = "contraseña")
    private int contraseña;

    @Column(name = "identificacion_vendedor")
    private int identificacion_vendedor;

    @Column(name = "numero_celular")
    private int numero_celular;

    public vendedor (){

    }

    public vendedor(String nombre_vendedor, String apellido_vendedor, int contraseña, int identificacion_vendedor, int numero_celular) {
        this.nombre_vendedor = nombre_vendedor;
        this.apellido_vendedor = apellido_vendedor;
        this.contraseña = contraseña;
        this.identificacion_vendedor = identificacion_vendedor;
        this.numero_celular = numero_celular;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getNombre_vendedor() {
        return nombre_vendedor;
    }

    public void setNombre_vendedor(String nombre_vendedor) {
        this.nombre_vendedor = nombre_vendedor;
    }

    public String getApellido_vendedor() {
        return apellido_vendedor;
    }

    public void setApellido_vendedor(String apellido_vendedor) {
        this.apellido_vendedor = apellido_vendedor;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getIdentificacion_vendedor() {
        return identificacion_vendedor;
    }

    public void setIdentificacion_vendedor(int identificacion_vendedor) {
        this.identificacion_vendedor = identificacion_vendedor;
    }

    public int getNumero_celular() {
        return numero_celular;
    }

    public void setNumero_celular(int numero_celular) {
        this.numero_celular = numero_celular;
    }

    @Override
    public String toString() {
        return "vendedor{" +
                "usuario=" + usuario +
                ", nombre_vendedor='" + nombre_vendedor + '\'' +
                ", apellido_vendedor='" + apellido_vendedor + '\'' +
                ", contraseña=" + contraseña +
                ", identificacion_vendedor=" + identificacion_vendedor +
                ", numero_celular=" + numero_celular +
                '}';
    }
}
