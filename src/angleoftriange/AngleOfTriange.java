/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package angleoftriange;
import javax.swing.*;
/**
 *
 * @author blhad3491
 */
public class AngleOfTriange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstSideInput = JOptionPane.showInputDialog("Please Enter The First Side Length");
        double firstSide = Double.parseDouble(firstSideInput);
        String secondSideInput = JOptionPane.showInputDialog("Please Enter The Second Side Length");
        double secondSide = Double.parseDouble(secondSideInput);
        String firstAngleInput = JOptionPane.showInputDialog("Please Enter The Angle Across The Missing Side Length");
        double angleInput = Double.parseDouble(firstAngleInput);
        double finalSide = Math.sin(angleInput);
        double unroundedAnswer = (firstSide+secondSide+finalSide/2);
        double finalAnswer = Math.round(unroundedAnswer);
        JOptionPane.showMessageDialog(null,"The Final Side is"+" "+finalAnswer);
    }
    
}
