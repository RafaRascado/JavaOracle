import java.util.*;

public class Jogos {
    private String Nome;
    private cartaoCredito cartaoCredito;
    private int gerarTiquetes;
    private int ValorDeCreditosNecessariosParaJogar;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public cartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(cartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public int getValorDeCreditosNecessariosParaJogar() {
        return ValorDeCreditosNecessariosParaJogar;
    }

    public void setValorDeCreditosNecessariosParaJogar(int valorDeCreditosNecessariosParaJogar) {
        ValorDeCreditosNecessariosParaJogar = valorDeCreditosNecessariosParaJogar;
    }

    public boolean iniciarJogo() {
        if (cartaoCredito.getSaldoCredito() >= ValorDeCreditosNecessariosParaJogar) {
            return true;
        } else {
            return false;
        }
    }

    public int getGerarTiquetes() {
        Random tique = new Random();
        gerarTiquetes += tique.nextInt(100);
        return gerarTiquetes;
    }
}
