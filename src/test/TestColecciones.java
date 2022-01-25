package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
       // imprimir(miLista);
        System.out.println("");


        Set miset = new HashSet();
        miset.add("Lunes");
        miset.add("Martes");
        miset.add("Miercoles");
        miset.add("Jueves");
       // imprimir(miset);

        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Karla");

        String elemento = (String) miMapa.get("Valor1");
        //System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());



    }

    public static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("elemento = " + elemento);
        }
    }
}
