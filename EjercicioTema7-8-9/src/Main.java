import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main (String [ ] args) {
        System.out.println(reverse("ivan ivan"));

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String[] arrayStrings = new String[3];
        arrayStrings[0] = "ivan";
        arrayStrings[1] = "juan";
        arrayStrings[2] = "leo";

        for (String arrayString : arrayStrings) {
            System.out.println(arrayString);
        }

        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

        int[][] biInts = new int[2][2];
        biInts[0][0] = 1;
        biInts[0][1] = 2;
        biInts[1][0] = 3;
        biInts[1][1] = 4;

        for (int x=0; x < biInts.length; x++) {
            for (int y=0; y < biInts[x].length; y++) {

                System.out.println("En la posicion: " + x + " " + y + ", se encuentra el valor: " + biInts[x][y]);
            }
        }

        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);


        vector.removeElement(2);
        vector.removeElement(3);

        System.out.println(vector);

        /* Indica cuál es el problema de utilizar
           un Vector con la capacidad por defecto si tuviésemos 1000
           elementos para ser añadidos al mismo.
          Internamente el vector tendria que copiar los valores cada vez que la cantidad de elementos
          supere a la capacidad, crea un nuevo array con mas capacidad y copia los valores que tenia el array anterior
          y vuelve a seguir agregando los nuevos, este proceso se repetiria las veces necesarias hasta que puedan
          entrar los mil elemento, lo que es muy poco eficiente.

         */
        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento
        ArrayList<String> miArrayList = new ArrayList<>();

        miArrayList.add("ivan");
        miArrayList.add("leo");
        miArrayList.add("mauro");
        miArrayList.add("ariel");

        LinkedList<String> miLinkedList = new LinkedList<>(miArrayList);

        miArrayList.forEach(System.out::println);
        miLinkedList.forEach(System.out::println);

        /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        Por último, vuelve a recorrerlo y muestra el ArrayList final.
        Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
         */
        ArrayList<Integer> miArrayInt= new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            miArrayInt.add(i);
        }
        for (int i = 0; i < miArrayInt.size(); i++){
            if(miArrayInt.get(i) % 2 == 0){
                miArrayInt.remove(i);
            }
        }
        miArrayInt.forEach(System.out::println);


        try {
            dividePorCero(1,0);
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de codigo");
        }

        copyFile("src/File" , "CopyFile");


    }

    public static String reverse(String texto) {
        StringBuilder result= new StringBuilder();
        int lastPosText = texto.length() - 1;
        for (int i = lastPosText; i >= 0 ; i--) {
            result.append(texto.charAt(i));
        }
        return result.toString();
    }

    /*
    Crea una función DividePorCero.
    Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException
    que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción,
    mostraremos el mensaje
    "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
     */
    public static void dividePorCero(int a, int b) throws ArithmeticException {
        try {
            int c = a/b;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }

    /*
    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    La tarea de la función será realizar la copia del fichero dado
    en el parámetro "fileIn" al fichero dado en "fileOut".
     */

    public static void copyFile(String fileIn , String fileOut){
        try {
            InputStream file = new FileInputStream(fileIn);
            byte []datos= file.readAllBytes();

            PrintStream copyFile= new PrintStream(fileOut);
            copyFile.write(datos);

            System.out.println("los datos de " + fileIn + " se compiaron en " + fileOut);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
