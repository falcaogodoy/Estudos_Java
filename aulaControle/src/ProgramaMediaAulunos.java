import java.util.Scanner;

public class ProgramaMediaAulunos {

    public static void main(String args[]) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite a primeira Nota :");
        Double nota1 = n1.nextDouble();

        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite a segunda Nota :");
        Double nota2 = n2.nextDouble();

        Scanner n3 = new Scanner(System.in);
        System.out.println("Digite a Terceira Nota :");
        Double nota3 = n3.nextDouble();

        Scanner n4 = new Scanner(System.in);
        System.out.println("Digite a Quarta Nota :");
        Double nota4 = n4.nextDouble();

        Double media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println(media);

        if(media >= 7){
            System.out.println("Voce Foi APROVADO");
        }
        else if (media >= 5) {
            System.out.println("Voce esta em RECUPERACAO");
        }

        else if(media <= 5) {
            System.out.println("VOCE FOI REPROVADO");
        }


    }


}
