public class Nomina {
    void main(){
        //identificar
        int horasDeTrabajo = 40;
        int pagoDeHora = 95;
        int horaAdicionales = 6;
        int bonoDeProductividad = 450;
        float deduccion = 0.08f;

            //operaciones
            int totalDeHoras = horasDeTrabajo * pagoDeHora;
            int totalDeHorasAdicionales = horaAdicionales * (pagoDeHora * 2);
            int totalSinDeduccion = totalDeHoras + totalDeHorasAdicionales + bonoDeProductividad;
            float montonDescontado = totalSinDeduccion * deduccion;
            float total = totalSinDeduccion - montonDescontado;

                //resultados
                IO.println("El pago de horario normal es de:\n" + totalDeHoras);
                IO.println("El pago de horas adicionales es de\n" + totalDeHorasAdicionales);
                IO.println("Ingreso antes de la deduccion es de:\n" + totalSinDeduccion);
                IO.println("El monto descontado es de:\n" + String.format("%.2f", montonDescontado));
                IO.println("El salario final es de:\n" + String.format("%.2f", total));



    }
}
