
public class Disciplina {
    private String disciplina_nome;
    private String discplina_codigo;
    private int disciplina_carga_horaria;
    private Professor professorResponsavel;

    public Disciplina(String disciplina_nome, String discplina_codigo, int disciplina_carga_horaria, Professor professorResponsavel){
        this.disciplina_nome = disciplina_nome;
        this.discplina_codigo = discplina_codigo;
        this.disciplina_carga_horaria = disciplina_carga_horaria;
        this.professorResponsavel = professorResponsavel;
    }

    public String getDisciplina_nome() {

        return disciplina_nome;
    }

    public String getDiscplina_codigo() {

        return discplina_codigo;
    }

    public int getDisciplina_carga_horaria() {

        return disciplina_carga_horaria;
    }

    public Professor getProfessorResponsavel() {

        return professorResponsavel;
    }

    public void setDisciplina_nome(String disciplina_nome) {

        this.disciplina_nome = disciplina_nome;
    }

    public void setDiscplina_codigo(String discplina_codigo) {

        this.discplina_codigo = discplina_codigo;
    }

    public void setDisciplina_carga_horaria(int disciplina_carga_horaria) {
        this.disciplina_carga_horaria = disciplina_carga_horaria;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void apresentar(){
        System.out.println("Nome da Disciplina: " + disciplina_nome);
        System.out.println("Código da Disciplina: " + discplina_codigo);
        System.out.println("Carga Horária: " + disciplina_carga_horaria + " horas");
        System.out.println("Professor Responsável: " + professorResponsavel.getPessoa_nome() + ", Departamento: " + professorResponsavel.getProfessor_departamento());
    }
}


