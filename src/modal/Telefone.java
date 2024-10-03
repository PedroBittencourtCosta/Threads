package modal;

public class Telefone {

    private int id;
    private int idPessoa;
    private String numero;

    public Telefone(int id, int idPessoa, String numero) {
        this.id = id;
        this.idPessoa = idPessoa;
        this.numero = numero;
    }

    public Telefone(String numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
