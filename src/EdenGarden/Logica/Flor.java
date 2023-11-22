package EdenGarden.Logica;

public class Flor extends Planta{
    private String colorPetalo;
    private Double promediPetalos;
    private String colorPistilo;
    private String variedadFlor;
    private String estacionFlorece;
    public Flor(){

    }

    @Override
    public void saludo() {
        System.out.println("Hola soy Una Flor");
    }

    public Flor(String colorPetalo, Double promediPetalos, String colorPistilo, String variedadFlor, String estacionFlorece){
        this.colorPetalo = colorPetalo;
        this.promediPetalos = promediPetalos;
        this.colorPistilo = colorPistilo;
        this.variedadFlor = variedadFlor;
        this.estacionFlorece = estacionFlorece;
    }
    public String getColorPetalo(){
        return colorPetalo;
    }
    public void  setColorPetalo(String colorPetalo){
        this.colorPetalo = colorPetalo;
    }
    public Double getPromediPetalos(){
        return promediPetalos;
    }
    public void setPromediPetalos(Double promediPetalos){
        this.promediPetalos = promediPetalos;
    }
    public String getColorPistilo(){
        return colorPistilo;
    }
    public void setColorPistilo( String colorPistilo){
        this.colorPistilo = colorPistilo;
    }
    public String getVariedadFlor(){
        return variedadFlor;
    }
    public void setVariedadFlor(String variedadFlor){
        this.variedadFlor = variedadFlor;
    }
    public String getEstacionFlorece(){
        return estacionFlorece;
    }
    public void setEstacionFlorece(String estacionFlorece){
        this.estacionFlorece = estacionFlorece;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "colorPetalo='" + colorPetalo + '\'' +
                ", promediPetalos=" + promediPetalos +
                ", colorPistilo='" + colorPistilo + '\'' +
                ", variedadFlor='" + variedadFlor + '\'' +
                ", estacionFlorece='" + estacionFlorece + '\'' +
                '}';
    }
}
