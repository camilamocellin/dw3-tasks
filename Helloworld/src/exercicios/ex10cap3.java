package exercicios;

public class ex10cap3 {
	public static void main(String[] args) {
        int n=5,
            linha,
            coluna;
        
        for(linha=1 ; linha <= n ; linha++){
            for(coluna=1 ; coluna <= linha ; coluna++){
                System.out.print(linha*coluna + " ");
            }
            System.out.println();
        }
        
    }
}
