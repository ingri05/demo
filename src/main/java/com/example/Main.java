package com.example;

public class Main {
    public static void main(String[] args) {
        TreeUser redSocial = new TreeUser();
        
        // Insertar usuarios
        redSocial.insert("Carlos");
        redSocial.insert("Ana");
        redSocial.insert("Pedro");
        redSocial.insert("María");
        redSocial.insert("Zara");
        
        // Buscar usuarios
        System.out.println("¿Existe el usuario Pedro? " + redSocial.search("Pedro")); // true
        System.out.println("¿Existe el usuario Juan? " + redSocial.search("Juan"));   // false
        
        // Recorrer en pre-orden
        System.out.println("Usuarios en pre-orden:");
        redSocial.preOrder();  // Carlos, Ana, María, Pedro, Zara
    }
}
