package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
       double Numero, NumeroCuadrado, NumeroCubo;
       // Crear método entrada
        Scanner entrada = new Scanner(System.in);
        // Leer el número
        Numero = entrada.nextDouble();
        // Elevar el número al cuadrado y cubo
        NumeroCuadrado = Math.pow(Numero, 2);
        NumeroCubo = Math.pow(Numero, 3);
        // Salidas
        System.out.println("El número: " + Numero);
        System.out.println("El número al cuadrado: " + NumeroCuadrado);
        System.out.println("El número al cubo: " + NumeroCubo);
    }
}