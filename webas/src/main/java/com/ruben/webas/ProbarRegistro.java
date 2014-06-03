package com.ruben.webas;
public class ProbarRegistro {

    public static void main(String[] args) {
        Mascota p= new Perro();
        p.setNombre("Sultan");
        
        System.out.println((p.getPerro().getNombre()));
                
    }
}
