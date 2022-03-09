import java.util.Scanner;

public class ProgramaMediaAulunos {

    public static void main(String args[]) {
        Scanner n1 = new Scanner(System.in);
        System.out.println("Digite a primeira Nota :");
        Double nota1 = Double.valueOf(n1.nextInt());

        Scanner n2 = new Scanner(System.in);
        System.out.println("Digite a segunda Nota :");
        Double nota2 = Double.valueOf(n2.nextInt());

        Scanner n3 = new Scanner(System.in);
        System.out.println("Digite a Terceira Nota :");
        Double nota3 = Double.valueOf(n3.nextInt());

        Scanner n4 = new Scanner(System.in);
        System.out.println("Digite a Quarta Nota :");
        Double nota4 = Double.valueOf(n4.nextInt());

        Double media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println(media);

        String mediaSt = getNota(media);
        System.out.println(mediaSt);

    }

    public static String getNota(Double media){


        if(media >= 7){
            return "Voce Foi APROVADO";
        }
        else if (media >= 5) {
            return"Voce esta em RECUPERACAO";
        }

        else if(media <= 5) {
            return "VOCE FOI REPROVADO";
        }


        return null;
    }
}
