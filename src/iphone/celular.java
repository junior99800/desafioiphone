package iphone;

public class celular {
    public static void main(String[] args) {
        // Testando o ReprodutorMusical
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica("Random");
        reprodutor.tocar();
        reprodutor.pausar();

        // Testando o AparelhoTelefonico
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("3333399");
        telefone.iniciarCorreioVoz();
        telefone.atender();

        // Testando o NavegadorNaInternet
        NavegadorNaInternet navegador = new NavegadorNaInternet();
        navegador.adicionarNovaAba();
        navegador.exibirPagina("www.-------.br");
        navegador.atualizarPagina();

    }
}
