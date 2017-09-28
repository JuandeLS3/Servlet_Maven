package com.aula114;

 public class Persona{

    String nombre;
    String apellido;
    String pais;
    String correo;

    public Persona(String nombre, String apellido, String pais, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.correo = correo;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
   
    public String getCorreo(){
        return correo;
    }
     public void setCorreo(String correo) {
        this.correo = correo;
    }
}
