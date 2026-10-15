public class FilmesEmAltas {

    private  String nomeDoFilme;
    private  String classficacao;
    private  String tempo;

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getClassficacao() {
        return classficacao;
    }

    public void setClassficacao(String classficacao) {
        this.classficacao = classficacao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public FilmesEmAltas(String nomeDoFilme, String classficacao, String tempo) {
        this.nomeDoFilme = nomeDoFilme;
        this.classficacao = classficacao;
        this.tempo = tempo;



    }
}
