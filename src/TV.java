import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by alumno on 5/07/2017.
 */
public class TV {
    private String marca="";
    private String cantidadDePulgadas="";
    private String[] caracteristica={"plano", "curvo"};
    private ArrayList<Integer> canales=null;

    public TV() {
        canales= new ArrayList<Integer>();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCantidadDePulgadas() {
        return cantidadDePulgadas;
    }

    public void setCantidadDePulgadas(String cantidadDePulgadas) {
        this.cantidadDePulgadas = cantidadDePulgadas;
    }

    public String[] getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String[] caracteristica) {
        this.caracteristica = caracteristica;
    }

    public ArrayList<Integer> getCanales() {
        return canales;
    }

    public void setCanales(ArrayList<Integer> canales) {
        this.canales = canales;
    }
    public boolean estaPermitido(Integer canal){
        boolean permitido=true;
        Canal canal1= new Canal();
        return canal1.estaPermitido(canal);
    }
}
