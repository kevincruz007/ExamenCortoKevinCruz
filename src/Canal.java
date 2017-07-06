import java.util.ArrayList;

/**
 * Created by alumno on 5/07/2017.
 */
public class Canal {
    private ArrayList<String[]> canalList = null;

    public Canal() {
        canalList = new ArrayList<String[]>();
        crearListaDefault();

    }

    public void crearListaDefault() {
        Integer canal = 0;

        String[] tematica = new String[]{"Lista de canales", "Dibujos animados", "Series", "Deporte", "Cine"};
        for (int i = 0; i < tematica.length; i++) {
            canal = i + 1;
            String[] x = new String[]{(canal.toString()), tematica[i]};
            canalList.add(x);
        }
    }

    public ArrayList<String[]> getCanalList() {
        return canalList;
    }
    public boolean estaPermitido(Integer canal){
        String[] c = canalList.get(canal);
        if(c.equals("Dibujos animados"))
            return true;
        return false;
        
    }
}
