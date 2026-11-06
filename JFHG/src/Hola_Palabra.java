import java.util.Scanner;

public class Hola_Palabra {
  void main () {


        //Imprime un mensaje que diga tu nombre en lugar de «¡Hola Mundo!».
        System.out.println("Jesús Felipe");

        //Imprime dos líneas, «Hola» y después «Mundo», usando un solo println.
        System.out.println("Hola");
        System.out.println("Mundo");

        //Agregue un comentario que explique qué hace cada línea del programa.
        //Línea 14 Imprime mi nombre en la consola en vez del famoso "Hola Mundo"...
        //Línea 17 y 18 se imprime él hola y en otra línea mundo en print diferentes...

        //Crea un comentario de varias líneas.
        //Hola profesor me han gustado mucho sus clases y además me gusta la manera de enseñar de usted,
        //ya que es creativa, y si pudiese escogerlo en mi horario del tec lo haría sin duda...

        //Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Tengo 17 años");
        System.out.println("Mi color favorito es el negro");
        System.out.println("Mi ciudad es Villahermosa Tabasco");

        //Explora otros miembros System además de out y prueba otra forma de mostrar un mensaje.
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese edad");
       byte Edad = leer.nextByte();

        if (Edad < 18) {
            System.out.println("No puedes pasar eres menor de edad papito");
        }else {
            System.out.println("Acceso consedido mayor de edad");
        }

        //Usa varios println para imprimir una frase.
        System.out.println("Hola");
        System.out.println("mi");
        System.out.println("nombre");
        System.out.println("es");
        System.out.println("Felipe");

        //Imprima un diseño ASCII, por ejemplo, una cara feliz hecha con símbolos.
        System.out.println("  ^___^");
        System.out.println(" ( o.o )");
        System.out.println("  > ^ < ");

        //Intenta ejecutar el programa sin el metodo main anota el error que aparece.
        //Aparece el siguiente error: C:\Users\felip\GIT\N\JFHG\src\Hola_Palabra.java:9:27
        //java: <identifier> expected

      //Declara la clase como public, cambia el nombre del archivo por uno diferente
      // al de la clase e intenta compilarlo. Anota qué ocurre.
      //NOTACIÓN DE LO QUE OCURRE: Al cambiarle el nombre al archivo manteniendo la clase como pública,
      // el compilador marca un error porque Java exige que ambos nombres coincidan exactamente.

    }
}
