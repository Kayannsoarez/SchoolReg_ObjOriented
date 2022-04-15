public interface IRepositorioPessoa {

    public void cadastrarPessoa(Pessoa pessoa)throws PJCException;

    public Pessoa buscarPessoa(String nome) throws PNEException;

    public Pessoa buscarAluno(String matricula)throws PNEException;

    public Pessoa buscarProfessor(String cpf)throws PNEException;

    public void removerPessoa(Pessoa pessoa )throws PNEException;

}
