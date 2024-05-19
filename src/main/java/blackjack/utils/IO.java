/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack.utils;

import java.util.Scanner;

/**
 * Classe estática que dispara métodos de leitura e validação de types de dados
 * básicos
 *
 * @author aluno
 */
public class IO {

    private static Scanner scan = new Scanner(System.in);

    /**
     * Método que recebe uma string de entrada a ser exebida e retorna uma
     * string lida do teclado
     *
     * @param msg mensagem a ser exibida antes da leitura
     * @return uma string lida do teclado
     */
    public static String readString(String msg) {
        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    /**
     * Método que retorna uma string lida do teclado
     *
     * @return uma string lida do teclado
     */
    public static String readString() {
        String entrada = scan.nextLine();
        return entrada;
    }

    /**
     * Método que realiza a leitura de um inteiro validado
     *
     * @param msg mensagem a ser exibida antes da leitura
     * @return um inteiro lido do teclado
     */
    public static int readInt(String msg) {
        int entrada = 0;
        while (true) {
            try {
                System.out.println(msg);
                entrada = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um valor inteiro...");
            }
        }
        return entrada;
    }

    /**
     * Método que realiza a leitura de um inteiro validado
     *
     * @return um inteiro lido do teclado
     */
    public static int readInt(){
        int entrada = 0;
        while (true) {
            try {
                entrada = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um valor inteiro...");
            }
        }
        return entrada;
    }

    /**
     * Método que realiza a leitura de um float validado
     *
     * @param msg mensagem a ser exibida antes da leitura
     * @return um float lido do teclado
     */
    public static float readFloat(String msg) {
        float entrada = 0;
        while (true) {
            try {
                System.out.println(msg);
                entrada = Float.parseFloat(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um valor inteiro...");
            }
        }
        return entrada;
    }

    /**
     * Método que realiza a leitura de um float validado
     *
     *
     * @return um float lido do teclado
     */
    public static float readFloat() {
        float entrada = 0;
        while (true) {
            try {
                entrada = Float.parseFloat(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um valor inteiro...");
            }
        }
        return entrada;
    }

    /**
     * Método que realiza a leitura de um double validado
     *
     * @param msg mensagem a ser exibida antes da leitura
     * @return um double lido do teclado
     */
    public static double readDouble(String msg) {
        double entrada = 0;
        while (true) {
            try {
                System.out.println(msg);
                entrada = Double.parseDouble(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um valor inteiro...");
            }
        }
        return entrada;
    }

    /**
     * Método que realiza a leitura de um double validado
     *

     * @return um double lido do teclado
     */
    public static double readDouble() {
        double entrada = 0;
        while (true) {
            try {
                entrada = Double.parseDouble(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um valor inteiro...");
            }
        }
        return entrada;
    }

    /**
     * Imprime em tela uma string ou o .toString() de um objeto qualquer
     * @param obj objeto a ser impresso
     */
    public static void print(Object obj){
        System.out.println(obj.toString());
    }

}
