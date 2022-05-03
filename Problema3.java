import java.util.Scanner;

public class Problema3 {
    //Problema 3
    //Haz un programa que decida, según el dinero que tengamos, si vamos al videoclub, al cine o nos
    //vamos “al parque…”. Nota: usa condicionales “anidados”.
    public static void main(String[] args) {

        int miDinero;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Cuanto dinero tienes? ");
        miDinero = sc.nextInt();

        if (miDinero > 9){
            System.out.println("Vamos al cine");

        }else if(miDinero > 3 && miDinero< 9){
            System.out.println("Vamos al videoclub");
        }else {
            System.out.println("Nos vamos al parque!");
        }
    }
}
