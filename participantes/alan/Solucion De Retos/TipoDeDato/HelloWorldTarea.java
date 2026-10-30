import java.io.PrintStream;
import java.util.Scanner;
public class HelloWorldTarea {
    void main(){
        Scanner leer = new Scanner(System.in);

        //1. Imprime un mensaje que diga tu nombre en lugar de «¡Hola Mundo!».
        String palabra = "Hola mundo";
        palabra = "Alan Gonzalez Cruz";
            System.out.println(palabra);

        //2. Imprime dos líneas, «Hola» y después «Mundo», usando un solo `println`.
        System.out.println("hola \nmundo");

        //3. Añade un comentario que explique qué hace cada línea del programa.
        //Una suma basica con enteros(Int)
        int suma = 2 + 3;

        //Imprime el resultado
        System.out.println("El resultado es: \n" + suma);

        //4. Crea un comentario de varias líneas.
        /*Comentario
          de varias
          lineas
         */

        //5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Mi nombre es: Alan Gonzalez Cruz " +
                            "\n Mi color favorito es: Negro o Azul " +
                            "\nMi ciudad favorita esHonkong");

        //6. Explora otros miembros de `System` además de `out` y prueba otra forma de mostrar un mensaje.
        System.err.println("Hola");

        PrintStream frase = System.err;
        frase.println("Elemento");

        //7. Usa varios `println` para imprimir una frase.
        System.out.println("Me");
        System.out.println("gusta");
        System.out.println("la");
        System.out.println("programacion");

        //8. Imprime un diseño ASCII, por ejemplo, una cara feliz hecha con símbolos.
        System.out.println("   ##### ");
        System.out.println(" #       #");
        System.out.println("#   ^ ^   #");
        System.out.println("#    -    #");
        System.out.println(" #  \\_/  #");
        System.out.println("  #####");




    }
}