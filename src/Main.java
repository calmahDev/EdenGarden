import EdenGarden.Logica.Arbol;
import EdenGarden.Logica.Arbusto;
import EdenGarden.Logica.Flor;

public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol("Fruta","madera",9.5,"Verdes","redondas");
        Flor flor = new Flor("Rojo", 4.2, "Rosado", "Rosa", "verano");
        Arbusto arbusto = new Arbusto(5.2, true, "Lecho", "Amarillas", false);

        System.out.println(arbol+""+flor+ ""+arbusto);
        System.out.println("------------------------------------------------");
        arbol.saludo();
        flor.saludo();
        arbusto.saludo();
    }
}