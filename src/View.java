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
    public static boolean mostrarVelocidad(String matricula, Integer v){
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
        System.out.println(mensaje);
        Dialog.mostrarMensaje(mensaje);
        return true;
    }

}
