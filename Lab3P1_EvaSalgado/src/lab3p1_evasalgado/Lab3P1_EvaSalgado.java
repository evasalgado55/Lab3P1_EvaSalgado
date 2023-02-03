/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p1_evasalgado;

import java.util.Scanner;

/**
 *
 * @author Eva Salgado
 */
//Lab3P1_EvaSalgado
public class Lab3P1_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        char resp = 's';

        while (resp == 's' || resp == 'S') { //Inicio ciclo Mientras
            System.out.println("1. Triangulos");
            System.out.println("2.Calculando PI");
            System.out.println("3. Construyendo casas");
            System.out.println("4. Salida");

            System.out.println("Ingrese una opción: ");
            opcion = leer.nextInt();

            switch (opcion) { //Inicio Caso
                case 1: {
                    System.out.println("Ingrese un numero para el tamaño de su triangulo, su numero debe estar entre el 4 al 16");
                    int n = leer.nextInt();
                    System.out.println("Ingrese el caracter para el triagulo superior: ");
                    char cara = leer.next().charAt(0);
                    int d = n;
                    if (n >= 4 && n <= 16) {
                        for (int a = 1; a <= n; a++) {
                            for (int b = d; b < 0; b--) {
                                System.out.print(" ");
                            }
                            for (int c = n; c >= a; c--) {
                                System.out.print(cara);
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Su numero ingresado es incorrecto");
                    }
                }
                break; //fin caso 1
                case 2: {
                    System.out.println("Ingrese el limite de la sumatoria: ");
                    int k = leer.nextInt();

                    int pi = 0, num = 0, n = 0, mult = 0, div = 0, sigma = 0;

                    for (int i = 0; k >= n; i = n) {
                        sigma = sigma + k + n;
                    }
                    if (num == -1) {

                        num = -1 * -1;

                    }
                    mult = 4 * sigma;
                    div = num / 2 * n + 1;

                    pi = mult * div;

                    System.out.println("La aproximación es: " + pi);
                }
                break; //fin de caso 2

                case 3: {
                    System.out.println("Inserte el tamaño de la figura: ");
                    int n = leer.nextInt();

                    int d = n;
                    int fila = n;
                    int columna = n;

                    if (n >= 4) {
                        int x = 0;
                        for (int a = 1; a <= n; a++) {
                            for (int b = d; b >= a; b--) {
                                System.out.print(" ");
                            }
                            for (int c = 1; c <= a; c++) {

                                System.out.print("*");

                            }
                            for (int i = 0; i < x; i++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            x++;

                        }

                        for (int e = 1 * 2; e <= fila; e++) {
                            for (int f = 1; f <= columna; f++) {
                                System.out.print(" ");
                                System.out.print("+");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Su numero ingresado es incorrecto: ");
                    }

                } //fin de caso 3
            }//fin del ciclo caso
            System.out.println("Quiere probar otra vez?[s/n]: ");
            resp = leer.next().charAt(0);
        }  // fin de ciclo mientras
        

    } //fin de menu

} //fin de algoritmo
