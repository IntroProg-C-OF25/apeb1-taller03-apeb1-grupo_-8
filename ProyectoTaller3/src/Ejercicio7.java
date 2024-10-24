
public class Ejercicio7 {

    public static void main(String[] args) {
        boolean respuesta;
        respuesta = ((Math.sqrt(81) + 9) / 3 == 9) || (10 > 1) && ((100 / 25) + Math.sqrt(100) > 0);
        // se cambio el codigo porque mostraba error a un problema en el codigo asi q se lo arreglo cambiar la respuesta a boolean en vez de int y tambien al final del codigo para que no afecque se puso un mayor q cero para arreglar la ecuacion 

        System.out.println("respuesta = " + respuesta);
    }

}
