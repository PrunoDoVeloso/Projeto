package br.edu.ifc.videira;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args){
		
		List<String> compras = new ArrayList<>();
		List<String> vendas = new ArrayList<>();
		
		for(;;) {
			int op = 0;
			int op2 = 0;
			int unid = 0;
			
			op = Integer.parseInt(JOptionPane.showInputDialog("Loja de Cal�ados\n"
					+ "1 - Comprar produtos\n"
					+ "2 - Vender produtos\n"
					+ "3 - Lista de pre�os\n"
					+ "4 - Consultar compras\n"
					+ "5 - Consultar vendas\n"
					+ "6 - Sair\n"));
			if(op==1){
				op2 = Integer.parseInt(JOptionPane.showInputDialog("1 - Sapato\n"
						+ "2 - Chinelo\n"
						+ "3 - T�nis\n"
						+ "4 - Sapatenis\n"));
				
				if(op2==1) {
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" Sapato(s)");
				}else if(op2==2){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" Chinelo(s)");
				}else if(op2==3){
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" T�nis");
				}else{
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" Sapatenis(s)");	
					}
				}else if(op==2){
					op2 = Integer.parseInt(JOptionPane.showInputDialog("1- Sapato = 150,00R$\n"
							+ "2- Chinelo = 10,00R$\n"
							+ "3- T�nis = 80,00R$\n"
							+ "4- Sapatenis = 60,00R$\n"));
					if(op2==1) {
						vendas.add("Sapato");				
					}else if(op2==2){
						vendas.add("Chinelo");	
					}else if(op2==3){
						vendas.add("T�nis");	
					}else{
						vendas.add("Sapatenis");	
					}
				}else if(op==3){
						JOptionPane.showMessageDialog(null,"1- Sapato = 130,00R$\n"
								+ "2- Chinelo = 8,00R$\n"
								+ "3- T�nis = 70,00R$\n"
								+ "4- Sapatenis = 50,00R$\n");
				}else if(op==4) {
					JOptionPane.showMessageDialog(null, "Vendas: \n"
							+ "" + compras);	
				}else if(op==5){
					JOptionPane.showMessageDialog(null, "Compras: \n"
							+ "" + vendas);
				}else{
					break;
				}
		}
	}
}
		
	

