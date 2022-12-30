import java.util.Scanner;
class peso{
    public static void main (String args[]){


        float menor, N;
        int cont = 2;


        Scanner start = new Scanner(System.in);
		System.out.println("Peso 1:\n");
        
        N = start.nextFloat();
        menor = N;
        
        while(cont <= 10){
        System.out.println("Peso " + cont + ": ");
        N = start.nextFloat();

        if(N < menor && N > 0){
            menor = N;
        }
        cont++;
		}
            System.out.println("O menor peso eh \n" + menor);
    }
}
