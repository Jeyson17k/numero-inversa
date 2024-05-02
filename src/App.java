import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        //Jeyson miguel zapata davila
        //carnet 2024-1362U

        boolean condiciosalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("Mostrar el arreglo original");

        Mostrar(array);

        arrayInverso(array);
        System.out.println("mostrar el arreglo invertido:");
        mostrarArreglo(array);
        
        leer.close();

   }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valor [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }

        
    }
     //metodo arrayInverso
   public static void arrayInverso(int[] array) {
    int num = 0;
    int num1 = array.length - 1;

    while (num < num1) {
      int siz = array[num];
      array[num] = array[num1];
      array[num1] = siz;
      
      num++;
      num1--;
   
    }
 }
    // metodo para mostrar el arreglo
     public static void mostrarArreglo(int[] array) {
        for (int elemento : array) {
            System.out.println(elemento +" ");
            
        }
        System.out.println();
    }


}