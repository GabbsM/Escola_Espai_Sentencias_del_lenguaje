public class Problema4 {
    //Problema 4
    //Muestra por pantalla el resultado de sumar 5 variables, y dile al usuario “te has pasado!” si el resultado
    //es > 100.
    public static void main(String[] args) {

        int variable1 = 5;
        int variable2 = 70;
        int variable3 = 20;
        int variable4 = 25;
        int variable5 = 19;

        int sumaVariables = variable1+variable2+variable3+variable4+variable5;

        if (sumaVariables>100){
            System.out.println("Te has pasado!!!");
        }else {
            System.out.println("Bien! No has llegado a 100!");
        }

    }
}
