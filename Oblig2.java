package Oblig2;

import javax.swing.*;


public class Oblig2 {
    public static void main(String [] args){



        int start = 0;
        String innStart;
        JOptionPane.showMessageDialog(null, "I'm thinking of number between 0 to 100, can you guess it?");
    while(start == 0){

        int i = 0;
        int winner = 0;
        int number = 0;
        int right = 0;
        int correct = (int)(Math.random()*101);
        int attemt;

        String innNumber;






        while(i < 6){
            while(right != 1){
                try{
                    attemt = 6 - i;
                    innNumber = JOptionPane.showInputDialog("You have "+ attemt +" attemts left","Please enter your guess");
                    number = Integer.parseInt(innNumber);
                    right = 1;
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Please enter a number dumbass");

                }


            }
        if (number == correct){
            i = 6;
            winner = 1;

        }

            else if (number > correct) {
            JOptionPane.showMessageDialog(null, "Sorry your guess was too high");
            i++;
            right = 0;

            } else if (number < correct) {
            JOptionPane.showMessageDialog(null, "Sorry your answer was too low");
            i++;
            right = 0;

        }
        }
        if (winner == 1){
            JOptionPane.showMessageDialog(null, "You won the game, go buy a chocolate or something im broke");
        } else if (winner != 1) {
            JOptionPane.showMessageDialog(null, "Sorry you suck, the correct answer was " + correct);

        }
        innStart = JOptionPane.showInputDialog("Do you want to play again? 0 is Yes and 1 is No");
        try{
            start = Integer.parseInt(innStart);
            //JOptionPane.showMessageDialog(null, "Alright rebooting game, please stand by");
        }
        catch (Exception o){
            start = 1;
        }


    }}
}
