// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArbolFactory arbolFactory = new ArbolFactory();

        for (Integer i = 0; i<=500000;i++) {
            arbolFactory.getArbol(500,300,"rojo");
        }

        for (Integer i = 0; i<=500000;i++) {
            arbolFactory.getArbol(200,400,"verde");
        }



        arbolFactory.mostrarArboles();


    }
    }
