package com.ruben.webas;

public class Gato {
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
