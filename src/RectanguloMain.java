import java.util.Scanner;
//Calcualar el area de un rectangulo utilizando la
//programacion orientada a objetos

public class RectanguloMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Cual es el valor de la base?: ");
        int base = entrada.nextInt();


        System.out.println("Cual es el valor de la Altura?: ");
        int altura = entrada.nextInt();

        Rectangulo mensaje = new Rectangulo(base, altura);
        mensaje.imprimir();



    }
}
