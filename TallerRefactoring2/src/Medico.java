public class Medico extends Persona {

    public Medico(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico) {
        super(nombre, edad, genero, direccion, telefono, correoElectronico);
    }


    public void realizaConsulta(Paciente paciente, HistorialMedico medico) {
        String tratamiento;
        System.out.println("Realizando consulta a " + paciente.getNombre() +
                " (Solo se usa el objeto persona en este metodo...)");
        tratamiento = "Conservador...";
        prescribirTratamiento();
    }

    private void prescribirTratamiento() {
        // Implementación para prescribir un tratamiento al paciente.
        System.out.println("Prescribiendo tratamineto... " +
                "(Este metodo solo debe ser utilizado en esta clase, nadie mas lo puede utilizar)");
    }

    private void adminMedicamento() {
        // Implementación para administrar medicamentos al paciente.
    }
}
