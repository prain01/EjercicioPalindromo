import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("""
                ==========MENU==========
                [1] Ingresar palabra (validar si es palindromo)
                [0] Salir""");
        elegirOpcion();
    }

    public static void elegirOpcion(){
        int min = 0;
        int max = 1;
        int opcion = min - 1;
        while(opcion != 0){
            opcion =  pedirNumeroLimitado(min, max);
            switch (opcion) {
                case 0 -> casoSalir();
                case 1 -> casoPedirPalabra();
            }
        }

    }

    public static void casoPedirPalabra() {//case 0
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabara u frase para verificar si es palindromo");
        System.out.println("Es palindromo: " + verificarPalindromo(teclado.nextLine()));
    }

    public static void casoSalir() {//case 1
        System.out.println("Adios!!!");
    }

    public static int pedirNumeroLimitado(int min, int max){
        System.out.println("Indique un numero (" + min + "-" + max + ")");
        int num;
        do {
            num = pedirNumero();
            if(!limitesNumero(num, min, max)){
                System.out.println("Indique un número y/o carácter válido");
            }
        } while (!limitesNumero(num, min, max));
        return num;
    }

    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        do {
            try {
                numero = teclado.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Indique un número y/o carácter válido");
                teclado.nextLine();
            }
        } while (true);
        return  numero;
    }

    public static boolean limitesNumero(int num, int min ,int max){
        return (min <= num && num <= max);
    }

    public static boolean verificarPalindromo(String cadena){
        cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e")
                .replace("í", "i").replace("ó", "o").replace("ú", "u")
                .replace(" ", "").replace(".", "").replace(",", "");

        boolean verificar = tratarCadena(cadena);
        if (!verificar){
            return false;
        }else {
            String invertida = new StringBuilder(cadena).reverse().toString();
            return invertida.equals(cadena);
        }
    }

    public static boolean tratarCadena(String cadena) {
        if(cadena == null || cadena.equals("")) {
            System.out.println("frase o palabra ingresada nula");
            return false;
        }
        return true;
    }
/*
    public static boolean cadenaNumerica(String cadena){
        int numero;
        try {
            numero = Integer.parseInt(cadena);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

    }

 */

}
