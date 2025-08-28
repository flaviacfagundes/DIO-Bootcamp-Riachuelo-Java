package br.com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Insira seu nome:");
        String name = scanner.next();
        System.out.println("Insira sua idade:");
        int age = scanner.nextInt();
        System.out.printf("Seja bem-vindo, %s! Você tem %s anos de idade!", name, age);
    }
}
