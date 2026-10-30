
import java.util.Scanner;
public class OperatorExercises {
    void main() {
        Scanner leer = new Scanner(System.in);
        //1. Crea una variable para guardar el resultado de cada operación aritmética: suma, resta, multiplicación, división y módulo.
        int suma, resta, multiplicacion, division, modulo;
            suma = 4 + 4;
            resta = 10 - 5;
            multiplicacion = 3 * 4;
            division = 30 / 3;
            modulo = 90 % 7;

            System.out.println("Suma \n" + suma);
            System.out.println("Resta \n" + suma);
            System.out.println("Multiplicacion \n" + suma);
            System.out.println("Division \n" + suma);
            System.out.println("Modulo \n" + modulo);

        //2. Crea una variable para cada operador de asignación, como `=`, `+=`, `-=`, `*=`, `/=` y `%=`. Muestra el resultado de cada operación.
        int numero1, numero2 = 2, numero3 = 3, numero4 = 4, numero5 = 5, numero6 = 6;
        numero1 = 1;
        System.out.println("=\n" + numero1);

        numero2 += 5;
        System.out.println("+=\n" + numero2);

        numero3 -= 4;
        System.out.println("-=\n" + numero3);

        numero4 *= 3;
        System.out.println("*=\n" + numero4);

        numero5 /= 2;
        System.out.println("/=\n" + numero5);

        numero6 %= 3;
        System.out.println("%=\n" + numero6);

        //Imprime tres comparaciones que den `true`, usando operadores de comparación diferentes.
        System.out.println("5 < 10 es:\n" + (5 < 10));
        System.out.println("5 != 10 es:\n" + (5 != 10));
        System.out.println("8 == 8 es:\n" + (8 == 8));

        //4. Imprime tres comparaciones que den `false`, usando operadores de comparación diferentes.
        System.out.println("6 != 6 es:\n" + (6 != 6));
        System.out.println("7 < 2 es:\n" + (7 < 2));
        System.out.println("8 <= 5 es:\n" + (8 <= 5));

        //5. Usa el operador lógico **AND** (`&&`) en una expresión e imprime su resultado.
        System.out.println( 34 > 30 && 12 > 10);

        //6. Usa el operador lógico **OR** (`||`) en una expresión e imprime su resultado.
        boolean comi, dormi;
        System.out.println(comi = true || dormi == false);

        //7. Combina **AND** y **OR** en una misma expresión.
        boolean descanse = true, programe = true, desayune = false;
        System.out.println((descanse && programe) || desayune);

        //8. Añade una negación con el operador `!` y muestra cómo cambia el resultado.
        System.out.println((!descanse && !programe) || desayune);

        //9. Imprime tres ejemplos de uso de operadores unarios.
        int u = 1, n = 4;
        boolean a = false;
        System.out.println(-u);
        System.out.println(n++);
        System.out.println(!a);

        //10. Combina operadores aritméticos, de comparación y lógicos en una expresión e imprime el resultado.
        boolean sueño, comer, beber, cansado;

        System.out.println("Si tienes sueño oprime 1 si no cualquier otro numero");
            int s = leer.nextInt();
            int o = s + 1;
            sueño = (o == 2);
        System.out.println("Si tienes hambre oprime 1 si no cualquier otro numero");
            int c = leer.nextInt();
            int i = c + 1;
            comer = (i == 2);
        System.out.println("Si quieres tomar algo oprime 1 si no cualquier otro numero");
            int b = leer.nextInt();
            int q = b + 1;
            beber = (b == 2);

            cansado = (comer && beber) && sueño;

            System.out.println("Estas totalmente cansado \n" + cansado);


    }
}