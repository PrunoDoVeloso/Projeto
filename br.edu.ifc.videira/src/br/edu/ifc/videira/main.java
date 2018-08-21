package br.edu.ifc.videira;

public class main {
public static void main(String[] args){
		
		List<String> compras = new ArrayList<>();
		List<String> vendas = new ArrayList<>();
		
		for(;;) {
			int op = 0;
			int op2 = 0;
			int unid = 0;
		
			op = Integer.parseInt(JOptionPane.showInputDialog("Loja de Calçados\n"
					+ "1 - Comprar produtos\n"
					+ "2 - Vender produtos\n"
					+ "3 - Lista de preços\n"
					+ "4 - Consultar compras\n"
					+ "5 - Consultar vendas\n"
					+ "6 - Sair\n"));
			
			
			if(op2==1) {
				unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
				compras.add(unid+" Sapato(s)");
			}else if(op2==2){
				unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
				compras.add(unid+" Chinelo(s)");
			}else if(op2==3){
				unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
				compras.add(unid+" Tênis(s)");
			}else if{
				unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
				compras.add(unid+" Sapatênis(s)");	
				}}else{
					unid = Integer.parseInt(JOptionPane.showInputDialog("Quantidade: \n"));
					compras.add(unid+" Sandália(s)");	
					}
				/*teste*/
		}
}
}