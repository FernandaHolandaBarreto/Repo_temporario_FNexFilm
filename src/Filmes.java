public class Filmes {


    //Classe Pai

    private  String nomeDoFilme;
    private  String genero;
    private  String classicacao;
    private  String tempo;
    private  String sinopse;
    private  double id;

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClassicacao() {
        return classicacao;
    }

    public void setClassicacao(String classicacao) {
        this.classicacao = classicacao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Filmes(String nomeDoFilme, String genero, String classicacao, String tempo, String sinopse, double id) {
        this.nomeDoFilme = nomeDoFilme;
        this.genero = genero;
        this.classicacao = classicacao;
        this.tempo = tempo;
        this.sinopse = sinopse;
        this.id = id;



    }

    public String ver(){
        return"Ver sessões";
    }

}
