
public class Exercicio {

    private String nome;
    private int cod;
    private String link;

    public Exercicio(String nome1, int Cod1, String link1) {
        this.nome = nome1;
        this.cod = Cod1;
        this.link = link1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
