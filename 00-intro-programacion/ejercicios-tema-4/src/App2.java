public class App2 {
    public static void main(String[] args) throws Exception {

        // Decir hola
        System.out.println("Hello, OpenBootcamp!");

        int numeroIf = -25; // Nuestro número

        // Comparación de la variable numeroIf
        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        // While Loop
        int numeroWhile = -1; // Nuestro número
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El número del while loop es " + numeroWhile);
        }
        // Do While Loop
        do {
            numeroWhile++;
            System.out.println("El número del do/while loop es " + numeroWhile);
        } while (numeroWhile < 3);

        // For Loop
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El número for es " + numeroFor);
        }

        // Switch
        var estacion = "primavera";
        switch (estacion) {
            case "invierno":
                System.out.println("¡Ya es invierno!");
                break;
            case "primavera":
                System.out.println("¡Ya es primavera!");
                break;
            case "verano":
                System.out.println("¡Ya es verano!");
                break;
            case "otoño":
                System.out.println("¡Ya es otoño!");
                break;
            default:
                System.out.println("¡El valor de la variable no es una estación");
        }
    }

}
