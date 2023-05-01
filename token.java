import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Random;


/* PRACTICA TOKEN 
 * @author: Laura Irais García Mendoza
 * @mail: iraisgm1219@gmail.com
 */

public class token {
public static void main(String[] args) {
    token token = new token();
    //System.out.println(token.obtenerAlfabeto());
    
    String tokenGenerado = token.generartoken();
    System.out.println(tokenGenerado);

    ArrayDeque<String> cola = new ArrayDeque<>();
    for (int i=0; i<=10; i++) {
        cola.add(token.generartoken());
    }
    System.out.println(cola);
    Iterator tokenGuardado = cola.iterator();
    System.out.println("Los valores en el token es: ");
    while (tokenGuardado.hasNext()); {

System.out.println(tokenGuardado.next());
    }
  }

  

private String generartoken() {
    return null;
}
}
