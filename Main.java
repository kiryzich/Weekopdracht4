package Qien.Weekopdracht4;

import java.util.Scanner;

class Klantreis{

}
class Fase1{ //orientatie
    // methodes: chat/onderzoek/praten/reviews/zelftest // schrijven test
    int chatten(){ // void naar int!
        int x = 0;
        return x;
    }
}
class Fase2{ //beslis
    // methodes:

}
class Fase3{ //wacht

}
class Fase4{ //start

}
class Fase5{ //behandeling

}
class Fase6{ //genezen

}

class Klant {
    int[][] arr = new int[5][6];
    /*  gevulde array geeft:
        Fase 1  [chat, onderzoek, praten, reviews, zelftest]
        Fase 2  []
        Fase 3  []
        Fase 4  []
        Fase 5  []
        Fase 6  []
     */

    int leeftijd = 0;
    String geslacht = "onbekend";
    String naam = "onbekend";

    static Klant nieuw(int klantID) {
        return new Klant();
    }

    int leeftijdBepalen(int leeftijd) {
//        System.out.println("De leeftijd is " +leeftijd); //Was een check
        System.out.println("DIT IS EEN FICTIEF PROGRAMMA, dus alle antwoorden en werkwijze zijn niet echt!");
        System.out.println("Om u het beste van dienst te kunnen zijn stellen wij even wat korte vragen.");
        System.out.println("Wat is uw leeftijd?");
        Scanner inputB = new Scanner(System.in);
        int i = inputB.nextInt();
        this.leeftijd = i;
        return this.leeftijd;
    }

    String geslachtBepalen(String s) {
//        System.out.println("Het geslacht is " +geslacht); //Was een check
        System.out.println("Wat is uw geslacht?");
        Scanner inputA = new Scanner(System.in);
        String i = inputA.nextLine();
        this.geslacht = i;
        return (this.geslacht);
    }

    String naamBepalen(String s) {
//        System.out.println("Het geslacht is " +geslacht); //Was een check
        System.out.println("Wat is uw naam?");
        Scanner inputA = new Scanner(System.in);
        String i = inputA.nextLine();
        this.naam = i;
        return (this.naam);
    }

    void voorstellen() {
        System.out.println(" Hallo " + naam + ",\n u bent " + leeftijd + " jaar oud, \n en u bent een " + geslacht + "."); // CHECK!
    }

    boolean fase1 = false;

    boolean vragenLijst() {
        //       System.out.println(fase1); // CHECK
        if (fase1 == false) {
            int x = 0;
            int y = 0;
            System.out.println("Wilt u zo vriendelijk zijn de volgende vragenlijst in te vullen?");
            klachten();
            klachten();
            klachten();
            klachten();
            klachten();
            klachten();
            klachten();
            klachten();
            klachten();
            klachten();


        } else {
            System.out.println("Wilt u zo de klachten nogmaals zien? \n 1 - JA. \n 2 - NEE");
            Scanner inputC = new Scanner(System.in);
            int i = inputC.nextInt();
            switch (i) {

                case 1:
                    vragenLijst();
                    break;
                default:
                    break;
            }
        }      //  System.out.println(fase1); // CHECK
        fase1 = true;
        return this.fase1;

    }

    int[] klachtenArray = new int[10];

    int klachten() {
        if (klachtenArray[0] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("Heeft u last van PIEKEREN? \n    1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            i = 1;
            klachtenArray[0] = i;
            return klachtenArray[0];
        } else if (klachtenArray[1] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("Heeft u last van SLAAPTEKORT? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            i = 1;
            klachtenArray[1] = i;
            return klachtenArray[1];
        }
        return 99; // randomnummer lol!
    }
}
public class Main {

    public static void main(String[] args) {
        // vullen
        Scanner inputA = new Scanner(System.in);
        String u = " - "; // gaat het raam uit maar is nodig
        int z = -1; // gewoon omdat dat de check dan 0 print
 //       int[][] arr = arr[1][1];
        ++z;
        Klant x = Klant.nieuw(z);
        x.leeftijdBepalen(z);
        x.geslachtBepalen(u);
        x.naamBepalen(u);
        x.voorstellen();
        x.vragenLijst();

 //       x.klachten(arr [][]);
    }
}

class Overslaan{
    void overrideSlaFaseOver(){
        System.out.println("U heeft nog niet alle opdrachten afgerond, wilt u toch doorgaan?");

    }
}
