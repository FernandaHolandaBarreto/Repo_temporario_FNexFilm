public abstract class Publicidade {


    private String logo;
    private  String promocoes;


    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPromocoes() {
        return promocoes;
    }

    public void setPromocoes(String promocoes) {
        this.promocoes = promocoes;
    }

    public Publicidade(String logo, String promocoes) {
        this.logo = logo;
        this.promocoes = promocoes;



    }
}
