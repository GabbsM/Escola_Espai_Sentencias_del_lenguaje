import java.util.Scanner;

public class Problema2 {
       //Problema 2
       //Haz un programa que, según el día de la semana, nos diga “a estudiar toca!” o “por fin descanso!”
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica que dia es hoy: ");
        String diaSemana = sc.next();

        if (diaSemana.equalsIgnoreCase("lunes")||
                diaSemana.equalsIgnoreCase("martes")||
                diaSemana.equalsIgnoreCase("miercoles")||
                diaSemana.equalsIgnoreCase("jueves")||
                diaSemana.equalsIgnoreCase("viernes")){

            System.out.println("A estudiar toca!!");

        }else if(diaSemana.equalsIgnoreCase("sabado")||
                diaSemana.equalsIgnoreCase("domingo")){

            System.out.println("Por fin descanso!!");
        }
    }

}

