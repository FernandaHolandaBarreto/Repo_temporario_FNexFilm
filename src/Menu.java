public class Menu {

    private String logo;
    private String localizacao;
    private String menuOpcoes;

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getMenuOpcoes() {
        return menuOpcoes;
    }

    public void setMenuOpcoes(String menuOpcoes) {
        this.menuOpcoes = menuOpcoes;
    }



    Menu() {
        this.logo = "NexFilm";
        this.menuOpcoes = "Filme|Promoções|Notícias";

    }

    @Override
    public String toString() {
        return "Menu{" +
                "logo='" + logo + '\'' +
                ", menuOpcoes='" + menuOpcoes + '\'' +
                '}';
    }
}
