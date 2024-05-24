public class AlunoGraduacao extends Aluno{
    private double[] notas;

    /**
     * Construtor para inicializar os atributos de AlunoGraduacao.
     * @param nome Nome do aluno.
     * @param endereco Endereço do aluno.
     * @param matricula Matrícula do aluno.
     * @param cursoMatriculado Curso no qual o aluno está matriculado.
     * @param notas Notas do aluno.
     */

    public AlunoGraduacao(String Pessoa_nome, String Pessoa_endereco , String Aluno_matricula, String Aluno_curso_matriculado, double[] notas){
        super(Pessoa_nome, Pessoa_endereco, Aluno_matricula, Aluno_curso_matriculado);
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Média de Notas: " + calcularMedia());
    }
}
