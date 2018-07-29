package Qien.Weekopdracht4;

import java.util.Scanner;

abstract class Klantreis{
abstract void naarVolgendeFase();
}
class Fase1 extends Klantreis{ //orientatiefase
    // methodes: chat/onderzoek/praten/reviews/zelftest // schrijven test (niet meer van toepassing)
    Fase1(){
        System.out.println("================================================================");
        System.out.println("Orientatiefase");
        System.out.println("================================================================");
    }
    boolean chat;
    boolean onderzoek;
    boolean praat;
    boolean review;
    boolean zelftest;
    int counterLaag = 0;
    int counterHoog = 0;
    int fase1Methodes(){
        System.out.println("Orientatiefase");
        System.out.println("================================================================");
        Scanner inputC = new Scanner(System.in);
        if (chat == false) {
            System.out.println("Wilt u met een mederwerker chatten over uw klachten?");
            System.out.println("Kies 1 voor ja, kies 2 voor nee.");
            int a = inputC.nextInt();
            if (a == 1) {
                chatten(false);
            }
        }
        if (onderzoek == false){
            System.out.println("Wilt u met een mederwerker chatten over uw klachten?");
            System.out.println("Kies 1 voor ja, kies 2 voor nee.");
            int b = inputC.nextInt();
            if (b == 1){
                onderzoeken(false);
            }
        }
        return 1;
    }
    int chatten(boolean chat){
        System.out.println("================================================================");
        System.out.println("U heeft besloten om te chatten met een medewerker voor meer informatie");
        System.out.println("Deze heeft u meer inzicht gegeven in uw klachten");
        System.out.println("================================================================");
        counterLaag = ++counterLaag;
        if (chat == false){
            this.chat = true;
        }
        return counterLaag;
    }
    int onderzoeken(boolean onderzoek){
        System.out.println("================================================================");
        System.out.println("U heeft besloten om  online meer onderzoek te doen en op zoek te gaan naar extra informatie");
        System.out.println("Dit heeft u meer inzicht gegeven in uw klachten");
        System.out.println("================================================================");
        counterLaag = ++counterLaag;
        if (onderzoek == false){
            this.onderzoek = true;
        }
        return counterHoog;
    }
    int praten(boolean praat){
        return counterHoog;
    }
    int reviewsLezen(boolean review){
        return counterLaag;
    }
    public void naarVolgendeFase(){
        if (chat == true){
            if (onderzoek == true){
                if (praat == true){
                    if (review == true){
                        if (zelftest == true){
                            Fase2 fase2 = new Fase2();
                            fase2.fase2Methodes();
                        }
                    }
                }
            }
        }
        return;
    }
}
class Fase2 extends Klantreis{ //beslisfase
    // methodes:
    int fase2Methodes(){
        return 1;
    }
    void naarVolgendeFase(){
        return;
    }
}
class Fase3 extends Klantreis{ //wachtfase
    void naarVolgendeFase(){
        return;
    }
}
class Fase4 extends Klantreis{ //startfase
    void naarVolgendeFase(){
        return;
    }
}
class Fase5 extends Klantreis{ //behandelingfase
    void naarVolgendeFase(){
        return;
    }
}
class Fase6 extends Klantreis{ //genezenfase
    void naarVolgendeFase(){
        return;
    }
}

class Klant {
 //   int[][] arr = new int[5][6];
    /*  gevulde array geeft:
        Fase 1  [chat, onderzoek, praten, reviews, zelftest]
        Fase 2  []
        Fase 3  []
        Fase 4  []
        Fase 5  []
        Fase 6  []
     */
//    int romScore = 0;
    int leeftijd = 0;
    String geslacht = "onbekend";
    String naam = "onbekend";

    static Klant nieuw(int klantID) {
        return new Klant();
    }

    int leeftijdBepalen(int leeftijd) {
        System.out.println("================================================================");
        System.err.println("DIT IS EEN FICTIEF PROGRAMMA, dus alle antwoorden en werkwijze zijn niet echt!");
        System.out.println("De leeftijd is " +leeftijd); //Was een check
        System.out.println();
        System.out.println("Om u het beste van dienst te kunnen zijn stellen wij even wat korte vragen.");
        System.out.println("================================================================");
        System.out.println("Wat is uw leeftijd?");
        System.out.println("================================================================");
        Scanner inputB = new Scanner(System.in);
        int i = inputB.nextInt();
        this.leeftijd = i;
        return this.leeftijd;
    }

