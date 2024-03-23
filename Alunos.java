public class Alunos {
    private String nome;
    private int semestre;

    public Alunos(String nome, int semestre){
        this.nome = nome;
        this.semestre = semestre;
    }

    public String getNome() {
        return nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String formatarInformacoes(){
        return "Aluno(a): " + nome + " está no " +semestre + "° semestre da faculdade.";
    }
}
