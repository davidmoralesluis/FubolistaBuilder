import java.util.ArrayList;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        ArrayList <Futbolista> listaFutbolistas=new ArrayList<Futbolista>();

        Futbolista desconocido=new CreaFutbolista().build();
        listaFutbolistas.add(desconocido);

        Futbolista messi=new CreaFutbolista()
                .setNombre("Messi")
                .setActivo("Si")
                .setAnnoNacimiento(1987)
                .setNacionalidad("Argentina")
                .setPosicion("Delantero")
                .setEquipo("PSG")
                .build();
        listaFutbolistas.add(messi);

        Futbolista pele=new CreaFutbolista().setNombre("Pele").setNacionalidad("Brasil").setActivo("No").build();
        listaFutbolistas.add(pele);

        for (Futbolista lista:listaFutbolistas) {
            System.out.println(lista.toString());
        }

        pele.setEquipo("FC Santos");
        pele.setPosicion("Delantero");
        pele.setAnnoNacimiento(1940);

        System.out.println("\n<>añadir parametros a pele<>\n"+pele.toString());

    }
}
