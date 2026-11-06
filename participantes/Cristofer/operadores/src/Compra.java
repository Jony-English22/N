public class Compra {
    void main(){

        double precio = 150;
        double descuento = 0.10;
        int cantidad = 3;

        double subtotal = precio * cantidad;
        double descuentot = subtotal * descuento;
        double total = subtotal - descuentot;

        System.out.println(subtotal);
        System.out.println(descuentot);
        System.out.println(total);


    }
}
