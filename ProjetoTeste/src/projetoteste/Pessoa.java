
package projetoteste;



public class Pessoa {

 private int Codpessoa;
 private String nome;
 private int cpf;

    public Pessoa(int Codpessoa, String nome, int cpf) {
        this.Codpessoa = Codpessoa;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getCodpessoa() {
        return Codpessoa;
    }

    public void setCodpessoa(int Codpessoa) {
        this.Codpessoa = Codpessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
    
}
