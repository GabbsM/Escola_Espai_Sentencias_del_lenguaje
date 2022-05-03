public class Problema11 {
    //Problema 11
    //¿Qué diferencia hay entre while y do-while? Demuéstralo con un ejemplo. (pista: do-while se ejecuta
    //al menos 1 vez)
    public static void main(String[] args) {

        //While

        System.out.println("Bucle While: ");
        System.out.println();

        int num = 0;
        int cinco = 5;
        while (num<5){
            System.out.println(num);
            num+=1;
        }

        //Do While
        System.out.println();
        System.out.println("Bucle Do While: ");
        System.out.println();

        int numero = 9;
        int seis = 6;

        do {

                System.out.println("Hora de salir!");

        }while (numero<seis);
    }
}
