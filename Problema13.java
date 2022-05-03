public class Problema13 {
    //Problema 13
    //Haz un bucle “while” que nos cuente los números del 4 al 296. Además, sáltate todos los números que
    //sean múltiplos de 5. Pista: usa el “continue”

    public static void main(String[] args) {

        int num = 0;

        while (num<297){
            num+=1;
            if(num%5 == 0)
                continue;

            System.out.println(num);

        }

    }



}
