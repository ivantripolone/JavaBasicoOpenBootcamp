public class Main {
        public static void main(String[] args) {

            String[] nombres = {"Pepe", "Juan", "Anthony"};
            String nombresConcatenados = "";
            for (int i = 0; i < nombres.length; i++) {
                nombresConcatenados += nombres[i] + " ";
            }
            System.out.println(nombresConcatenados);

        }
}