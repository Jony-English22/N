import javax.swing.*;

public class Compra {
    void main(){
        /*
        Una tienda vende productos a 150 pesos cada uno;
        el cliente compra 3 y recibe un descuento del 10%
         */

       double precio = 150.00;
       int cantidad = 3;
       double descuento = 0.10;

       double subtotal = precio * cantidad;
       double descuentoDePrecio = subtotal * descuento;
       double total = subtotal - descuentoDePrecio;

        IO.println("Subtotal\n" + subtotal);
        IO.println("Descuento\n" + descuentoDePrecio);
        IO.println("Total\n" + total);

    }
}
