public class Sessoes {

    private String nomeDoShopping;
    private String tipoDeCinema;
    private String horarioDisponivel;
    private String enderecoShopping;

    public String getNomeDoShopping() {
        return nomeDoShopping;
    }

    public void setNomeDoShopping(String nomeDoShopping) {
        this.nomeDoShopping = nomeDoShopping;
    }

    public String getTipoDeCinema() {
        return tipoDeCinema;
    }

    public void setTipoDeCinema(String tipoDeCinema) {
        this.tipoDeCinema = tipoDeCinema;
    }

    public String getHorarioDisponivel() {
        return horarioDisponivel;
    }

    public void setHorarioDisponivel(String horarioDisponivel) {
        this.horarioDisponivel = horarioDisponivel;
    }

    public String getEnderecoShopping() {
        return enderecoShopping;
    }

    public void setEnderecoShopping(String enderecoShopping) {
        this.enderecoShopping = enderecoShopping;
    }

    public Sessoes(String nomeDoShopping, String tipoDeCinema, String horarioDisponivel, String enderecoShopping) {
        this.nomeDoShopping = nomeDoShopping;
        this.tipoDeCinema = tipoDeCinema;
        this.horarioDisponivel = horarioDisponivel;
        this.enderecoShopping = enderecoShopping;


    }


}
