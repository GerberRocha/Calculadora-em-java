package br.com.dio.calculadoraJava;
import java.util.Scanner;

public class Calculadora {


           public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            float a, b;

            System.out.print("Digite o primeiro valor: ");
            a = scan.nextFloat();
            System.out.print("Digite o segundo valor: ");
            b = scan.nextFloat();

            float soma = soma(a,b);
            float subtracao = subtracao(a,b);
            float divisao = divisao(a,b);
            float multiplicacao = multiplicacao(a,b);

            System.out.println("soma " + soma);
            System.out.println("subtracao " + subtracao);
            System.out.println("divisao " + divisao);
            System.out.println("multiplicacao " + multiplicacao);

        }
        public static float soma(float a, float b) {
            return a + b;
        }
        public static float subtracao(float a, float b) {
            return a - b;
        }
        public static float divisao(float a, float b) {
            return a / b;
        }
        public static float multiplicacao(float a, float b) {
            return a * b;
        }

    }

