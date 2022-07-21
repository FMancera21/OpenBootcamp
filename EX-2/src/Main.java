public class Main {
    public static void main(String[] args) {
        int numeroIf = 0, numeroWhile = 0;
        var estacion = "invierno";

        if (numeroIf == 0){
            System.out.println("El número es 0");
        }
        else if (numeroIf >= 0){
            System.out.println("El número es positivo");
        }
        else{
            System.out.println("El número es negativo");
        }

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }
        do {
            System.out.println(numeroWhile);
            numeroWhile ++;
        } while (numeroWhile <= 3);

        for ( int numeroFor = 0;numeroFor <= 3; numeroFor++ ){
            System.out.println(numeroFor);
        }
        switch (estacion){
            case "verano":
                System.out.println("Es verano.");
                System.out.println(estacion);
                break;
            case "invierno":
                System.out.println("Es invierno.");
                System.out.println(estacion);
                break;
            case "primavera":
                System.out.println("Es primavera.");
                System.out.println(estacion);
                break;
            case "otoño":
                System.out.println("Es otoño.");
                System.out.println(estacion);
                break;
            default:
                System.out.println("No es una estacion.");
                System.out.println(estacion);
        }

    }

}