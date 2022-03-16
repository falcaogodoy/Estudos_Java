package programa;

import domain.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramFila {
    public static void main(String[] args){
        Scanner f = new Scanner(System.in);
        List<Aluno> listFemale = new ArrayList<>();
        List<Aluno> listMale = new ArrayList<>();

        System.out.println("Digite seu nome e sexo (M) (F):");
        Aluno a = new Aluno(f.next(), f.next());
        if (a.getSexo().equalsIgnoreCase("F")) {
            listFemale.add(a);
        } else {
            listMale.add(a);
        }
        System.out.println("Female list: " + listFemale + "\n");
        System.out.println("Male list: " + listMale);
    }




    }

