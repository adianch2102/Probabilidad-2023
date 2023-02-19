
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Probabilidad {
    private int hola=0;
    public Probabilidad(int hola){
        this.hola=hola;
        
    }
    public void cazo(int jeje){
       switch(jeje){
           case 1: JOptionPane.showMessageDialog(null,"la probabilidad de que salga almenos uno defectuosos es 0,33");
                   JOptionPane.showMessageDialog(null, "la probabilidad de que salgan dos defectuosos es 0");
                   break;
           case 2: JOptionPane.showMessageDialog(null,"la probabilidad de que salga almenos uno defectuosos es 0,6");
                   JOptionPane.showMessageDialog(null, "la probabilidad de que salgan dos defectuosos es 0,06");
                   break;
           case 3: JOptionPane.showMessageDialog(null,"la probabilidad de que salga almenos uno defectuosos es 0,86");
                   JOptionPane.showMessageDialog(null, "la probabilidad de que salgan dos defectuosos es 0,2");
                   break;
           case 4: JOptionPane.showMessageDialog(null,"la probabilidad de que salga almenos uno defectuosos es 0,93");
                   JOptionPane.showMessageDialog(null, "la probabilidad de que salgan dos defectuosos es 0,4");
                   break;
           case 5: JOptionPane.showMessageDialog(null,"la probabilidad de que salga almenos uno defectuosos es 100");
                   JOptionPane.showMessageDialog(null, "la probabilidad de que salgan dos defectuosos es 0,66");
                   break;
       
       }
       
        
    
  }

    public int getHola() {
        return hola;
    }
}
