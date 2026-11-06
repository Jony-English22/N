public class Ejercicios_Operador {
    void main () {

        //Crea una variable para guardar el resultado de cada operación aritmética:
        // suma, resta, multiplicación, división y módulo.
        System.out.println("=== 1. Operaciones Aritméticas ===");
        int suma = 10 + 5;
        int resta = 10 - 5;
        int multiplicacion = 10 * 5;
        double division = 10.0 / 3.0;
        int modulo = 10 % 3;

        System.out.println("Suma (10 + 5) = " + suma);
        System.out.println("Resta (10 - 5) = " + resta);
        System.out.println("Multiplicación (10 * 5) = " + multiplicacion);
        System.out.println("División (10.0 / 3.0) = " + division);
        System.out.println("Módulo (10 % 3) = " + modulo);


        //Crea una variable para cada operador de asignación, como =, +=, -=, *=, /=y %=.
        // Muestra el resultado de cada operación.
        System.out.println("\n=== 2. Operadores de Asignación ===");
        int x = 10;
        System.out.println("Asignación simple (=): x = " + x);
        x += 5; // x = x + 5
        System.out.println("Suma y asignación (+=): " + x);
        x -= 3; // x = x - 3
        System.out.println("Resta y asignación (-=): " + x);
        x *= 2; // x = x * 2
        System.out.println("Multiplicación y asignación (*=): " + x);
        x /= 4; // x = x / 4
        System.out.println("División y asignación (/=): " + x);
        x %= 3; // x = x % 3
        System.out.println("Módulo y asignación (%=): " + x);


        //Imprime tres comparaciones que den true, usando operadores de comparación diferentes.
        System.out.println("\n=== 3. Comparaciones que dan TRUE ===");
        System.out.println("10 > 5 -> " + (10 > 5));
        System.out.println("5 == 5 -> " + (5 == 5));
        System.out.println("3 <= 8 -> " + (3 <= 8));

        //Imprime tres comparaciones que den false, usando operadores de comparación diferentes.
        System.out.println("\n=== 4. Comparaciones que dan FALSE ===");
        System.out.println("10 < 5 -> " + (10 < 5));
        System.out.println("5 != 5 -> " + (5 != 5));
        System.out.println("9 <= 4 -> " + (9 <= 4));

        //Usa el operador lógico AND ( &&) en una expresión e imprime su resultado.
        System.out.println("\n=== 5. Operador lógico AND ( && ) ===");
        boolean andRes = (10 > 5) && (5 < 8);
        System.out.println("(10 > 5) && (5 < 8) -> " + andRes);


        //Usa el operador lógico OR ( ||) en una expresión e imprime su resultado.
        System.out.println("\n=== 6. Operador lógico OR ( || ) ===");
        boolean orRes = (10 < 5) || (5 < 8);
        System.out.println("(10 < 5) || (5 < 8) -> " + orRes);

        //Combina AND y OR en una misma expresión.
        System.out.println("\n=== 7. Combinar AND y OR ===");
        boolean combinacion = (10 > 5 && 2 > 3) || (4 < 8);
        System.out.println("(10 > 5 && 2 > 3) || (4 < 8) -> " + combinacion);

        //Agregue una negación con el operador !y muestre cómo cambia el resultado.
        System.out.println("\n=== 8. Operador de Negación ( ! ) ===" );
        boolean original = true;
        System.out.println("Valor original: " + original);
        System.out.println("Con negación (!original): " + !original);

        //Imprima tres ejemplos de uso de operadores unarios.
        System.out.println("\n=== 9. Operadores Unarios ===");
        int contador = 5;
        System.out.println("Valor inicial: " + contador);
        System.out.println("Post-incremento (contador++): " + (contador++)); // Imprime 5 y luego suma
        System.out.println("Valor después del incremento: " + contador);
        System.out.println("Pre-decremento (--contador): " + (--contador));     // Resta 1 y luego imprime
        System.out.println("Unario positivo (+contador): " + (+contador));


        //Combina operadores aritméticos, de comparación y lógicos en una expresión e imprime el resultado.
        System.out.println("\n=== 10. Combinación completa ===");
        boolean exprCompleja = (10 + 5 * 2 > 15) && !(3 == 5);
        System.out.println("(10 + 5 * 2 > 15) && !(3 == 5) -> " + exprCompleja);
    }
}
