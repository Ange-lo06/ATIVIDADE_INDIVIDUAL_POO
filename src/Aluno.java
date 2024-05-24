public class Aluno extends Pessoa{

    protected  String Aluno_matricula;
    protected  String Aluno_curso_matriculado;


    /**
     * Construtor para inicializar os atributos de Aluno.
     * @param nome Nome do aluno.
     * @param endereco Endereço do aluno.
     * @param matricula Matrícula do aluno.
     * @param cursoMatriculado Curso no qual o aluno está matriculado.
     */

    public Aluno(String Pessoa_nome, String Pessoa_endereco, String Aluno_matricula, String Aluno_curso_matriculado){
        super(Pessoa_nome, Pessoa_endereco);
        this.Aluno_matricula = Aluno_matricula;
        this.Aluno_curso_matriculado = Aluno_curso_matriculado;
    }

    public String getAluno_matricula() {
        return Aluno_matricula;
    }

    public String getAluno_curso_matriculado() {
        return Aluno_curso_matriculado;
    }


    public void setAluno_matricula(String matricula_aluno) {
        this.Aluno_matricula = Aluno_matricula;
    }

    public void setAluno_curso_matriculado(String curso_matriculado) {
        this.Aluno_curso_matriculado = curso_matriculado;
    }
    @Override
    public void apresentar(){
        System.out.println("Nome: "+ Pessoa_nome);
        System.out.println("Endereço: "+ Pessoa_endereco);
        System.out.println("Matricula: " + Aluno_matricula);
        System.out.println("Curso Matriculado: " + Aluno_curso_matriculado);
    }
}
