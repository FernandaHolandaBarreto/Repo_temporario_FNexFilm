public class Banner {

    private  String nome;
    private  String classicacao;
    private  String horario;
    private  String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassicacao() {
        return classicacao;
    }

    public void setClassicacao(String classicacao) {
        this.classicacao = classicacao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Banner(String nome, String classicacao, String horario, String genero) {
        this.nome = nome;
        this.classicacao = classicacao;
        this.horario = horario;
        this.genero = genero;



    }
}
