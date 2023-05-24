public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }
   public String getModelo(){
        return modelo;
   }
   public String getMatricula(){
        return matricula;
   }
}
