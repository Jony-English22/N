
import java.util.Scanner;
public class BeginnnerExercises {
    //5. Declara una constante con tu correo electrónico.
    public static final String miCorreo = "alangonzalezcruz964@gmail.com";
    void main(){
        Scanner leer = new Scanner(System.in);

            //1. Declara una variable de tipo `String` y asígnale tu nombre.
            String nombre = "Alan Gonzalez Cruz";

            //2. Crea una variable de tipo `int` y asígnale tu edad.
            int edad = 17;

            //3. Crea una variable `double` con tu altura en metros.
            double altura = 23.90;

            //4. Declara una variable de tipo `boolean` que indique si te gusta programar.
            boolean programar = true;

            //5. Declara una constante con tu correo electrónico.
            System.out.println("Mi correo es " + miCorreo);

            //6. Crea una variable de tipo `char` y guárdale tu inicial.
            char inicial = 'A';

            //7. Declara una variable de tipo `String` con tu localidad; después cambia su valor y vuelve a imprimirla.
            String  localidad = "Cancun";
                System.out.println("Primera localidad " + localidad);
            localidad = "Lomitas";
                System.out.println("Segunda localidad "+ localidad);

            //8. Crea dos variables `int` llamadas `a` y `b`, e imprime la suma de ambas.
            int a = 10, b = 15;
            int suma = a + b;
            System.out.println("La suma de a + b es " + suma);

            //9. Imprime el tipo de dos variables creadas anteriormente.
            System.out.println(a + " + "  +b);

            //10. Declara una variable sin inicializarla; asígnale un valor antes de imprimirla.
            String municipio;
            municipio = "Lomitas";
            System.out.println(municipio);
    }
}