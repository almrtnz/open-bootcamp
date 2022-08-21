public class App3 {
    public static void main(String[] args) throws Exception {

        // crear un objeto persona en el main
        Persona persona = new Persona();

        // Nombre
        persona.setNombre("Albert");
        String nombre = persona.getNombre();
        System.out.println("Nombre: " + nombre);

        // Edad
        persona.setEdad(32);
        Integer edad = persona.getEdad();
        System.out.println("Edad: " + edad);

        // Teléfono
        persona.setTelefono(789321456);
        Integer telefono = persona.getTelefono();
        System.out.println("Teléfono: " + telefono);

    }

    static class Persona {

        // variables privadas
        private String nombre;
        private Integer edad;
        private Integer telefono;

        // sets
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(Integer edad) {
            this.edad = edad;
        }

        public void setTelefono(Integer telefono) {
            this.telefono = telefono;
        }

        // gets
        public String getNombre() {
            return this.nombre;
        }

        public Integer getEdad() {
            return this.edad;
        }

        public Integer getTelefono() {
            return this.telefono;
        }

    }
}
