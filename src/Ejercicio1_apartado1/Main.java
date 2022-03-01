package Ejercicio1_apartado1;

public class Main {

    public static final int TAMAÑO_ARRAY_ALEATORIO=20;

    public static void main(String[] args) {
	int [] array = obtenerArrayAleatorio ();
    int[] arrayPars = extraerArrayPares(array);

    if (!todosAsientosGeneralesOcupados() && reservaAsientoGeneralExitoso(5)){
        System.out.println("Reserva del asiento realizada con éxito");
    }else{
        System.out.println("No se ha podido reservar");
    }

    }

    private static int NUMERO_ASIENTOS_GENERAL = 16;
    private static int NUMERO_ASIENTOS_FUMADOR = 4;
    private static int[] asientosAvion = new int[NUMERO_ASIENTOS_GENERAL + NUMERO_ASIENTOS_FUMADOR];
    private static int numeroAsientosGeneralesOcupados = 0;
    private static int numeroAsientosFumadoresOcupados = 0;

    private static boolean todosAsientosGeneralesOcupados(){
        return numeroAsientosGeneralesOcupados == NUMERO_ASIENTOS_GENERAL;
    }

    private static boolean todosAsientosFumadoresOcupados(){
        return numeroAsientosFumadoresOcupados == NUMERO_ASIENTOS_FUMADOR;
    }

    private static boolean reservaAsientoGeneralExitoso(int numeroAsiento){

        boolean reservaExitosa = false;

        if (asientosAvion[numeroAsiento]==0
                && numeroAsiento>=0
                && numeroAsiento <= NUMERO_ASIENTOS_GENERAL){

            asientosAvion[numeroAsiento-1]=1;
            numeroAsientosGeneralesOcupados++;
            return reservaExitosa = true;

        }
        return reservaExitosa;
    }

    private static void reservarAsientosFumador (int numeroAsiento){

    }

    private static int[] obtenerArrayAleatorio(){
        int [] array = new int [TAMAÑO_ARRAY_ALEATORIO];

        return array;

    }

    private static int [] extraerArrayPares(int[] array){

        int[] arrayPares = new int [contarPares(array)];

        for (int i=0, j=0;
             i<array.length /* && j<arrayPares.length */;
             i++){

            if (array[i]%2==0){
                arrayPares[j] = array[i];
                j++;
            }
        }
        return  arrayPares;
    }

    private static int contarPares(int[] array){

        int contador = 0;

        for (int i=0; i<array.length; i++){

            if (array[i]%2==0){
                contador++;
            }
        }

        return contador;
    }
}
