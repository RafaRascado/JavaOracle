public class CategoriaPremio {
    private String nome;
    private int ValorDeTiquetesObrigatoriosParaPremio;
    private int QuantidadeDeItensDisponiveisNoEstoque;
    private cartaoCredito cartaoCredito;

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    private Terminal terminal; 

    public cartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(cartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorDeTiquetesObrigatoriosParaPremio() {
        return ValorDeTiquetesObrigatoriosParaPremio;
    }

    public void setValorDeTiquetesObrigatoriosParaPremio(int valorDeTiquetesObrigatoriosParaPremio) {
        this.ValorDeTiquetesObrigatoriosParaPremio = valorDeTiquetesObrigatoriosParaPremio;
    }

    public int getQuantidadeDeItensDisponiveisNoEstoque() {
        subtrair();
        return QuantidadeDeItensDisponiveisNoEstoque;
    }

    public void setQuantidadeDeItensDisponiveisNoEstoque(int quantidadeDeItensDisponiveisNoEstoque) {
        this.QuantidadeDeItensDisponiveisNoEstoque += quantidadeDeItensDisponiveisNoEstoque;
    }

    public void subtrair() {
        if(terminal.selecionarPremio()){
            QuantidadeDeItensDisponiveisNoEstoque -= 1;
        } else{
            QuantidadeDeItensDisponiveisNoEstoque = 0;
        }
    }

}
