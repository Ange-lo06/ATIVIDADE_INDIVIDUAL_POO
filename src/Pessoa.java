public abstract class Pessoa {
    protected String Pessoa_nome;
    protected String Pessoa_endereco;

    /**
     * Construtor para inicializar os atributos de Pessoa.
     * @param nome Nome da pessoa.
     * @param endereco Endereço da pessoa.
     */
    public Pessoa(String Pessoa_nome, String Pessoa_endereco){
        this.Pessoa_nome = Pessoa_nome;
        this.Pessoa_endereco = Pessoa_endereco;
    }

    public String getPessoa_nome() {
        return Pessoa_nome;
    }

    public void setPessoa_nome(String pessoa_nome) {
        Pessoa_nome = pessoa_nome;
    }

    public String getPessoa_endereco() {
        return Pessoa_endereco;
    }

    public void setPessoa_endereco(String pessoa_endereco) {
        Pessoa_endereco = pessoa_endereco;
    }

    public abstract void apresentar();
}


