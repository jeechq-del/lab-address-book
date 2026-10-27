import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;

public  class Agenda {
    private TreeMap<String, Contacto> contactos;

    private TreeMap<String, TreeSet<String>> contactosPorGrupo;
    private ArrayList<Contacto> historial;
    private TreeSet<String> grupos = new TreeSet<>();
    public void agregarContacto(Contacto c) {
        contactos.put(c.getNombre(), c);
        historial.add(c);
    }

    }



}
