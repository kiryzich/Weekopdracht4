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
    int romScore = 0;
    int leeftijd = 0;
    String geslacht = "onbekend";
    String naam = "onbekend";

    static Klant nieuw(int klantID) {
        return new Klant();
    }

    int leeftijdBepalen(int leeftijd) {
        System.out.println("De leeftijd is " +leeftijd); //Was een check
        System.out.println("================================================================");
        System.out.println("DIT IS EEN FICTIEF PROGRAMMA, dus alle antwoorden en werkwijze zijn niet echt!");
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
        System.out.println("Het geslacht is " +geslacht); //Was een check
        System.out.println("Wat is uw geslacht?");
        System.out.println("================================================================");
        Scanner inputA = new Scanner(System.in);
        String i = inputA.nextLine();
        this.geslacht = i;
        return (this.geslacht);
    }

    String naamBepalen(String s) {
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
    //[Piekeren,Slaapproblemen,Eenzaamheid,SOA,Dronken,junkie,

    int klachten() throws nummerException{
        if (klachtenArray[0] == 0) {
                Scanner inputC = new Scanner(System.in);
                System.out.println("1/10) Heeft u last van PIEKEREN? \n    1 - JA. \n     2 - NEE");
                int i = inputC.nextInt();
                if (i >3)
            try {
                System.out.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                klachten();
            } catch (Exception a){
            }
            else if (i<3) {
                klachtenArray[0] = i;
                return klachtenArray[0];
            }

        } else if (klachtenArray[1] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("2/10) Slaapt u voldoende? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >3)
                try {
                    System.out.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<3) {
                klachtenArray[1] = i;
                return klachtenArray[1];
            }

        }else if (klachtenArray[2] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("3/10) Bent u wel eens eenzaam? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >3)
                try {
                    System.out.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<3) {
                klachtenArray[2] = i;
                return klachtenArray[2];
            }

        }else if (klachtenArray[3] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("4/10) Heeft u problemen op sexueel gebied? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >3)
                try {
                    System.out.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<3) {
                klachtenArray[3] = i;
                return klachtenArray[3];
            }

        }else if (klachtenArray[4] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("5/10) Drinkt u overmatig alcohol? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >3)
                try {
                    System.out.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<3) {
                klachtenArray[4] = i;
                return klachtenArray[4];
            }

        }else if (klachtenArray[5] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("6/10) Gebruikt u regelmatig drugs? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            if (i >3)
                try {
                    System.out.println("U kunt alleen 01 (wat staat voor JA) of 02 (wat staat voor NEE) kiezen!");
                    klachten();
                } catch (Exception a){
                }
            else if (i<3) {
                klachtenArray[5] = i;
                return klachtenArray[5];
            }
            
        }else if (klachtenArray[6] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("7/10) Raakt u wel eens in paniek? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            klachtenArray[6] = i;
            return klachtenArray[6];
        }else if (klachtenArray[7] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("8/10) Voelt u zich wel eens somber? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            klachtenArray[7] = i;
            return klachtenArray[7];
        }else if (klachtenArray[8] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("9/10) Heeft u een laag zelfbeeld? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            klachtenArray[8] = i;
            return klachtenArray[8];
        }else if (klachtenArray[9] == 0) {
            Scanner inputC = new Scanner(System.in);
            System.out.println("10/10) Heeft u problemen in uw relatie? \n     1 - JA. \n     2 - NEE");
            int i = inputC.nextInt();
            klachtenArray[9] = i;
            return klachtenArray[9];
        }else{
        }
        return 99; // randomnummer lol!
    }
}
public class Main {

    public static void main(String[] args) throws nummerException{
        // vullen
        Scanner inputA = new Scanner(System.in);
        String u = " - "; // gaat het raam uit maar is nodig
        int z = -1; // gewoon omdat dat de check dan 0 print
 //       int[][] arr = arr[1][1];
        ++z;
        Klant misterX = Klant.nieuw(z);
        misterX.leeftijdBepalen(z);
        misterX.geslachtBepalen(u);
        misterX.naamBepalen(u);
        misterX.voorstellen();
        misterX.vragenLijst();

 //       x.klachten(arr [][]);
    }
}

class Overslaan{
    void overrideSlaFaseOver(){
        System.out.println("U heeft nog niet alle opdrachten afgerond, wilt u toch doorgaan?");

    }
}

class nummerException extends Exception{}