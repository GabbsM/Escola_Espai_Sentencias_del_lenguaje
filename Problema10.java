public class Problema10 {
    //Problema 10
    //Muestra todos los números pares que haya entre 3 y 99. Nota: “no vale” saltar de 2 en 2, debes usar un
    //if dentro de un bucle.
    public static void main(String[] args) {

        for (int i = 3; i <100 ; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }

    }
}
