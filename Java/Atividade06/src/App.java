import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int pin = 1234;

        System.out.println("Digite o número do pin");
        Scanner teclado = new Scanner(System.in);
        int digitarPin = teclado.nextInt();

        while (digitarPin != pin) {
            System.out.println("Pin incorreto, tente novamente.");
            digitarPin = teclado.nextInt();
        }

        if (digitarPin == pin) {
            System.out.println("O pin inserido está correto, você já tem acesso a sua conta");
        }

        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();

        // problema Dois da atividade 6
        System.out.println("Digite o número: ");
        int numero = teclado.nextInt();
        int resultado[] = new int[14];

        for (int i = 1; i <= 12; i++) {
            resultado[i] = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();

        CreateRectangle retangulo1 = new CreateRectangle();

        retangulo1.Rectangle(4, 3);

        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println();

        CreateTriangle triangulo1 = new CreateTriangle();

        triangulo1.triangle(3, 3);

    }
}
