public class AlunoPosGraduacao extends Aluno{
    private double[] notas;
    private String temaDissertacao;

    /**
     * Construtor para inicializar os atributos de AlunoPosGraduacao.
     * @param nome Nome do aluno.
     * @param endereco Endereço do aluno.
     * @param matricula Matrícula do aluno.
     * @param cursoMatriculado Curso no qual o aluno está matriculado.
     * @param notas Notas do aluno.
     * @param temaDissertacao Tema da dissertação do aluno.
     */

    public AlunoPosGraduacao(String Pessoa_nome, String Pessoa_endereco , String Aluno_matricula, String Aluno_curso_matriculado, double[] notas, String temaDissertacao){
        super(Pessoa_nome, Pessoa_endereco, Aluno_matricula, Aluno_curso_matriculado);
        this.notas = notas;
        this.temaDissertacao = temaDissertacao;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getTemaDissertacao() {
        return temaDissertacao;
    }

    public void setTemaDissertacao(String temaDissertacao) {
        this.temaDissertacao = temaDissertacao;
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
        System.out.println("Tema da Dissertação: " + temaDissertacao);
    }
}
