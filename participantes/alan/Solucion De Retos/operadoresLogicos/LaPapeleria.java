
public class LaPapeleria {
    void main(){
        //identificar
        int cuaderno = 35;
        int lapiz = 7;
        int borrador = 12;
        int pago = 500;

            //operaciones
            int totalCuadernos = cuaderno * 5;
            int totalLapiz = lapiz * 8;
            int totalBorrador = borrador * 3;

                //resultados
                int subtotal = totalCuadernos + totalLapiz + totalBorrador;
                int total = pago - subtotal;

                IO.println("El total de cuadernos es de:\n" + totalCuadernos + "$ \n"
                            + "El total de lapices es de: \n" + totalLapiz + "$\n"
                            + "El total de borradores es de: \n" + totalBorrador +"$\n");
                IO.println("El total de su compra es de:\n" + subtotal + "$");
                IO.println("El dinero recibido fue de:\n" + pago);
                IO.println("Su cambio es de:\n" + total + "$");
    }
}
