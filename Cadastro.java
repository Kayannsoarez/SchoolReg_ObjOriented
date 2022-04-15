public class Cadastro {

    IRepositorioPessoa pessoas = new ControlePessoa();

    public void cadastrarPessoa(Pessoa pessoa) throws PJCException{
        pessoas.cadastrarPessoa(pessoa);
    }

    public Pessoa buscarPessoa(String nome) throws PNEException{
        return pessoas.buscarPessoa(nome);
    }
    public Pessoa buscarAluno(String matricula) throws PNEException{
        return pessoas.buscarAluno(matricula);
    }
    public Pessoa buscarProfessor(String cpf) throws PNEException{
        return pessoas.buscarProfessor(cpf);
    }

    public void removerPessoa(Pessoa pessoa)throws PNEException{
        Pessoa pessoaa = pessoas.buscarPessoa(pessoa.getNome());
        pessoas.removerPessoa(pessoa);

    }

}
