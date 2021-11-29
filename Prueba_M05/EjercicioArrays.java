import java.util.Random;

// import java.util.Random;
// import java.util.Scanner;

public class EjercicioArrays {
    public static void main(final String[] args) {
                
// Scanner sc=new Scanner(System.in);

//Ejercicio 1

    // int[] array = new int [6];  //6 posiciones libres para la lista
    // int notaMax = 0;
    // int notaMin = 10;
    // float total = 0;    //variable para la media

    // for (int i = 0; i < array.length; i++) {        //Cuenta más 1 las posiciones de la lista
    //     System.out.print("Inserte al nota: ");      
    //     array[i] = sc.nextInt();                    //Rellenar cada posicion de la array con lo que insertemos 
    // }
    // sc.nextLine();

    // for (int i = 0; i < array.length; i++) {       
    //     if (array[i] >= notaMax) {                  //Comparamos el valor de la array con la variable maxima
    //         notaMax = array[i];                     //Asignamos el valor a más alto del array a variable notaMax
    //     }
    // }
    // for (int i = 0; i < array.length; i++) {
    //     if (array[i] <= notaMin) {
    //         notaMin = array[i];
    //     }
    // }
    // System.out.println("La nota minima es: " + notaMin);
    // System.out.println("La nota maxima es: " + notaMax);

    // for (int i = 0; i < array.length; ++i) {
    //     total += array[i];
    //     }

    // if (notaMin <5){
    //     System.out.println("Modulo suspendido");
    // } else {
    //     System.out.printf("Mitjana: %.1f\n", ((float)total / array.length));
    // }
  
    // sc.close();

//Ejercicio 2
    // int[] nota = new int [10];
    // int [] aprobados = new int [10];
    // int[] suspendidos = new int [10];
    // int nA = 0;
    // int nS = 0;
    // int total = 0;

    // //Crear array de notas a mano
    // for (int i = 0; i < nota.length; i++) {      
    //     System.out.print("Inserte al nota: ");      
    //     nota[i] = sc.nextInt();       
    // }

    // //Separar las notas de la array principal a una array de aprobados y otra de suspendidos
    // for (int i = 0; i < nota.length; i++) {
    //     if (nota[i] >= 5){
    //         aprobados[nA] = nota[i];
    //         nA++;
    //     } else {
    //         suspendidos[nS] = nota[i];
    //         nS++;
    //     }
    // }

    // for (int i = 0; i < nA; i++){
    //     System.out.print(aprobados[i] + ", ");
    //     System.out.println();
    // }

    // for (int i = 0; i <= nA; i++){
    //     total += aprobados[i];
    // }
    // System.out.printf("Mitjana: %.1f\n", ((float)total / nA));


    // System.out.println("Han aprobado " + nA + " alumnos.");
    // System.out.println("Han suspendido " + nS + " alumnos.");

    // sc.close();

//Ejercicio 3

    // Random random = new Random();
    // int[] array1 = new int [1000];
    // int pares = 0;

    // for (int i = 0; i < array1.length; i++) { 
    //     array1[i]= random.nextInt(9900)+100;
    //     if (array1[i] % 2 == 0 && pares < 10) {
    //         System.out.println("Par: " + array1[i]);
    //         pares++;
    //     }
    // }       
        
//Ejercicio 4

    // int[] lista1 = new int [10];
    // int[] lista2 = new int [10];
    // int[] resultado = new int [10];
    // Random random = new Random();

    // for (int i = 0; i < 10; i++) {
    //     lista1[i] = random.nextInt(99)+1;
    //     lista2[i] = random.nextInt(99)+1;
    //     resultado[i] = lista1[i] * lista2[i];
    // }

    // System.out.println("Lista1: ");
    // for (int i = 0; i < 10; i++){
    //     System.out.print(lista1[i] + " ");
    // }
    // System.out.println();

    // System.out.println("Lista2: ");
    // for (int i = 0; i < 10; i++){
    //     System.out.print(lista2[i] + " ");
    // }
    // System.out.println();
    
    // System.out.println("Resultado ");
    // for (int i = 0; i < 10; i++){
    //     System.out.print(resultado[i] + " ");
    // }

//Ejercicio 5
    // char[] array = new char [10];
    // char temp;
    // int contador = array.length -1;

    // System.out.println("Lista de letras random ordenada: ");
    // for (int i = 0; i < array.length; ++i){
    //     array[i] = (char)(Math.random() * ('Z' - 'A' + 1) + 'A');
    //     System.out.print((char)array[i] + " ");
    // }
    // System.out.println();

    // System.out.println("\nLista de letas random inversas");
    // for (int i = array.length -1; i >=0; --i){
    //     System.out.print((char)array[i] + " ");
    // }
    // System.out.println();

    // for (int i = 0, j = array.length -1; i < array.length / 2; i++, j--){
    //     temp = array[j];
    //     array[j] = array[i];
    //     array[i] = temp;
    // }
    // System.out.println(array);

//Ejercicio 6
    // int[] array = new int[5];
    // Random random = new Random();

    
    // for(int i = 0; i < array.length; i++){
    //     array[i] = random.nextInt(5);
    //     if (array[i] > array[i+1]) {
    //         System.out.println("La lista está ordenada de más grande a más pequeño.");
    //     } else if (array[i] < array[i+1]) {
    //         System.out.println("La lista está ordenada de más pequeño a más grande.");
    //     } else {
    //         System.out.println("La lista no está ordenada.");
    //     }
    // }

//Ejercicio 7
    int[] array1 = {1, 1, 1, 1, 1};
    int[] array2 = {2, 2, 2, 2, 2};
    int[] resultado = new int[10];

    for(int i = 0; i < array1.length; i++){
        System.out.print(array1[i] + " ");
        System.out.print(array2[i] + " ");
    }

    for(int i = 0; i < resultado.length; i++){
        
    }
    System.out.println();










//Ejercicio 8
    // int[] array = new int[10];
    // Random random = new Random();
    // int resultado = 0;
    
    // System.out.println("Lista de numeros aleatoria: ");
    // for (int i = 0; i < array.length; i++) {
    //     array[i] = random.nextInt(99);
    //     System.out.print(array[i] + " ");
    // }
    // System.out.println();

    // System.out.println("\nSuma entre extremos: ");
    // for (int i = 0; i < array.length; i+=2) {
    //     resultado = array[i] + array[i+1];
    //     System.out.print(resultado + " ");
    // }
    // System.out.println();


    


















    }
}
