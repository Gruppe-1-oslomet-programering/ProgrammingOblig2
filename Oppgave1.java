package Oblig2;

import javax.swing.*;

class Total{


    private int total;
    private String ut;





    public void setTotal(int total){
        this.total = total;
    }
    public int getTotal(){
        return total;
    }
    public void setUt(String ut){
        this.ut = ut;
    }
    public String getUt(){
        return ut;
    }




}




public class Oppgave1 {
    public static void main(String[] args){
        Total sum = new Total();
        boolean test = true;
        int tall;
        int difference;
        int y = 0;
        int x = 0;
        int toppTall = 0;
        int bunnTall = 0;
        String innTall1;
        String innTall2;
        //innTall1 = JOptionPane.showInputDialog("Please enter a number");
        //innTall2 = JOptionPane.showInputDialog("Please enter a number higher than the last");
        while (test == true){
            while (x == 0){
                innTall1 = JOptionPane.showInputDialog("Please enter a number");
                innTall2 = JOptionPane.showInputDialog("Please enter a number higher than the last");
                try {
                    bunnTall = Integer.parseInt(innTall1);
                    toppTall = Integer.parseInt(innTall2);
                    x = 1;


                }
                catch (Exception e){
                    x = 0;
                    System.out.println(e);
                }
            }
            if (toppTall > bunnTall){
            test = false;
            x=1;
            y = 1;
            } else if (toppTall <= bunnTall) {
                JOptionPane.showMessageDialog(null,"Please enter a bigger number than the first");
                test = true;
                x=0;
            }
        }

            difference = toppTall - bunnTall;
            for (int i=0; i < difference; i++){
                tall = bunnTall + i;
                sum.setTotal(sum.getTotal() + tall); //= sum.getTotal() + tall;
                sum.setUt(sum.getUt()+ " +"+tall); //= sum.getUt() + " +"+tall ;



            }

        System.out.println("Tallene i rekken er: "+ sum.getUt() + " = "+ sum.getTotal());








        }


    }

