package Repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		// Laco de repeticao
		// x@xpto.com.br (testar se tem @
		// x@xpto.com.br (testar se @ esta depois da 2a pos
		// pedir nome que deve ter entre 5 e 15 caracteres
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		// while (email.contains("@")==false) {
		// while (email.indexOf("@")<2) {
		while (email.length()<5 || email.length()>15) {
			email = JOptionPane.showInputDialog("Email novamente").toLowerCase();
		}
		System.out.println("Nome " + email);
	}

}
