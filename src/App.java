import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asiganciones
        String Palabrasecreta = "inteligencia";
        int IntetosMaximos = 10;
        int intentos = 0;
        boolean palabraadivinada = false;
        
        //Arreglos;

        char[] letrasAdivinadas = new char[Palabrasecreta.length()];
        //Estructura de control: Iterativas (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);
        }
        
        
        //Estructura de control: Iterativas (wlile)
        while (!palabraadivinada && intentos < IntetosMaximos) {

                                                            //Esto se usa cuando tenemos una palabra de chars 
            System.out.println("Palabra a advinar: "+ String.valueOf(letrasAdivinadas) + " ( " + Palabrasecreta.length()+ " letras)");
            System.out.println("Introduce una letra, por favor ");

            //Usamos la clase scanner para pedir una letra
                        //Character.toLowerCase convirte mayusculas a minuscula. Alreves toUpperCase
            char letra = Character.toLowerCase(scanner.next().charAt(0)); 
            boolean letracorecta = false;
            //Estructura de control: Iterativas (Bucle)
            for (int i = 0; i < Palabrasecreta.length(); i++) {

                //Estructura de control: condicional

                if (Palabrasecreta.charAt(i)== letra) {
                    letrasAdivinadas[i] = letra; 
                    letracorecta = true;
                    
                }
            }
                if (!letracorecta) {
                    intentos++;
                    System.out.println("¡Incorecto! Te quedan " + (IntetosMaximos - intentos)+ " intentos.");
                    
                }
                
        

            if (String.valueOf(letrasAdivinadas).equals(Palabrasecreta)) {
                palabraadivinada = true;
                System.out.println("¡Felicidades!, has adivinado la palabra correcta: "+ Palabrasecreta);
                
            }
        }

        if (!palabraadivinada) {
        System.out.println("¡Qué pena te has quedado sin intentos! GAME OVER");            
        }
        scanner.close();


    }
}
