public class App4 {
    public static void main(String[] args) throws Exception {

        // crear un objeto de la clase cliente en el main
        // y darle valores
        Cliente cliente = new Cliente();
        cliente.setNombre("Peter");
        cliente.setEdad(23);
        cliente.setTelefono(123321123);
        cliente.setCredito(23256.45);

        // crear un objeto de la clase trabajador en el main
        // y darle valores
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Tony");
        trabajador.setEdad(57);
        trabajador.setTelefono(321321321);
        trabajador.setSalario(999998.99);

        // print
        System.out.println("-------------------");
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Edad del cliente: " + cliente.getEdad());
        System.out.println("Tlfn. del cliente: " + cliente.getTelefono());
        System.out.println("Crédito del cliente: " + cliente.getCredito() + " euros");
        System.out.println("-------------------");
        System.out.println("Nombre del trabajador: " + trabajador.getNombre());
        System.out.println("Edad del trabajador: " + trabajador.getEdad());
        System.out.println("Tlfn. del trabajador: " + trabajador.getTelefono());
        System.out.println("Salario del trabajador: " + trabajador.getSalario() + " euros");
        System.out.println("-------------------");
    }
}

class Persona {

    // variables
    String nombre;
    int edad;
    int telefono;

    // gets
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getTelefono() {
        return this.telefono;
    }

    // sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}

// La clase cliente hereda
// las variables de la clase persona
// con "extends"
class Cliente extends Persona {
    // variable
    double credito;

    // get
    public double getCredito() {
        return this.credito;
    }

    // set
    public void setCredito(double credito) {
        this.credito = credito;
    }
}

// La clase trabajador hereda
// las variables de la clase persona
// con "extends"
class Trabajador extends Persona {
    // variable
    double salario;

    // get
    public double getSalario() {
        return this.salario;
    }

    // set
    public void setSalario(double salario) {
        this.salario = salario;
    }
}