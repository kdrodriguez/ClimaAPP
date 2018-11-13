
package clima.model.entities;

/**
 *
 * @author KEV
 */
public class CapitalProvincia {
    String codigoProv;
    String nombreCapital;
    private int temperatura;
    private int numHabitantes;

    public String getCodigoProv() {
        return codigoProv;
    }

    public void setCodigoProv(String codigoProv) {
        this.codigoProv = codigoProv;
    }

    public String getNombreCapital() {
        return nombreCapital;
    }

    public void setNombreCapital(String nombreCapital) {
        this.nombreCapital = nombreCapital;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }
    
    
}
