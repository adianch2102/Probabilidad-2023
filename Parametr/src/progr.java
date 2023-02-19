
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
public class progr {
    private boolean verF;
    public int menus=0;
    private int count;
    private char arreglo[]=new char[6];
    public progr(){
        menu();
        mostrarArray();
        cantF();
    }
 public void pedirArray(){
     for(int i=0;i<6;i++){
         arreglo[i]=((JOptionPane.showInputDialog("digite la funcinalidad del elemento"+(i+1))).toUpperCase()).charAt(0);
         while(arreglo[i]!='D'&& arreglo[i]!='F'){
             arreglo[i]=((JOptionPane.showInputDialog("caracter errado digite la funcinalidad del elemento"+(i+1)+" de nuevo")).toUpperCase()).charAt(0);
         }
     }
     
 }
 public void mostrarArray(){
     for(int i=0;i<6;i++){
         System.out.println("elemento "+(i+1)+" "+ arreglo[i]);
     }
 }
public void menu(){
    JOptionPane.showMessageDialog(null, "digite 1 para empezar a tomar los datos \ndidite 2 para cerrar");
    menus=Integer.parseInt(JOptionPane.showInputDialog("digite"));
    while(menus !=1 && menus !=2){
         menus=Integer.parseInt(JOptionPane.showInputDialog("opcion no disponible digite de nuevo"));
         
        }
    if(menus==1){pedirArray();}
    else{JOptionPane.showMessageDialog(null,"saliendo del programa");}
    
    }
public void cantF(){
    for (int i=0;i<6;i++){
        if(arreglo[i]=='D'){
            count++;
        }
    }System.out.println("hay "+count+" maquinas buenas y "+(6-count)+" maquinas malas");
}

    public int getMenus() {
        return menus;
    }

    public boolean isVerF() {
        return verF;
    }

    public int getCount() {
        return count;
    }

    public char[] getArreglo() {
        return arreglo;
    }

}


