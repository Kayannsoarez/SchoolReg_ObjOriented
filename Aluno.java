public class Aluno extends Pessoa{
    private String curso;
    private String matricula;

    public Aluno(String nome, String sexo, String curso, int idade, String matricula){
        super(nome, idade, sexo);
        this.curso = curso;
        this.matricula=matricula;


    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
