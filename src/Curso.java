import java.util.ArrayList;
import java.util.List;
public class Curso {
    private String curso_nome;
    private String curso_codigo;

    private List<Disciplina> disciplinasObrigatorias;
    private List<Disciplina> disciplinasEletivas;

    public Curso(String curso_nome, String curso_codigo ){
        this.curso_nome = curso_nome;
        this.curso_codigo = curso_codigo;
        this.disciplinasObrigatorias = new ArrayList<Disciplina>();
        this.disciplinasEletivas = new ArrayList<Disciplina>();
    }

    public String getCurso_nome() {

        return curso_nome;
    }

    public String getCurso_codigo() {

        return curso_codigo;
    }

    public List<Disciplina> getDisciplinasObrigatorias() {

        return disciplinasObrigatorias;
    }

    public List<Disciplina> getDisciplinasEletivas() {

        return disciplinasEletivas;
    }

    public void setCurso_nome(String curso_nome) {

        this.curso_nome = curso_nome;
    }

    public void setCurso_codigo(String curso_codigo) {

        this.curso_codigo = curso_codigo;
    }

    public void setDisciplinasObrigatorias(List<Disciplina> disciplinasObrigatorias) {
        this.disciplinasObrigatorias = disciplinasObrigatorias;
    }

    public void setDisciplinasEletivas(List<Disciplina> disciplinasEletivas) {
        this.disciplinasEletivas = disciplinasEletivas;
    }
    // Métodos para adicionar disciplinas obrigatórias e eletivas
    public void adicionarDisciplinaObrigatoria(Disciplina disciplina) {
        disciplinasObrigatorias.add(disciplina);
    }

    public void adicionarDisciplinaEletiva(Disciplina disciplina) {

        disciplinasEletivas.add(disciplina);
    }

    // Método para apresentar as informações do curso
    public void apresentar() {
        System.out.println("Nome do Curso: " + curso_nome);
        System.out.println("Código do Curso: " + curso_codigo);

        System.out.println("Disciplinas Obrigatórias: ");
        for (Disciplina d : disciplinasObrigatorias) {
            System.out.println(" - " + d.getDisciplina_nome() + " (" + d.getDiscplina_codigo() + ")");
        }

        System.out.println("Disciplinas Eletivas: ");
        for (Disciplina d : disciplinasEletivas) {
            System.out.println(" - " + d.getDisciplina_nome() + " (" + d.getDiscplina_codigo() + ")");
        }
    }
    }

