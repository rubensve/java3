package com.ruben.webas;
public class ProbarRegistro {

    public static void main(String[] args) {
        Perro p= new Perro();
        p.setNombre("Sultan");
        Persona p1= new Persona();
        p1.setPerro(p);
        
        System.out.println((p1.getPerro().getNombre()));
                
    }
}
