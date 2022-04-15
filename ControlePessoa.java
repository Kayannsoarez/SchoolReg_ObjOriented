import java.util.ArrayList;
import java.util.List;

public class ControlePessoa implements IRepositorioPessoa{
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void cadastrarPessoa(Pessoa pessoa) throws PJCException {
        try{
            if(pessoa instanceof Aluno){
                this.buscarAluno(((Aluno) pessoa).getMatricula());
                throw new PJCException();
            }

            if(pessoa instanceof Professor){
                this.buscarProfessor(((Professor) pessoa).getCpf());
                throw new PJCException();
            }

        }catch(PNEException e){
            pessoas.add(pessoa);
        }

    }

    public Pessoa buscarPessoa(String nome) throws PNEException {
        for(Pessoa pessoa:pessoas){
            if(pessoa.getNome().equals(nome)){
                return pessoa;
            }
        }
        throw new PNEException();

    }

    public Pessoa buscarAluno(String matricula) throws PNEException{
        for(Pessoa pessoa:pessoas){
            if(pessoa instanceof Aluno)
                if(((Aluno) pessoa).getMatricula().equals(matricula)){
                    return pessoa;
                }
        }
        throw new PNEException();
    }

    public Pessoa buscarProfessor(String cpf) throws PNEException{
        for(Pessoa pessoa:pessoas){
            if(pessoa instanceof Professor)
                if(((Professor) pessoa).getCpf().equals(cpf)){
                    return pessoa;
                }
        }
        throw new PNEException();
    }


    public void removerPessoa(Pessoa pessoa)throws PNEException{
        try{
            if(pessoa instanceof Aluno ){
                this.buscarAluno(((Aluno) pessoa).getMatricula());
                pessoas.remove(pessoa);
                throw new PNEException();
            }
            if(pessoa instanceof Professor){
                this.buscarProfessor(((Professor) pessoa).getCpf());
                pessoas.remove(pessoa);
                throw new PNEException();
            }

        }catch(PNEException e){

        }

    }


}
