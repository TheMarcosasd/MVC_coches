/**
 * Entorno gráfico
 */
public class View {

    /**
     * Inicializamos el entorno gráfico
     */
    public static void crearVentana() {
        IU.crearVentana();
    }

    /**
     * Muestra la velocidad
     * @param matricula del coche
     * @param v velocidad que ueremos mostrar
     * @return true si todo bien
     */
    public static boolean mostrarVelocidad(String matricula, Integer v){
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
        System.out.println(mensaje);
        Dialog.mostrarMensaje(mensaje);
        return true;
    }

}
