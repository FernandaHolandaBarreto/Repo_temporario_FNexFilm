void main() {

    IO.println("========Menu=======");

    Menu menu = new Menu();
    IO.println(menu);
    menu.setLocalizacao(IO.readln("Digite sua Localização: "));

    IO.println("=======Fim do menu=======");

    IO.println("======Usúario=====");
    Usuario usuario = new Usuario();
    usuario.setEmail(IO.readln("Digite seu Email"));






}