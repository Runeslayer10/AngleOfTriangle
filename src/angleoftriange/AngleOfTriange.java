/*
 * Blake Hadaway
 * Septemeber 11th
 * Finding the area of a triangle using math.sin
 */

package angleoftriange;
import javax.swing.*; // for the ability to use JOptionPane
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
        double firstSide = Double.parseDouble(firstSideInput); //inputing the first side
        String secondSideInput = JOptionPane.showInputDialog("Please Enter The Second Side Length");
        double secondSide = Double.parseDouble(secondSideInput); // inputing the second side
        String firstAngleInput = JOptionPane.showInputDialog("Please Enter The Angle Across The Missing Side Length");
        double angleInput = Double.parseDouble(firstAngleInput); // inputing the angle
        double finalSide = Math.sin(angleInput); // using the math.sin fuction on the angle inputed 
        double unroundedAnswer = ((firstSide+secondSide+finalSide)/2);
        double finalAnswer = Math.round(unroundedAnswer); // using the math.round fuction to round the final answer of the calculation
        JOptionPane.showMessageDialog(null,"The Area Of The Triange is"+" "+finalAnswer);
    }
    
}
