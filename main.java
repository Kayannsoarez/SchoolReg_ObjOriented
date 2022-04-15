import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();
        Pessoa pessoa = new Pessoa(null,0,null);
        Aluno aluno = null;
        Professor professor =null;

        int op=0, opc=0;
        int buscar=0, remover=0, atualizar=0;

        while(op!=5){
            try{
                System.out.println(
                                "|--------------------------------------------|\n"+
                                "=============(Controle Escolar)===============\n"+
                                "|--------------------------------------------|\n"+
                                "[1]Cadastra Pessoa.                          |\n"+
                                "[2]Buscar Pessoa.                            | \n"+
                                "[3]Remover Pessoa.                           |\n"+
                                "[4]Atualizar Pessoa.                         |\n"+
                                "[5]Sair.                                     | \n"+
                                "|--------------------------------------------|");
                op=ler.nextInt();

                switch(op){

                    //Cadastrar Pessoa
                    case 1:

                        System.out.println("Cadastrando Pessoa...");
                        System.out.println("Aluno[1] ou Professor[2]?");
                        opc=ler.nextInt();
                        switch(opc){

                            case 1:
                                System.out.println("Nome: ");
                                String nome=ler.next();
                                System.out.println("Idade :");
                                int idade=ler.nextInt();
                                System.out.println("Sexo: ");
                                String sexo = ler.next();
                                System.out.println("Curso: ");
                                String curso = ler.next();
                                System.out.println("Matricula: ");
                                String matricula = ler.next();
                                pessoa = new Aluno(nome, sexo, curso, idade, matricula);

                                try{
                                    cadastro.cadastrarPessoa(pessoa);
                                    System.out.println("Pessoa Cadastrada com Sucesso!");
                                }catch (PJCException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 2:
                                System.out.println("Nome: ");
                                nome=ler.next();
                                System.out.println("Idade :");
                                idade=ler.nextInt();
                                System.out.println("Sexo: ");
                                sexo = ler.next();
                                System.out.println("Cpf: ");
                                String cpf=ler.next();
                                System.out.println("Materia: ");
                                String materia = ler.next();
                                pessoa = new Professor(nome, sexo, materia, idade, cpf);

                                try{
                                    cadastro.cadastrarPessoa(pessoa);
                                    System.out.println("Pessoa Cadastrada com Sucesso!");
                                }catch (PJCException e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                        }
                        break;

                    //Buscar Pessoa
                    case 2:

                        System.out.println("Buscando Pessoa...");
                        System.out.println("Aluno[1] ou Professor[2]?");
                        buscar=ler.nextInt();

                        switch(buscar){
                            case 1:

                                System.out.println("Buscando Aluno...");
                                System.out.println("Digite a Matricula do Aluno que Queira Buscar.");
                                String matricula = ler.next();
                                try{

                                    Pessoa aux = cadastro.buscarAluno(matricula);

                                    System.out.println("#************************#");
                                    System.out.println("|Nome:  " +aux.getNome());
                                    System.out.println("|Idade: "+aux.getIdade() +" Anos");
                                    System.out.println("|Sexo:  "+aux.getSexo());
                                    System.out.println("|Matricula: "+((Aluno) aux).getMatricula());
                                    System.out.println("|Curso: " +((Aluno) aux).getCurso());
                                    System.out.println("#************************#");

                                }catch (PNEException e) {

                                    System.out.println(e.getMessage());
                                }
                                break;

                            case 2:

                                System.out.println("Buscando Professor...");
                                System.out.println("Digite o CPF do Professor que Queira Buscar.");
                                String cpf = ler.next();

                                try{

                                    Pessoa aux = cadastro.buscarProfessor(cpf);

                                    System.out.println("#************************#");
                                    System.out.println("|Nome:  " +aux.getNome());
                                    System.out.println("|Idade: "+aux.getIdade() +" Anos");
                                    System.out.println("|Sexo:  "+aux.getSexo());
                                    System.out.println("|CPF: "+((Professor) aux).getCpf());
                                    System.out.println("|Materia: " +((Professor) aux).getMateria());
                                    System.out.println("#************************#");

                                }catch (PNEException e) {

                                    System.out.println(e.getMessage());
                                }

                                break;
                        }
                        break;

                    //Remover Pessoa
                    case 3:

                        System.out.println("Removendo Pessoa...");
                        System.out.println("Aluno[1] ou Professor[2]?");
                        remover=ler.nextInt();
                        switch(remover){

                            case 1:

                                System.out.println("Digite a Matricula do Aluno que Deseja Remover!");
                                System.out.println("Matricula: ");
                                String matricula = ler.next();

                                try{

                                    Pessoa aux = cadastro.buscarAluno(matricula);
                                    cadastro.removerPessoa(aux);
                                    System.out.println("Pessoa Removida com Sucesso!");

                                }
                                catch(PNEException ex){
                                    System.out.println(ex.getMessage());
                                }

                                break;

                            case 2:

                                System.out.println("Digite o CPF do Professor que Deseja Remover!");
                                System.out.println("CPF: ");
                                String cpf = (ler.next());

                                try{

                                    Pessoa aux = cadastro.buscarProfessor(cpf);
                                    cadastro.removerPessoa(aux);
                                    System.out.println("Pessoa Removida com Sucesso!");

                                }catch(PNEException ex){
                                    System.out.println(ex.getMessage());
                                }

                        }

                        break;

                    //Atualizar Pessoa
                    case 4:

                        System.out.println("Atualizando Pessoa...");
                        System.out.println("Busque a Pessoa que Queira Atualizar!");
                        System.out.println("Aluno[1] ou Professor[2]?");
                        atualizar=ler.nextInt();
                        switch(atualizar){

                            case 1:

                                System.out.println("Digite sua Matricula para Atualizar seus Dados!");
                                System.out.println("Matricula: ");
                                String matricula = ler.next();

                                try{

                                    Pessoa aux = cadastro.buscarAluno(matricula);

                                    System.out.println("Pronto! Agora Atualize seus Dados!");
                                    System.out.println("Nome: ");
                                    pessoa.setNome(ler.next());
                                    System.out.println("Idade: ");
                                    pessoa.setIdade(ler.nextInt());
                                    System.out.println("Sexo: ");
                                    pessoa.setSexo(ler.next());

                                    if(aux instanceof Aluno){
                                        System.out.println("Curso: ");
                                        String curso = ler.next();
                                        ((Aluno) pessoa).setCurso(curso);
                                    }
                                    System.out.println("Atualização completada!");

                                }catch (PNEException e) {

                                    System.out.println(e.getMessage());
                                }

                                break;

                            case 2:

                                System.out.println("Digite seu CPF para Atualizar seus Dados!");
                                System.out.println("CPF: ");
                                String cpf = ler.next();
                                try{

                                    Pessoa aux = cadastro.buscarProfessor(cpf);

                                    System.out.println("Pronto! Agora Atualize seus Dados!");
                                    System.out.println("Nome: ");
                                    pessoa.setNome(ler.next());
                                    System.out.println("Idade: ");
                                    pessoa.setIdade(ler.nextInt());
                                    System.out.println("Sexo: ");
                                    pessoa.setSexo(ler.next());

                                    if(aux instanceof Professor){
                                        System.out.println("Materia: ");
                                        String materia = ler.next();
                                        ((Professor) pessoa).setMateria(materia);
                                    }
                                    System.out.println("Atualização completada!");

                                }catch (PNEException e) {

                                    System.out.println(e.getMessage());
                                }
                                break;
                        }
                        break;

                    case 5:
                        System.out.println("Finalizando...");
                        System.out.println("Finalizado!");

                        break;

                    default:
                        System.out.println("Opção Invalida.");

                        break;

                }
            }catch(Exception err){
                op=12;
                System.out.println("Bazinga! 404: Erro Not Found!");

            }
        }
                }


}
