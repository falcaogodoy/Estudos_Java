package domain;

public class Aluno {

    private String nome;
    private String sexo;

    public Aluno(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return "Name: " + this.nome + "|" + "Gender: " + this.sexo;
    }

    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }



}
