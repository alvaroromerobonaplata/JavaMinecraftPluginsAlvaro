package condicionales;

import javax.swing.JOptionPane;

public class Condicional1 {

	public static void main(String[] args){
		
		String x = JOptionPane.showInputDialog("Dime un numero");
		int y = Integer.parseInt(x);
		
		if(y>0){
			JOptionPane.showMessageDialog(null,"Buenos dias. Tu numero es positivo.");
		}
		if(y<0){
			JOptionPane.showMessageDialog(null,"Buenos dias. Tu numero es negativo.");
		}
		
	}
	
}
