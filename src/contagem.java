import java.util.Scanner;
public class contagem{
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);

        double num, soma = 0;
        int cont = 0;

        do{
            System.out.println("Digite um número");
            num = ent.nextDouble(); 

            if(num >= 0){ // se o número digitado for MAIOR que zero, executa a conta
                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES

            }
        } while(num >= 0); // se o número digitado for MAIOR que zero, faz o LOOP novamente
        //por isso quando for testar o código por favor 
        //depois de escrever os números limites escreva algum número negativo para encerrar a repetição
        // caso contrario ele continuará somando os números
        System.out.println("A quantidade entre ambos os números é: " + soma);

    }
}