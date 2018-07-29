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
    String geslacht = "Man";
    static Klant nieuw (int klantID){
        return new Klant();
    }

    int leeftijdBepalen(int leeftijd){
        Scanner inputB = new Scanner(System.in);
        int i = inputB.nextInt();
        leeftijd = i;
        return this.leeftijd;
    }
    String geslachtBepalen(String s){
        Scanner inputA = new Scanner(System.in);
        String i = inputA.nextLine();
        geslacht = i;
        return (this.geslacht);
    }

}

public class Main {

    public static void main(String[] args) {
        // vullen
        Scanner inputA = new Scanner(System.in);
        String u = "Man";
        int z = 0;
        ++z;
        Klant x = Klant.nieuw(z);
        x.leeftijdBepalen(z);
        x.geslachtBepalen(u);
    }
}

class Overslaan{
    void overrideSlaFaseOver(){
        System.out.println("U heeft nog niet alle opdrachten afgerond, wilt u toch doorgaan?");

    }
}