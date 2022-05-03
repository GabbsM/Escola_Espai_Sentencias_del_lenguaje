import java.util.Scanner;

public class Problema1 {
    //Problema 1
    //Haz un programa que según el valor de x (un valor entrado por teclado), indique si es mayor que 10
    //con un mensaje “demasiado alto” o menor que 10 con el mensaje “demasiado bajo”.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 10;
        int numUsuario;
        System.out.println("Indica un numero: ");
        numUsuario = sc.nextInt();

        if (numUsuario<num){
            System.out.println("El numero " + numUsuario + " es demasiado bajo");
        }else {
            System.out.println("El numero " + numUsuario + " es demasiado alto");
        }

    }
}
