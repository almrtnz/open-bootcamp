public class App {

    public static void main(String[] args) throws Exception {
    
        // Decir hola
        System.out.println("Hello, OpenBootcamp!"); 
        
        int resultado; // la variable que guarda los datos
        resultado = suma(23, 18, 56); // suma de tres números
        
        System.out.println("El resultado de la suma es " + resultado); 
        // mostrar el resultado (23 + 18 + 56 = 97)

        // Creación de objeto con propiedades (Segunda parte)
        coche miCoche = new coche();
        miCoche.NumPuertas();
        System.out.println("Mi coche tiene " + miCoche.puertas + " puertas");
    }

    // Función con tres parámetros que sean números que se suman entre sí
    public static int suma(int a, int b, int c){
        
        return a + b + c;
    }

    // Clase coche (Segunda parte)
    static class coche {
        public int puertas = 5;

        // Función para incrementar el número de puertas
        public void NumPuertas(){
            this.puertas++;
        }

    }
}
