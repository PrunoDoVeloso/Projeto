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
		}
}
}