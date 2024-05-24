import java.util.List;
import java.util.ArrayList;
public class Professor extends Pessoa{
    private String professor_nome;
    private String professor_departamento;
    private List<String>professor_diciplina;

    /**
     * Construtor para inicializar os atributos de Professor.
     * @param nome Nome do professor.
     * @param endereco Endereço do professor.
     * @param departamento Departamento do professor.
     * @param disciplinasMinistradas Lista de disciplinas ministradas pelo professor.
     */


    public Professor(String Pessoa_nome, String Pessoa_endereco, String professor_departamento, List<String> professor_diciplina) {
        super(Pessoa_nome, Pessoa_endereco);
        this.professor_departamento = professor_departamento;
        this.professor_diciplina = new ArrayList<>();
    }


    public String getProfessor_departamento() {

        return professor_departamento;
    }

    public List<String> getProfessor_diciplina() {

        return professor_diciplina;
    }


    public void setProfessor_departamento(String professor_departamento) {
        this.professor_departamento = professor_departamento;
    }

    public void setProfessor_diciplina(List<String> professor_diciplina) {
        this.professor_diciplina = professor_diciplina;
    }
    @Override
    public void apresentar(){
        System.out.println("Nome do Professor: " + Pessoa_nome);
        System.out.println("Endereço: " + Pessoa_endereco);
        System.out.println("Departamento: " + professor_departamento);
        System.out.println("Disciplinas Administradas: "+ String.join(", ",professor_diciplina));

    }
}
