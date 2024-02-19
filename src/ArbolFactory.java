import java.util.HashMap;
import java.util.Map;

public class ArbolFactory {
    private Map<String ,Arbol> arbolMap;

    public ArbolFactory() {
        arbolMap = new HashMap<>();
    }
    public Arbol getArbol(Integer alto, Integer horizontal, String color) {
        String clave = "key" + alto + horizontal + color;

        if (!arbolMap.containsKey(clave)) {
            Arbol arbol = new Arbol(alto,horizontal,color);
            arbolMap.put(clave,arbol);
        }
        return arbolMap.get(clave);
    }
    public void mostrarArboles() {
        Integer i = 1;
        System.out.println("Todos los árboles en el Map:");
        for (Map.Entry<String, Arbol> entry : arbolMap.entrySet()) {

            String clave = entry.getKey();
            Arbol arbol = entry.getValue();
            System.out.println("Arbol Numero: " + i + "\nClave: " + clave + "\nCaracteristicas: "+ arbol);
            i++;
        }
    }

}
