import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HistorialMedico {
    private List<Consulta> consultas;
    private List<RecetaMedica> recetasMedicas;

    public HistorialMedico() {
        this.consultas = new ArrayList<>();
        this.recetasMedicas = new ArrayList<>();
    }

    // Colección encapsulada para consultas
    public List<Consulta> getConsultas() {
        return Collections.unmodifiableList(consultas);
    }

    public void agregarConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        this.consultas.remove(consulta);
    }

    // Colección encapsulada para recetas médicas
    public List<RecetaMedica> getRecetasMedicas() {
        return Collections.unmodifiableList(recetasMedicas);
    }

    public void agregarRecetaMedica(RecetaMedica recetaMedica) {
        this.recetasMedicas.add(recetaMedica);
    }

    public void removerRecetaMedica(RecetaMedica recetaMedica) {
        this.recetasMedicas.remove(recetaMedica);
    }
}
