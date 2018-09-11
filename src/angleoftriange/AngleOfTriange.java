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
        String firstSideInput = JOptionPane.showInputDialog("Please enter the first side length");
        double firstSide = Double.parseDouble(firstSideInput); //inputing the first side
        String secondSideInput = JOptionPane.showInputDialog("Please enter the second side length");
        double secondSide = Double.parseDouble(secondSideInput); // inputing the second side
        String firstAngleInput = JOptionPane.showInputDialog("Please enter the angle across from the missing side length");
        double angleInput = Double.parseDouble(firstAngleInput); // inputing the angle
        double finalSide = Math.sin(angleInput); // using the math.sin fuction on the angle inputed 
        double unroundedAnswer = ((firstSide+secondSide+finalSide)/2);
        double finalAnswer = Math.round(unroundedAnswer); // using the math.round fuction to round the final answer of the calculation
        String measure = JOptionPane.showInputDialog("Please enter your measurement of choice.");
        JOptionPane.showMessageDialog(null,"The area of the triange is"+" "+finalAnswer+" "+ measure+" "+"squared");
    }
    
}
