package exercicios;

public class ex2cap3 {
	public static void main(String[] args) {
		  
		  int gastosJaneiro = 15000;
		  int gastosFevereiro = 23000;
		  int gastosMarco = 17000;
		  int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		  System.out.println(gastosTrimestre);
		  
		  double mediaMensal = gastosTrimestre / 3.0;

		  System.out.println("M�dia mensal = " + mediaMensal);

		 }
}
