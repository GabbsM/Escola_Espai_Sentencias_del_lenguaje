public class Problema12 {
    //Problema 12
    //Haz un bucle “for” de 1 a 5.000, que termine cuando lleguemos a la vuelta 25. Pista: usa el “break”.

    public static void main(String[] args) {

        for (int i = 0; i < 5000; i++) {
            System.out.println("Numero " + i);
            if (i == 25){
                break;
            }
        }
        System.out.println("Hemos llegado a 25!");
    }
}
