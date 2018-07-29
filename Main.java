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

class Klant{
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
    static Klant nieuw (int klantID){
        return new Klant();
    }

    int leeftijdBepalen(int leeftijd){
//        System.out.println("De leeftijd is " +leeftijd); //Was een check
        System.out.println("Om u het beste van dienst te kunnen zijn stellen wij even wat korte vragen.");
        System.out.println("Wat is uw leeftijd?");
        Scanner inputB = new Scanner(System.in);
        int i = inputB.nextInt();
        this.leeftijd = i;
        return this.leeftijd;
    }
    String geslachtBepalen(String s){
//        System.out.println("Het geslacht is " +geslacht); //Was een check
        System.out.println("Wat is uw geslacht?");
        Scanner inputA = new Scanner(System.in);
        String i = inputA.nextLine();
        this.geslacht = i;
        return (this.geslacht);
    }

    String naamBepalen(String s){
//        System.out.println("Het geslacht is " +geslacht); //Was een check
        System.out.println("Wat is uw naam?");
        Scanner inputA = new Scanner(System.in);
        String i = inputA.nextLine();
        this.naam = i;
        return (this.naam);
    }
    void voorstellen(){
        System.out.println(" Hallo " + naam + ",\n u bent " +leeftijd+ " jaar oud, \n en u bent een " +geslacht +"."); // CHECK!
    }

}

public class Main {

    public static void main(String[] args) {
        // vullen
        Scanner inputA = new Scanner(System.in);
        String u = " - ";
        int z = -1;
        ++z;
        Klant x = Klant.nieuw(z);
        x.leeftijdBepalen(z);
        x.geslachtBepalen(u);
        x.naamBepalen(u);
        x.voorstellen();
    }
}

class Overslaan{
    void overrideSlaFaseOver(){
        System.out.println("U heeft nog niet alle opdrachten afgerond, wilt u toch doorgaan?");

    }
}