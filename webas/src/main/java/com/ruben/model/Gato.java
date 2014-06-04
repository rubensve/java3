package com.ruben.model;

public class Gato implements Mascota {
private String nombre;

public void setNombre(String nombre){
    this.nombre= nombre;
}

public String getNombre(){
    return nombre;
}


public String obtenerRegistro(){
    return "El gato que registraste es: "+nombre;
}

}    
