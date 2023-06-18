public class App {
    public static void main(String[] args) throws Exception {

        Terminal terminal1 = new Terminal();
        cartaoCredito cartaoCredito1 = new cartaoCredito();
        Jogos jogos1 = new Jogos();
        CategoriaPremio categoriaPremio1 = new CategoriaPremio();

        cartaoCredito1.setJogos(jogos1);
        cartaoCredito1.setTerminal(terminal1);
        cartaoCredito1.setCategoriaPremio(categoriaPremio1);

        terminal1.setCartaoCredito(cartaoCredito1);
        jogos1.setCartaoCredito(cartaoCredito1);
        categoriaPremio1.setCartaoCredito(cartaoCredito1);
        categoriaPremio1.setTerminal(terminal1);
        terminal1.setCategoriaPremio(categoriaPremio1);

        terminal1.setValorCreditoParaInserir(150);
        jogos1.setNome("Carrinho de bate bate");
        jogos1.setValorDeCreditosNecessariosParaJogar(10);
        categoriaPremio1.setNome("Troféu Tribruxo");
        categoriaPremio1.setQuantidadeDeItensDisponiveisNoEstoque(4);
        categoriaPremio1.setValorDeTiquetesObrigatoriosParaPremio(11);
        System.out.println();
        terminal1.visualizarCreditoETiquete();
        System.out.println(
                "Quantidade do item no estoque: " + categoriaPremio1.getQuantidadeDeItensDisponiveisNoEstoque());

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");

        Terminal terminal2 = new Terminal();
        cartaoCredito cartaoCredito2 = new cartaoCredito();
        Jogos jogos2 = new Jogos();

        cartaoCredito2.setJogos(jogos2);
        cartaoCredito2.setTerminal(terminal2);
        cartaoCredito2.setCategoriaPremio(categoriaPremio1);

        terminal2.setCartaoCredito(cartaoCredito2);
        jogos2.setCartaoCredito(cartaoCredito2);
        categoriaPremio1.setCartaoCredito(cartaoCredito2);
        categoriaPremio1.setTerminal(terminal2);
        terminal2.setCategoriaPremio(categoriaPremio1);

        terminal2.setValorCreditoParaInserir(10);
        jogos2.setNome("Carrinho de bate bate");
        jogos2.setValorDeCreditosNecessariosParaJogar(10);
        System.out.println();
        terminal2.visualizarCreditoETiquete();
        System.out.println(
                "Quantidade do item no estoque: " + categoriaPremio1.getQuantidadeDeItensDisponiveisNoEstoque());

        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------");

        Terminal terminal3 = new Terminal();
        cartaoCredito cartaoCredito3 = new cartaoCredito();
        Jogos jogos3 = new Jogos();

        cartaoCredito3.setJogos(jogos3);
        cartaoCredito3.setTerminal(terminal3);
        cartaoCredito3.setCategoriaPremio(categoriaPremio1);

        terminal3.setCartaoCredito(cartaoCredito3);
        jogos3.setCartaoCredito(cartaoCredito3);
        categoriaPremio1.setCartaoCredito(cartaoCredito3);
        terminal3.setCategoriaPremio(categoriaPremio1);
        categoriaPremio1.setTerminal(terminal3);
        terminal3.setValorCreditoParaInserir(100);
        jogos3.setNome("Carrinho de bate bate");
        jogos3.setValorDeCreditosNecessariosParaJogar(10);
        System.out.println();
        terminal3.visualizarCreditoETiquete();
        System.out.println(
                "Quantidade do item no estoque: " + categoriaPremio1.getQuantidadeDeItensDisponiveisNoEstoque());
        terminal3.transferirSaldoCartoes(cartaoCredito1, cartaoCredito3);
        System.out.println();
    }
}
