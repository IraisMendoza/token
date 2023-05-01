import java.util.*;
import java.util.Random;
import java.util.HashSet;

/*PRACTICA TOKEN 
 * @author Laura Irais Garcia Mendoza
 * @mail iraisgm1219@gmail.com
*/
public class token2 {
    public String obtenerAlfabeto(){
        char x = 'A';
        String alfabeto ="";
        for (int i =0;i<=25;i++){
            String charToString =String.valueOf(x++);
           // System.out.println(charToString);
            //iteramos caracter y concatenamos en alfabeto
            alfabeto=alfabeto.concat(charToString);
        }// fin de while
        return alfabeto;
    }//
    public String generarToken(){
        String token ="";
        Random random = new Random();
        //Caracter de token
        String alfabeto = obtenerAlfabeto();
        for(int i=0;i<=3;i++){
            char c = alfabeto.charAt(random.nextInt(alfabeto.length()));
            String charToString =String.valueOf(c);
            token = token.concat(String.valueOf(c));
        }
        return token;
    }
}

