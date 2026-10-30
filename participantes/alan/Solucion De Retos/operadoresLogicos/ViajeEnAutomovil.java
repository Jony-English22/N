public class ViajeEnAutomovil {
    void main(){
        //identificar
        int kilometros = 360;
        float precioLitroDeGasolina = 24.50f;
        int dinero = 1000;

            //operaciones
            int totalDeKilometros = kilometros / 12;
            float total = precioLitroDeGasolina * totalDeKilometros;
            float restante = dinero - total;

                //resultados
                IO.println("Necesitara\n" + totalDeKilometros + " Litros de gasolina");
                IO.println("El costo total es de:\n" + total);
                IO.println("El restante es de:\n" + restante);
    }
}
