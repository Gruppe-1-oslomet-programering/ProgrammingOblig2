/*Oppgave 1
Lag et program som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
Programmet skal starte med å lese inn nedre og øvre grense for summen.
Dersom innlest øvre grense er mindre enn eller lik nedre grense,
skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing.
Når godkjente grenser er lest inn, skal programmet beregne nevnte sum og summen
skal så skrive den ut som en sum. Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives ut
følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".

Test ut programmet med nedre grense lik 1 og øvre grense lik 100.
Legg inn et linjeskift for hvert 10. tall i summen.
 */
import javax.swing.*;

public class Oppgave1 {
    public static void main(String []args){
        JOptionPane.showMessageDialog(null,
                "Her er et program som skal berenge summen av alle tall mellom to grenser du bestemmer.");
        while(true) {
            String inTall1 = JOptionPane.showInputDialog(
                    "Vennligst skriv inn nedre grensen: ");
            String inTall2 = JOptionPane.showInputDialog("Vennligst skriv inn øvre grensen: ");
            try {
                int nedre = Integer.parseInt(inTall1);
                int øvre = Integer.parseInt(inTall2);
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Vennligst prøv igjen.");
                continue;
            }

            int nedre = Integer.parseInt(inTall1);
            int øvre = Integer.parseInt(inTall2);

            if (nedre >= øvre) {
                JOptionPane.showMessageDialog(null,
                        "Øvre grense er mindre enn eller lik nedre grense\n" +
                        "Vennligst prøv igen.");
                continue;
                }

                if(nedre<øvre){
                    /*Når godkjente grenser er lest inn, skal programmet beregne nevnte sum og summen
                    skal så skrive den ut som en sum. Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives ut
                    følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35"*/
                    int sum=0;
                    for(int l=nedre;l<øvre;){
                            for(int i=0;i<10;i++){
                                if(l<øvre){
                                System.out.print(l+++" + ");
                                sum += l;}
                            }
                            if(l==øvre){
                                int sum1= sum+nedre;
                            System.out.print(l+ " = "+sum1);
                            }
                            System.out.print("\n");
                        }
                    }
                    break;
                }
            }



        }
