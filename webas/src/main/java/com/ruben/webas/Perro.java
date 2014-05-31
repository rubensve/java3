package com.ruben.webas;
public class Perro {
private String nombre;

public void setNombre(String nombre){
    this.nombre= nombre;
}

public String getNombre(){
    return nombre;
}


public String obtenerRegistro(){
    return "El perrito que registraste es: "+nombre;
}

}
