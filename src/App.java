import java.util.HashMap;
import java.util.Map;

import models.Persona;
import models.genericos.caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
       // caja <String> cajaString = new caja <>();
       // caja <Integer> cajaInteger = new caja <>();
        // caja <Persona> cajaPersona= new caja <>();

       // Persona persona = new Persona();
      //  persona.setNombre("jonnathan");
       // persona.setEdad(19);


      //  cajaString.guardar("guardado un string");
      //  cajaInteger.guardar(19);
      //  cajaPersona.guardar(persona);

     //   System.out.println(cajaString.obtener());
      //  System.out.println(cajaInteger.obtener());
      //  System.out.println(cajaPersona.obtener().getNombre());



      //  Par <String, Integer> par = new Par<>();




      Persona [] personas = new Persona[10];
      personas [0] = new Persona("ana", 10);
      personas [1] = new Persona("joselin", 16);
      personas [2] = new Persona("david", 20);
      personas [3] = new Persona("thiago", 21);
      personas [4] = new Persona("limber", 32);
      personas [5] = new Persona("bryan", 18);
      personas [6] = new Persona("stalin", 23);
      personas [7] = new Persona("nancy", 30);
      personas [8] = new Persona("vinicio", 66);
      personas [9] = new Persona("patricia", 10);


      // Paso 2: Crear un mapa para mayores de edad
        Map<String, Integer> mayores = new HashMap<>();
        // Paso 3: Crear un mapa para menores de edad
        Map<Integer, String> menores = new HashMap<>();

        // Clasificar a las personas según su edad
        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                mayores.put(persona.getNombre(), persona.getEdad());
            } else {
                menores.put(persona.getEdad(), persona.getNombre());
            }
        }

        // Paso 4: Imprimir los mapas
        System.out.println("Mayores de edad:");
        for (Map.Entry<String, Integer> entry : mayores.entrySet()) {
            System.out.println("Nombre: " + entry.getKey() + ", Edad: " + entry.getValue());
        }

        System.out.println("\nMenores de edad:");
        for (Map.Entry<Integer, String> entry : menores.entrySet()) {
            System.out.println("Edad: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }
    }
}




    }
}
