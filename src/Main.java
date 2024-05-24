import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> professorDisciplinas = List.of("Matemática", "Física", "Programação");

        // Criação do professor
        Professor professor = new Professor("Carlos Alberto", "Rua das Flores, 123",
                "Departamento de Ciências Exatas", professorDisciplinas);

        // Criação do aluno de graduação
        double[] notasGraduacao = {7.5, 8.0, 9.0};
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("João Silva", "Av. Paulista, 1000",
                "2022012345", "Engenharia de Software", notasGraduacao);

        // Criação do aluno de pós-graduação
        double[] notasPosGraduacao = {8.5, 9.0, 9.5};
        AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao("Maria Oliveira", "Rua das Acácias, 456",
                "2022012346", "Engenharia de Software", notasPosGraduacao, "Inteligência Artificial");

        // Lista genérica de pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(professor);
        pessoas.add(alunoGraduacao);
        pessoas.add(alunoPosGraduacao);

        // Apresentar cada pessoa na lista usando polimorfismo
        for (Pessoa pessoa : pessoas) {
            pessoa.apresentar();
            System.out.println();
        }
    }
}