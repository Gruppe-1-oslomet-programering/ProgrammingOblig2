package Oblig2;

import javax.swing.*;


class Tallspill {
int nyttTall;
int tall;
int test;
public int gjetting;
String spillIgjen;
String melding;


    Tallspill(){
        kjørSpill();




    }

    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
        return nyttTall;
    }

    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks.
        if (test == 1){
            //JOptionPane.showMessageDialog(null, "Too low");
            melding = "Too low";

        } else if (test == 2) {
            //JOptionPane.showMessageDialog(null, "Too high");
            melding = "Too high";

        } //else if (test ==3) {
            //JOptionPane.showMessageDialog(null, "You won");

        }

        {

        }




    private void forLite(int tall){
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
        if (gjetting < nyttTall){
            //JOptionPane.showMessageDialog(null, "Too low");
            tall++;
            test = 1;

        }


    }




    private void forStort(int tall) {
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
        if (gjetting>nyttTall){
            //JOptionPane.showMessageDialog(null, "Too high");
            test = 2;
            tall++;

        }
    }

    public void avsluttRunde(int tall, int Gjetting) {
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
        if (tall == 10){
            JOptionPane.showMessageDialog(null, "Du tapte, det riktige tallet var: "+ nyttTall);
        } else if (Gjetting == nyttTall) {
            JOptionPane.showMessageDialog(null, "Du vant");


        }


    }




    public void kjørSpill() {
    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
        //nyttTall = (int)(Math.random()*201);
        nyttTall = 35;
        tall = 0;
        test = 0;
    }

}

public class Oblig2_Right {
    public static void main(String[] args){


        Tallspill spill = new Tallspill();
        String innGjett;
        int startSpill = 0;



        JOptionPane.showMessageDialog(null, "Jeg tenker på et tall mellom 1 til 200");
        while (startSpill != 0){



        }
        innGjett = JOptionPane.showInputDialog("Velnlist gjett et tall");






    }
}
