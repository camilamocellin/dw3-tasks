package exercicios;

public class ex6cap3 {
	public static void main(String[] args) {        
        int x,
            fatorial = 1;        
        for(x = 1 ; x <= 10 ; x++){
            fatorial = fatorial * x;
            System.out.println("O fatorial de "+ x + " é (" +(x-1)+"!) * "+x+" = "+fatorial);            
        }        
    }
}
