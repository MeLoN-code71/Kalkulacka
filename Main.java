import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operace;
        String pokracovat;
        double result = 0;
        try {
            System.out.println("Vítejte v kalkulačce v Joudíně");
            System.out.print("Zadej první číslo: ");
            num1 = sc.nextDouble();
            System.out.print("Zadej operaci (+, -, *, /): ");
            operace = sc.next().charAt(0);
            System.out.print("Zadej druhé číslo: ");
            num2 = sc.nextDouble();
            sc.nextLine();
            System.out.print("Cheš přidat další číslo? (ano nebo ne): ");
            pokracovat = sc.nextLine();
            if (pokracovat.equalsIgnoreCase("ne")) {
                if (operace == '+') {
                    result = num1 + num2;
                    System.out.println("Výsledek: " + result);
                } else if (operace == '-') {
                    result = num1 - num2;
                    System.out.println("Výsledek: " + result);
                } else if (operace == '*') {
                    result = num1 * num2;
                    System.out.println("Výsledek: " + result);
                } else if (operace == '/') {
                    result = num1 / num2;
                    System.out.println("Výsledek: " + result);
                }
                else {
                    System.out.println("Neplatná operace!");
                }
            }
            while (pokracovat.equalsIgnoreCase("ano")) {
                System.out.print("Zadej operaci (+, -, *, /): ");
                operace = sc.next().charAt(0);
                System.out.print("Zadej další číslo: ");
                double num3 = sc.nextDouble();
                sc.nextLine();
                System.out.print("Cheš přidat další číslo? (ano nebo ne): ");
                pokracovat = sc.nextLine();
                if (operace == '+') {
                    result += num3;
                }
                else if (operace == '-') {
                    result -= num3;
                }
                else if (operace == '*') {
                    result *= num3;
                }
                else if (operace == '/') {
                    result /= num3;
                }
                else {
                    System.out.println("Neplatná operace!");
                }
                System.out.println("Výsledek: " + result);
            }
        }
        catch (Exception e){
            System.out.println("Máš v tom chybu joudo!");
        }
        sc.close();
    }
}