import java.util.Calendar;

public class CreaFutbolista {

    protected Futbolista jugador;

    public Futbolista build() {
        return this.jugador;
    }

    // crea un jugador nuevo
    public CreaFutbolista() {
        jugador = new Futbolista();
    }

    public CreaFutbolista setNombre(String nombre) {
        jugador.setNombre(nombre);
        return this;
    }


    public CreaFutbolista setAnnoNacimiento(int annoNacimiento) {
        jugador.setAnnoNacimiento(annoNacimiento);
        return this;
    }


    public CreaFutbolista setNacionalidad(String nacionalidad) {
        jugador.setNacionalidad(nacionalidad);
        return this;
    }



    public CreaFutbolista setEquipo(String equipo) {
        jugador.setEquipo(equipo);
        return this;
    }



    public CreaFutbolista setPosicion(String posicion) {
        jugador.setPosicion(posicion);
        return this;
    }



    public CreaFutbolista setActivo(String activo) {
        jugador.setActivo(activo);
        return this;
    }
}
