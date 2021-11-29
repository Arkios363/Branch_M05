// hecho por Alex Trebejo 

import java.util.Scanner;

public class Prac1 {
    public static void main(final String[] args) {
                
    Scanner scan=new Scanner(System.in);

    String [] codis = {"CBN01", "CC01", "LC01", "P500", "P1000", "FS", "FM", "FL", "J01", "J02", "J03", "J04", "D01", "D02", "D03", "D04" };
    String [] articles = {"Còmic blanc i negre", "Còmic color", "Llibre color", "Puzzle 500 peces", "Puzzle 1000 peces", "Figura petita", "Figura mitjana", "Figura gran", "Joc Star Trek", "Joc Star Wars", "Joc Dungeons & Dragons", "Joc World of Warcraft", "Disfressa Batman", "Disfressa Super Girl", "Disfressa Iron Man", "Disfressa Cat Woman"};
    double [] preus = {16.20, 20.50, 32.80, 8.10, 10.30, 9.00, 12.00, 19.00, 22.40, 27.90, 45.40, 49.90, 28.50, 34.60, 28.50, 34.60};
    int [] iva = {10, 10, 10, 10, 10, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21};
    double [] pvp = new double [16];
    String nif = "";
    String [] cistellaCodi = new String [6];
    int [] cistellaUnitats = new int [6];
    String comprar = "";
    double temp = 0;
    double temp1 = 100000;
    int contador = 0;

    //Calcul pvp
    for (int i = 0; i < 16; i++){
        pvp [i] = (preus [i] * (iva [i] / 100));

    }

    // Mostrar el codi, descripció i pvp de l'article més barat i del més car
    for (int i = 1; i < 16; ++i) {
        if (pvp[i] < temp1) temp1 = pvp[i];
        if (pvp[i] > temp) temp = pvp[i];
        }
        

    System.out.println("El producto mas caro es "+ temp);
    System.out.println("El producto mas barato es "+ temp1);
    System.out.println();

   
    // Mostrar totes les dades de tots els articles
    for (int i = 0; i < 16; i++){
        System.out.print(codis[i] + " ");
        System.out.print(articles[i] + " ");
        System.out.print(preus[i] + " ");
        System.out.print(iva[i] + " ");
        System.out.println(pvp[i] + " ");

    }

    System.out.println();

    //Pregunta NIF
    System.out.println("Cual es tu NIF?");
    nif = scan.nextLine();

    //Pregunta al client
    for (int i = 0; i < 6; i++){

        if (comprar.equals("COMPRAR")){
            break;
        }

        else {

            System.out.println("Codi del article");
            cistellaCodi [i] = scan.nextLine();

            System.out.println("Cuantas unitats vols?");
            cistellaUnitats [i] = scan.nextInt();
            scan.nextLine();
            contador++;

            System.out.println("Si quiere acabar la compra escriba comprar, si quiere seguir pulse intro");
            comprar = scan.nextLine().toUpperCase();
        }
    }
        
    System.out.println("NIF: "+nif);

    for (int i = 0 ; i < contador ; i++){
        System.out.println();
        System.out.println("Codis: " + cistellaCodi[i]);
        System.out.println("PVP: " + pvp [i]);
        System.out.println("Unitats: " + cistellaUnitats[i]);
        System.out.println("Import: " + (pvp [i] * cistellaUnitats [i]) );
    }




    scan.close();
    }
}
