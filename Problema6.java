import java.util.Scanner;

public class Problema6 {
    //Problema 6
    //Presenta un menú al usuario donde pueda escoger 5 opciones. Si selecciona cualquiera de ellas,
    //muestra por pantalla: “has escogido la opción X”. Usa un switch.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Opcion 1");
        System.out.println("Opcion 2");
        System.out.println("Opcion 3");
        System.out.println("Opcion 4");
        System.out.println("Opcion 5");

        System.out.println();
        System.out.println("Escoge una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Has elegido la opcion 1");
                break;
            case 2:
                System.out.println("Has elegido la opcion 2");
                break;
            case 3:
                System.out.println("Has elegido la opcion 3");
                break;
            case 4:
                System.out.println("Has elegido la opcion 4");
                break;
            case 5:
                System.out.println("Has elegido la opcion 5");
                break;

        }

    }
}
