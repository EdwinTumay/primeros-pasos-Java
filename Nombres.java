import java.util.Scanner;

public class Nombres {
    public static void main(String[] args) {
        
        String nombre_uno = "", nombre_dos = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor ingrese el primer nombre: ");
        nombre_uno = entrada.nextLine();

        System.out.print("Por favor ingrese el segundo nombre: ");
        nombre_dos = entrada.nextLine();

        if(nombre_uno.equals(nombre_dos)){
            System.out.println("Los nombres son iguales");
        } else {
            System.out.println("Los nombres son diferentes");
        }
        
    }
    
}