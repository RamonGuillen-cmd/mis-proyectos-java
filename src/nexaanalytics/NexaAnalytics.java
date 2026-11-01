/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author JUGA
 */
    package nexaanalytics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Evidencia de Aprendizaje
 * Programa de Estructura de Repetición
 * Nexa Analytics
 *
 * @author JUGA
 */
public class NexaAnalytics {

    // Variables globales (ámbito de clase)
    static int contadorEjercicio1 = 0;
    static int contadorEjercicio2 = 0;
    static int contadorEjercicio3 = 0;

    // Constante
    static final int SEGUNDOS_DEMOSTRACION = 10;

    // Scanner global
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\n===========================================");
            System.out.println(" Nexa Analytics: Descanso Ocular");
            System.out.println(" Un recordatorio cada 20 minutos");
            System.out.println("===========================================");
            System.out.println("1. Real (esperar 20 minutos reales)");
            System.out.println("2. Demostración (esperar 10 segundos)");
            System.out.println("0. Salir del sistema");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    modoReal();
                    break;

                case 2:
                    modoDemostracion();
                    break;

                case 0:
                    System.out.println("\nSistema cerrado.");
                    System.out.println("Cuida tu vista.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        teclado.close();
    }

    /*
     * Método con retorno
     * Obtiene la hora actual del sistema
     */
    public static String obtenerHoraSistema() {

        LocalTime hora = LocalTime.now();

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        return hora.format(formato);
    }

    /*
     * Método con parámetros y retorno
     */
    public static String nombreEjercicio(int numero) {

        switch (numero) {

            case 1:
                return "Parpadeo consciente";

            case 2:
                return "Cambio de enfoque cerca-lejos";

            case 3:
                return "Recorrido de las cuatro esquinas";

            default:
                return "No definido";
        }
    }

    public static void modoReal() {

        System.out.println("\nInicio de jornada (hora del sistema): "
                + obtenerHoraSistema());

        System.out.println("Modo real seleccionado.");
        System.out.println("El sistema emitiría recordatorios cada 20 minutos.");
    }

    public static void modoDemostracion() {

        System.out.println("\nInicio de jornada (hora del sistema): "
                + obtenerHoraSistema());

        System.out.println("\nPrimer recordatorio");
        ejecutarEjercicio(1);

        System.out.println("\nSegundo recordatorio");
        ejecutarEjercicio(2);

        System.out.println("\nTercer recordatorio");
        ejecutarEjercicio(3);

        mostrarEstadisticas();
    }

    /*
     * Método con parámetro
     */
    public static void ejecutarEjercicio(int ejercicio) {

        System.out.println("Ejercicio: "
                + nombreEjercicio(ejercicio));

        if (ejercicio == 1) {

            contadorEjercicio1++;

            System.out.println("\nPARPADEO CONSCIENTE (00:30)");
            System.out.println("Parpadea lentamente 10 veces.");

        } else if (ejercicio == 2) {

            contadorEjercicio2++;

            System.out.println("\nCAMBIO DE ENFOQUE CERCA-LEJOS (01:00)");
            System.out.println("Alterna la mirada entre un objeto cercano y uno lejano.");

        } else {

            contadorEjercicio3++;

            System.out.println("\nRECORRIDO DE LAS CUATRO ESQUINAS (01:00)");
            System.out.println("Recorre visualmente las cuatro esquinas.");

        }

        cronometro(SEGUNDOS_DEMOSTRACION);

        System.out.println("Ejercicio completado.");
    }

    /*
     * Método con parámetro
     * Ciclo FOR
     */
    public static void cronometro(int segundos) {

        for (int i = 1; i <= segundos; i++) {

            System.out.println("Cronómetro: "
                    + String.format("%02d", i)
                    + " / "
                    + String.format("%02d", segundos));
        }
    }

    /*
     * Método estático solicitado
     * Ciclo WHILE
     */
    public static void mostrarEstadisticas() {

        System.out.println("\n=================================");
        System.out.println("RESUMEN DE EJECUCIÓN");
        System.out.println("=================================");

        int contador = 1;

        while (contador <= 3) {

            switch (contador) {

                case 1:
                    System.out.println("El ejercicio 1 se repitió "
                            + contadorEjercicio1 + " veces.");
                    break;

                case 2:
                    System.out.println("El ejercicio 2 se repitió "
                            + contadorEjercicio2 + " veces.");
                    break;

                case 3:
                    System.out.println("El ejercicio 3 se repitió "
                            + contadorEjercicio3 + " veces.");
                    break;
            }

            contador++;
        }

        System.out.println("\nSistema cerrado.");
        System.out.println("Cuida tu vista.");
    }
}
    

