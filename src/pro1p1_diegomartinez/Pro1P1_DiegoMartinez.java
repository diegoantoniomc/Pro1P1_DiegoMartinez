//Diego Martinez
package pro1p1_diegomartinez;

import java.util.Arrays;
import java.util.Random;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pro1P1_DiegoMartinez {

    static Scanner read = new Scanner(System.in);
    static Random random = new Random();
    static Menu m=new Menu();
    static ArrayList<Cancion> can = new ArrayList();

    public static String getCanListStr() {
        String output = "";
        for (Cancion c : can) {
            output += Integer.toString(can.indexOf(c)+1) + c.toString() + "\n";
        }
        return output;
    }
    
    public static void main(String[] args) {
           Menu screen=new Menu();
           screen.setVisible(true);
    }
    
}
