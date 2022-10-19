import javax.swing.*;

import static javax.swing.JOptionPane.*;

class Tallspill {

    public int nyttTall() {
        int nyttTall =(int) (Math.random() * 201);
        return nyttTall;
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200
    }

    public int visMelding(){
            String melding= JOptionPane.showInputDialog("Jeg tenker på en nummer mellom 0 og 200.\n" +
                "Prøv å gjette tallet:");
            try{
                int tall = Integer.parseInt(melding);
                return tall;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ikke et tall! prøv igjen!");
                return visMelding();
            }
        // Viser parameterens innhold i en meldingsboks.
    }

    private void forLite(int tall){
        JOptionPane.showMessageDialog(null,tall+" er for lite! Prøv igjen!");
    /* Viser melding om at parameterens verdi er for
       lite tall og ber spilleren prøve igjen. */
    }

    private void forStort(int tall){
        JOptionPane.showMessageDialog(null,tall+" er for stort! Prøv igjen!");
    /* Viser melding om at parameterens verdi er for
      stort tall og ber spilleren prøve igjen. */
    }

    public void avsluttRunde(int antall, int gjetning) {
        JOptionPane.showMessageDialog(null,gjetning+" er riktig!\n"+
                "Du gjettet riktig på "+antall+" forsøk.");
    /* Viser melding om at det ble gjettet riktig
      og antall gjetninger som ble brukt.
      Parametrene gir opplysninger om dette. */
    }

    public void kjørSpill() {
        int nyttTall = nyttTall();
        int antall = 0;
        while (true) {
            antall++;
            int tall = visMelding();
            if (tall < nyttTall) {
                forLite(tall);
                continue;
            }
            if (tall > nyttTall) {
                forStort(tall);
                continue;
            }
            if (tall == nyttTall) {
                avsluttRunde(antall, tall);
                break;
            }
        }

    /* Kjører en spillrunde ved å trekke et tall,
      nullstille tellevariabel, innhente gjentatte
      gjetninger fra bruker inntil det gjettes riktig.
      Når det skjer, avsluttes runden med passe
      meldinger til spilleren. */
    }
}

public class Oppgave2{
    public static void main(String []args) {
        Tallspill nyttspill = new Tallspill();
        JOptionPane.showMessageDialog(null,"Hei! Dette er et spill som skal genere et tilfeldig tall.\n"
                +"Du skal prøve å gjette på dette tallet!");
        nyttspill.kjørSpill();

    }
}
