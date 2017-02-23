package exercicios;

public class ex4cap3 {
	public static void main(String[] args) { 
        int num = 1,
            soma = 0;
        while(num <= 1000){
            soma = soma + num;
            num++;
        }
        System.out.println("Soma: "+soma);
    }
}
