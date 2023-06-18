import javax.swing.JOptionPane;

public class Terminal {
    private int valorCreditoParaInserir;
    private cartaoCredito cartaoCredito;
    private CategoriaPremio categoriaPremio;

    public int getValorCreditoParaInserir() {
        return valorCreditoParaInserir;
    }

    public void setValorCreditoParaInserir(int valorCreditoParaInserir) {
        this.valorCreditoParaInserir += valorCreditoParaInserir * 2;
    }

    public cartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(cartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public CategoriaPremio getCategoriaPremio() {
        return categoriaPremio;
    }

    public void setCategoriaPremio(CategoriaPremio categoriaPremio) {
        this.categoriaPremio = categoriaPremio;
    }

    public int consultarEstoqueCategoria() {
        return categoriaPremio.getQuantidadeDeItensDisponiveisNoEstoque();
    }

    public boolean selecionarPremio() {
        if (cartaoCredito.getCategoriaPremio().getNome().equals(categoriaPremio.getNome())) {
            if (cartaoCredito.getSaldoTiquetes() >= categoriaPremio.getValorDeTiquetesObrigatoriosParaPremio()) {
                JOptionPane.showMessageDialog(null, "Item adquirido");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Infelizmente você não ganhou tiquetes suficientes para esse prêmio, tente novamente.");
            }
            return true;
        } else {
            return false;
        }
    }

    public void visualizarCreditoETiquete() {
        System.out.println("Cartão N° " + cartaoCredito.getNumeroCartao() + " Saldo: " + cartaoCredito.getSaldoCredito()
                + " Tiquetes: " + cartaoCredito.getSaldoTiquetes());
    }

    public void transferirSaldoCartoes(cartaoCredito cartaoUm, cartaoCredito cartaoDois) {
        if (cartaoUm.getJogos().iniciarJogo() == true) {
            if (cartaoUm.getSaldoCredito() > 0) {
                int SaldoCartaoUm = cartaoUm.getSaldoCredito() - cartaoUm.getJogos().getValorDeCreditosNecessariosParaJogar();
                int SaldoCartaoDois = cartaoDois.getSaldoCredito() - cartaoDois.getJogos().getValorDeCreditosNecessariosParaJogar() + SaldoCartaoUm;
                SaldoCartaoUm = 0;
                System.out.println("Após a tranferência de saldo do cartão, o credito agora é: R$ " + SaldoCartaoDois);
            } else {
                System.out.println("O cartão um não tem limite");
            }
        } else{
             System.out.println("NÃO EXISTE ISSO PO, COVARDIA");
        }
    }
}
