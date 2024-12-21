package Vorlesung3;

import java.util.Scanner;

public class SwitchAufgabe2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int tagenBisTreffen;
        int aktuellerTag;
        int treffenTag;

        String[] Days = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        System.out.println("Aktueller Tag: ");
        aktuellerTag = sc.nextInt();

        System.out.println("Tagen bis treffen: ");
        tagenBisTreffen = sc.nextInt();

        treffenTag = (aktuellerTag + tagenBisTreffen) % 7;

        switch (treffenTag) {
            case 0:
                System.out.println("Treffen am: " + Days[0]);
                break;
            case 1:
                System.out.println("Treffen am: " + Days[1]);
                break;
            case 2:
                System.out.println("Treffen am: " + Days[2]);
                break;
            case 3:
                System.out.println("Treffen am: " + Days[3]);
                break;
            case 4:
                System.out.println("Treffen am: " + Days[4]);
                break;
            case 5:
                System.out.println("Treffen am: " + Days[5]);
                break;
            case 6:
                System.out.println("Treffen am: " + Days[6]);
                break;
            default:
                System.out.println("Fehler aufgetreten");
                break;
        }
    }
}
