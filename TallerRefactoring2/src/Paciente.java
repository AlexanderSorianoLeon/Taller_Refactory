public class Paciente extends Persona {
    private HistorialMedico historialMedico;
    static final int edad_adulto_mayor = 65;
    public Paciente(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
        this.historialMedico = new HistorialMedico();
    }

    public boolean esAdultoMayor(){
        return super.getEdad()>=edad_adulto_mayor;
    }
    public historialMedico getHistorialMedico(){
	    return historialMedico;	
	}

    public void setHistorialMedico(HistorialMedico historialMedico){
	    this.historialMedico = historialMedico;
	}
}
