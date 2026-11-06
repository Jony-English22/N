public class OperadoresLogicos {
    void main(){
        int jerarquia = (3 + 5) * 6;
        int a = 20 + 5 * 2;
        int b = (10 + 5) * 2;
        int divisionEntera = 7 / 2;
        double divisionReal = 7.0 / 2;
        int residuo = 7 % 2;
        IO.println(jerarquia);
        IO.println(a);
        IO.println(b);
        IO.println(divisionEntera);
        IO.println(divisionReal);
        IO.println(residuo);

        IO.println("SEGUNDA PARTE");

        int operacion = 12 - 4 * 2;
        int operacion2 = (12 - 4) +2;
        int operacion3 = 11 % 4;
        int operacion4 = 9 / 2;
        double operacion5 = 9 / 2.0;

        IO.println(operacion);
        IO.println(operacion2);
        IO.println(operacion3);
        IO.println(operacion4);
        IO.println(operacion5);

        IO.println("OPERADOR DE ASIGNACION");

        int cantidad = 2;
        cantidad = cantidad + 1; // 3
        cantidad += 2;           // 5
        cantidad++;              // 6
        cantidad--;              // 5
    }
}
