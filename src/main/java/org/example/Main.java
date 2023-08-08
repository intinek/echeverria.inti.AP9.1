package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.println("Hola, mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " años.");

        // Ejercicio 2: Encontrar el mayor de tres números
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);

        // Ejercicio 3: Determinar paridad de un número
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado es PAR.");
        } else {
            System.out.println("El número ingresado es IMPAR.");
        }

        // Ejercicio 4: Comparar cadenas
        scanner.nextLine();
        System.out.print("Ingresa la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingresa la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas ingresadas son IGUALES.");
        } else {
            System.out.println("Las cadenas ingresadas NO SON IGUALES.");
        }

        // Ejercicio 5: Almacenar números hasta 0
        List<Integer> numeros = new ArrayList<>();
        int numeroIngresado;
        do {
            System.out.print("Ingresa un número (0 para terminar): ");
            numeroIngresado = scanner.nextInt();
            numeros.add(numeroIngresado);
        } while (numeroIngresado != 0);




        // Ejercicio 7: Función para determinar paridad en forma de texto
        scanner.nextLine();
        System.out.print("Ingresa un número entero: ");
        int numParImpar = scanner.nextInt();
        scanner.nextLine();
        String paridadTexto = obtenerParidadTexto(numParImpar);
        System.out.println("El número ingresado es " + paridadTexto + ".");

        // Ejercicio 8: Función para determinar si un número es primo
        System.out.print("Ingresa un número: ");
        int numPrimo = scanner.nextInt();
        boolean esPrimo = esNumeroPrimo(numPrimo);
        if (esPrimo) {
            System.out.println("El número ingresado es PRIMO.");
        } else {
            System.out.println("El número ingresado NO ES PRIMO.");
        }

        // Ejercicio 9: Función para sumar números impares en una colección
        int sumaImpares = sumarNumerosImpares(numeros);
        System.out.println("La suma de los números impares es: " + sumaImpares);

        // Ejercicio 10: Función para imprimir pares y sumar primos en una colección
        imprimirParesYSumarPrimos(numeros);

        // Ejercicio 11: Imprimir menú de calculadora
        imprimirMenuCalculadora();


    }



    // Función para obtener paridad en forma de texto
    public static String obtenerParidadTexto(int numero) {
        return numero % 2 == 0 ? "PAR" : "IMPAR";
    }

    // Función para determinar si un número es primo
    public static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para sumar números impares en una colección
    public static int sumarNumerosImpares(List<Integer> numeros) {
        int suma = 0;
        for (int num : numeros) {
            if (num % 2 != 0) {
                suma += num;
            }
        }
        return suma;
    }

    // Función para imprimir pares y sumar primos en una colección
    public static void imprimirParesYSumarPrimos(List<Integer> numeros) {
        int sumaPrimos = 0;
        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            if (esNumeroPrimo(num)) {
                sumaPrimos += num;
            }
        }
        System.out.println("\nLa suma de los números primos es: " + sumaPrimos);
    }

    // Función para imprimir menú de calculadora
    public static void imprimirMenuCalculadora() {
        System.out.println("Calculadora");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");}


    }