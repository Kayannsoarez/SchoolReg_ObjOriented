public class Professor extends Pessoa{
    private String cpf;
    private String materia;

    public Professor(String nome, String sexo, String materia, int idade, String cpf){
        super(nome, idade, sexo);
        this.cpf=cpf;
        this.materia=materia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
