public class EjerciciosPrincipiante {
    void main () {
            //EJERCICIOS PARA PRINCIPIANTES

        //Declara una variable de tipo String asígnale tu nombre.
        String Nombre = "Felipe";

        //Crea una variable de tipo int y asígnale tu edad.
        int edad = 17;

        //Crea una variable double con tu altura en metros.
        double Estatura = 1.65;

        //Declara una variable de tipo boolean que indica si te gusta programar.
        Boolean TeGustaProgramar = true;

        //Declara una constante con tu correo electrónico.
        final String CORREO_ELECTRONICO = "felipegarciajesus74@gmail.com";
        System.out.println("Mi correo electrónico es: " + CORREO_ELECTRONICO);

        //Crea una variable de tipo char y guárdale tu inicial.
        char InicialNombre = 'J';

        //Declara una variable de tipo String con tu localidad; Después cambia
        // su valor y vuelve a imprimirla.
        String Localidad = "Centro_Villahermosa";
        String Cambiado = "Villahermosa";

        //Crea dos variables int llamadas ay b, e imprime la suma de ambas.
        int a = 5;
        int b = 5;
        int suma = a + b;

        //Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(Nombre);
        System.out.println(edad);
        System.out.println(Localidad);
        System.out.println(Cambiado);
        System.out.println("La suma de A y B es: " + suma);

        //Declara una variable sin inicializarla; asígnale un valor antes de imprimirla.
        int numero;
        numero = 10;
        System.out.println("El valor de la variable es: " + numero);
    }
}
