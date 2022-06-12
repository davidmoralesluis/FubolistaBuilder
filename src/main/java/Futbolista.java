import java.util.Calendar;

public class Futbolista {

    private String nombre;
    private int annoNacimiento;
    private String nacionalidad;
    private String equipo;
    private String posicion;
    private String activo;

    public Futbolista() {

        this.nombre="desconocido";
        this.annoNacimiento=0;
        this.nacionalidad="desconocido";
        this.equipo="desconocido";
        this.posicion="desconocido";
        this.activo="desconocido";
    }

    public Futbolista(String nombre, int annoNacimiento, String nacionalidad, String equipo, String posicion, String activo) {
        this.nombre = nombre;
        this.annoNacimiento = annoNacimiento;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.posicion = posicion;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnnoNacimiento() {
        return annoNacimiento;
    }

    public void setAnnoNacimiento(int annoNacimiento) {
        this.annoNacimiento = annoNacimiento;
    }

    public String getEdad(){
        if (getAnnoNacimiento()!=0){
            return ""+(Calendar.getInstance().get(Calendar.YEAR)-getAnnoNacimiento());
        }
        else return "desconocido";
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String isActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombre +
                " {edad=" + getEdad() +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", equipo='" + equipo + '\'' +
                ", posicion='" + posicion + '\'' +
                ", activo=" + activo +
                '}';
    }
}