    String geslachtBepalen(String s) {
        System.out.println("================================================================");
        System.out.println("Het geslacht is " +geslacht); //Was een check
        System.out.println("Wat is uw geslacht?");
        System.out.println("================================================================");
        Scanner inputA = new Scanner(System.in);
        String i = inputA.nextLine();
        this.geslacht = i;
        return (this.geslacht);
    }

    String naamBepalen(String s) {
        System.out.println("================================================================");
        System.out.println("De naam is " +naam); //Was een check
        System.out.println("Wat is uw naam?");
        System.out.println("================================================================");
        Scanner inputA = new Scanner(System.in);
        String i = inputA.nextLine();
        this.naam = i;
        return (this.naam);
    }

    void voorstellen() {
        System.out.println("================================================================");
        System.out.println(" Hallo " + naam + ",\n u bent " + leeftijd + " jaar oud, \n en u bent een " + geslacht + "."); // CHECK!
        System.out.println("================================================================");
    }

    boolean fase1 = false;

    boolean vragenLijst() throws nummerException{
        //       System.out.println(fase1); // CHECK
        if (fase1 == false) {
            int x = 0;
            int y = 0;
            System.out.println("================================================================");
            System.out.println("Wilt u zo vriendelijk zijn de volgende vragenlijst in te vullen?");
            System.out.println("Deze vragen hebben betrekking op de laatste week.");
            System.out.println("================================================================");
            for (x=0; x<10;x++) {
                klachten();
            }

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
    int romCounter;
    int klachten() throws nummerException{
        if (klachtenArray[0] == 0) {
                Scanner inputC = new Scanner(System.in);
                System.out.println("1/10) Heeft u last van PIEKEREN? \n    1 - JA. \n     2 - NEE");
                int i = inputC.nextInt();
                if (i >2)
            try {
                System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                klachten();
            } catch (Exception a){
            }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[0] = i;
                return klachtenArray[0];
            }

        } else if (klachtenArray[1] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("2/10) Slaapt u voldoende? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[1] = i;
                return klachtenArray[1];
            }

        }else if (klachtenArray[2] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("3/10) Bent u wel eens eenzaam? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[2] = i;
                return klachtenArray[2];
            }

        }else if (klachtenArray[3] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("4/10) Heeft u problemen op sexueel gebied? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[3] = i;
                return klachtenArray[3];
            }

        }else if (klachtenArray[4] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("5/10) Drinkt u overmatig alcohol? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[4] = i;
                return klachtenArray[4];
            }

        }else if (klachtenArray[5] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("6/10) Gebruikt u regelmatig drugs? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[5] = i;
                return klachtenArray[5];
            }

        }else if (klachtenArray[6] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("7/10) Raakt u wel eens in paniek? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[6] = i;
                return klachtenArray[6];
            }
        }else if (klachtenArray[7] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("8/10) Voelt u zich wel eens somber? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[7] = i;
                return klachtenArray[7];
            }
        }else if (klachtenArray[8] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("9/10) Heeft u een laag zelfbeeld? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[8] = i;
                return klachtenArray[8];
            }
        }else if (klachtenArray[9] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("10/10) Heeft u problemen in uw relatie? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >2)
                try {
                    System.err.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<2) {
                this.romCounter = ++romCounter;
                klachtenArray[9] = i;
                return klachtenArray[9];
            }
        }else{
        }
        return 99; // randomnummer lol!
    }
    int romPrinten(){
        System.out.println("uw ROM score is " + (romCounter*15));
        return 377;
    }
}
public class Main {

    public static void main(String[] args) throws nummerException{
        // vullen
//        Scanner inputA = new Scanner(System.in);
        String u = " - "; // gaat het raam uit maar is nodig
        int z = -1; // gewoon omdat dat de check dan 0 print
        ++z;

        Klant misterX = Klant.nieuw(z);
        misterX.leeftijdBepalen(z);
        misterX.geslachtBepalen(u);
        misterX.naamBepalen(u);
        misterX.voorstellen();
        misterX.vragenLijst();
        misterX.romPrinten();
        Fase1 fase1 = new Fase1();
        fase1.fase1Methodes();


    }
}

interface Fase1Overslaan{
    public void overrideSlaFaseOver();
 //       System.out.println("U heeft nog niet alle opdrachten afgerond, wilt u toch doorgaan?");
}

class nummerException extends Exception{}