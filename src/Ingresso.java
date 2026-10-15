import java.time.LocalDateTime;

public class Ingresso {

    private String nomeDoFilme;
    private String horarioDoFilme;
    private String tipoDeIngresso;
    private String Valor;
    private LocalDateTime data;

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getHorarioDoFilme() {
        return horarioDoFilme;
    }

    public void setHorarioDoFilme(String horarioDoFilme) {
        this.horarioDoFilme = horarioDoFilme;
    }

    public String getTipoDeIngresso() {
        return tipoDeIngresso;
    }

    public void setTipoDeIngresso(String tipoDeIngresso) {
        this.tipoDeIngresso = tipoDeIngresso;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Ingresso(String nomeDoFilme, String horarioDoFilme, String tipoDeIngresso, String valor, LocalDateTime data) {
        this.nomeDoFilme = nomeDoFilme;
        this.horarioDoFilme = horarioDoFilme;
        this.tipoDeIngresso = tipoDeIngresso;
        Valor = valor;
        this.data = data;



    }
}
