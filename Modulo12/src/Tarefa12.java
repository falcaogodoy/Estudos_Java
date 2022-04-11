import java.util.*;

public class Tarefa12 {

    private static Scanner scan;

        public static void main (String[] args) {
            scan = new Scanner(System.in);
            EX1();
            EX2();
        }

    public static void EX1(){
            System.out.println("Coloque seu nome separado por virgula EX: Francisco,Pablo,...");
            String[] nomes = scan.next().split("'");
            Arrays.sort(nomes);
            for (String nome: nomes ){
                System.out.println("Nome " + nome);
            }
    }
    public static void EX2() {
        System.out.println("Insira nomes e sexo  separados por hífen e cada pessoa separado por vírgula EX: Francisco-M,Godoy-F");
        String[] pessoas = scan.next().split(",");
        String [] comparador = new String[2];
        String gender = "";
        List<String> malePersons = new ArrayList<>();
        List<String> femalePersons = new ArrayList<>();
        for (String pessoa : pessoas) {
            comparador = pessoa.split("-");
            if (comparador.length == 2) {
                gender = comparador[1];
                if (gender.toLowerCase(Locale.ROOT).equals("m")) {
                    malePersons.add(comparador[0]);
                } else if(gender.toLowerCase(Locale.ROOT).equals("f")) {
                    femalePersons.add(comparador[0]);
                }
            }
        }

        Collections.sort(malePersons);
        Collections.sort(femalePersons);
        System.out.println("Lista pessoas sexo masculino: " + malePersons);
        System.out.println("Lista pessoas sexo feminino: " + femalePersons);
    }

}
