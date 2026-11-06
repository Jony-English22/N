public class Imprenta {
    void main(){
        //Identificar
        int pedido = 120;
        int costoDeProduccion = 85;
        int costoDeCliente = 140;
        int electricidad = 350;
        int transporte = 500;

            //operaciones
            int ventaTotalAlConsumidor = pedido * costoDeCliente;
            int produccionTotal = costoDeProduccion * pedido;
            int gastosAdicionales = electricidad + transporte;
            int ganacia = ventaTotalAlConsumidor - (produccionTotal + gastosAdicionales);

                    //resultados
                    IO.println("El costo de produccion fue de:\n" + produccionTotal);
                    IO.println("los gastos adicionales fueron de:\n" + gastosAdicionales);
                    IO.println("El ingreso total fue de:\n" + ventaTotalAlConsumidor);
                    IO.println("La ganancia fue de\n" + ganacia);

    }
}
