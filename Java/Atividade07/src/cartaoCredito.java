public class cartaoCredito {
    private int saldoCredito;
    private int saldoTiquetes;
    private Terminal terminal;
    private Jogos jogos;
    private int numeroCartao;
    private static int idCartao = 1;
    private CategoriaPremio categoriaPremio;

    public CategoriaPremio getCategoriaPremio() {
        return categoriaPremio;
    }

    public void setCategoriaPremio(CategoriaPremio categoriaPremio) {
        this.categoriaPremio = categoriaPremio;
    }

    public int getSaldoTiquetes() {
        saldoTiquetes += jogos.getGerarTiquetes();
        if (jogos.iniciarJogo() == true) {
            saldoCredito -= jogos.getValorDeCreditosNecessariosParaJogar();
            jogos.getGerarTiquetes();
            return saldoTiquetes;
        } else {
            return 0;
        }
    }

    public int getSaldoCredito() {
        saldoCredito = terminal.getValorCreditoParaInserir();
        return saldoCredito;
    }

    public Jogos getJogos() {
        return jogos;
    }

    public void setJogos(Jogos jogos) {
        this.jogos = jogos;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    public int getNumeroCartao() {
        this.numeroCartao = idCartao;
        idCartao += 1;
        return numeroCartao;
    }

}
