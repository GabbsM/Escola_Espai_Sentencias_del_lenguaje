public class Problema5 {
//Problema 5
//Toma el ejercicio anterior, y muestra por pantalla si el resultado es múltiplo de 2, 3 o 5.
    public static void main(String[] args) {
        int variable1 = 5;
        int variable2 = 70;
        int variable3 = 20;
        int variable4 = 25;
        int variable5 = 19;

        int sumaVariables = variable1+variable2+variable3+variable4+variable5;

        if (sumaVariables%2 == 0){
            System.out.println("El resultado es multiplo de 2");
        }else if(sumaVariables%3==0){
            System.out.println("El resultado es multiplo de 3");
        }else if(sumaVariables%5 == 0){
            System.out.println("El resultado es multiplo de 5");
        }else {
            System.out.println("El resultado no es multiplo ni de 2, ni de 3 ni de 5");
        }

    }
}
