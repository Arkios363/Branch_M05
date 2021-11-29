//Modificado por Aaron Lopez 

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EjercicioArrays2 {
    public static void main(final String[] args) {

//Ejercicio 1
    // Scanner sc = new Scanner(System.in);
    
    // String frase;
    // String[] palabras;
    
    // System.out.println("Escribe una frase: ");
    // frase = sc.nextLine();
    // palabras = frase.trim().split(", +");
    // for(int i = palabras.length - 1; i>=0; i--){
    //     System.out.println(palabras[i] + " ");
    // }
    // System.out.println();
    // sc.close();

//Ejercicio 2



// cifrado[i] -= max - min -1;

// //Ejercicio 4
//     Scanner sc = new Scanner(System.in);
//     Random random = new Random();
//     String[] hobbies = new String[4];
//     String[] comida = new String[6];
//     String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

//     //Rellenar arrays con los datos
//     System.out.println("Escribe tus 4 hobbies: ");
//     for(int i = 0; i < hobbies.length; i++){
//         hobbies[i] = sc.nextLine();
//     }
//     //Rellenar arrays con los datos
//     System.out.println("Escribe tus 6 comidas preferidas: ");
//     for(int i = 0; i < comida.length; i++){
//         comida[i] = sc.nextLine();
//     }
    
//     System.out.printf("%-13s %-25s %-25s %-25s \n"," ","Esmorzar", "Sopar", "Dinar");

//     for (int i = 0; i < 5 ; i++) {
//     String r = hobbies[(random.nextInt(hobbies.length))];
//     String s = comida[(random.nextInt(comida.length))];
//     String texto1 = r+ "|" +s;
//     String a = hobbies[(random.nextInt(hobbies.length))];
//     String b = comida[(random.nextInt(comida.length))];
//     String texto2 = a+ "|" +b;
//     String c = hobbies[(random.nextInt(hobbies.length))];
//     String d = comida[(random.nextInt(comida.length))];
//     String texto3 = c+ "|" +d;
//     System.out.printf("%-13s %-25s %-25s %-25s \n", dias[i],texto1,texto2,texto3);

//     }
//     sc.close();

//Ejercicio 5 (Algoritmo de busqueda binaria)

    //Algoritmo de busqueda binaria
    // int n[] = {3,4,6,9};      // Llista de valors
    // int valor = 6;            // Valor buscat
    // int min = 0;              // Primera posició de la llista
    // int max = n.length - 1;   // Última posició de la llista
    // int mid = 0;              // Posició central (inicialitzar per evitar error)

    // while (min <= max) {
    // mid = (min + max) / 2;  // Calcular la posició central del tram entre min i max
    // if (n[mid] < valor) {
    //     min = mid + 1;        // Agafar la meitat superior
    // } else if (n[mid] > valor) {
    //     max = mid - 1;        // Agafar la meitat inferior
    // } else {
    //     break;                // Valor trobat
    // }
    // }

    // if (n.length > 0 && n[mid] == valor) {
    // System.out.println("S'ha trobat el valor en la posició " + (mid + 1) + "/" + (max +1));
    // } else {
    // System.out.println("NO s'ha trobat el valor en la llista");
    // }

//Ejercicio 5 (Algoritmo sencillo (y lento) de ordenacion)

    // int n[] = {9,4,6,3};
    // int t;

    // // Agafa el primer valor entre el primer i el penúltim
    // for (int i = 0; i < n.length - 1; i++) {
    //     // Agafa el segon valor entre el següent al primer i l'últim
    //     for (int j = i + 1; j < n.length; j++) {
    //         // Intercanviar si el primer és més gran que el segon
    //         if (n[i] > n[j]) {
    //         t = n[i];
    //         n[i] = n[j];
    //         n[j] = t;
    //         }
    //     }
    // }

    // // Mostrar els valors ja ordenats: 3, 4, 6 i 9
    // for (int i = 0; i < n.length; i++) {
    // System.out.println(n[i]);
    // }      

//Ejercicio 6
    Scanner sc = new Scanner(System.in);
    String[] palabras = new String[10];
    String temp;

    //Pedimos las 10 palabras y las añadimos a la array
    System.out.println("Dime 10 palabras: ");
    for(int i = 0; i < palabras.length; i++){
        palabras[i] = sc.nextLine();
        palabras[i] = palabras[i].toLowerCase();
    }

    // Agarro una palabra y no la cambio hasta que el siguiente for no termine el ciclo. (Este va del primero al penultimo)
    for (int i = 0; i < palabras.length - 1; i++) {
        //Agarro una posicion más que i hasta las ultima.
        for (int j = i + 1; j < palabras.length; j++) {
            // Intercambiar si el primero es más grande que el segundo
            if (palabras[i].compareTo(palabras[j]) > 0) {
            temp = palabras[i];
            palabras[i] = palabras[j];
            palabras[j] = temp;
            }
        }
    }
    System.out.println();

    // Muestra las palabras ya ordenadas
    System.out.println("Resultado de las palabras ordenadas: ");
    for (int i = 0; i < palabras.length; i++) {
    System.out.println(palabras[i]);
    }













    

    sc.close();

    }
}
