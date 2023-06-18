import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {

    double MaiorNotaFaculdade = 0;

    String nome = (String) JOptionPane.showInputDialog("Digite seu nome: ");

    int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade: "));

    String statusDoUsuario[] = { "Estou bem", "Indo", "Não muito bem" };

    String statusUsuario = (String) JOptionPane.showInputDialog(null, "Como você está", null, 1, null,
        statusDoUsuario, statusDoUsuario[1]);

    String tipoSanguineo = (String) JOptionPane.showInputDialog("Qual seu tipo sanguíneo:");

    int CapturarQuantoTempoQuerAumentarAIdade = Integer
        .parseInt(JOptionPane.showInputDialog("Informe quantos anos deseja aumentar na sua idade: "));

    double CapturarMaiorNotaDaEscola = Double
        .parseDouble(JOptionPane.showInputDialog("Qual foi sua maior nota na escola: "));

    String statusFaculdade[] = { "Cursando", "Finalizado", "Não faço" };

    String statusDaFaculdade = (String) JOptionPane.showInputDialog(null, "Como está na faculdade: ", null, 1, null,
        statusFaculdade, statusFaculdade[1]);

    if (statusDaFaculdade == "Cursando") {
      MaiorNotaFaculdade = Double
          .parseDouble(JOptionPane.showInputDialog("Qual foi sua maior nota na falcudade: "));
    }

    else if (statusDaFaculdade == "Finalizado") {
      MaiorNotaFaculdade = Double
          .parseDouble(JOptionPane.showInputDialog("Qual foi sua maior nota na falcudade: "));
    }

    else if (statusDaFaculdade == "Não faço") {
      System.out.println("Ah, ok... Obrigado!");
    }

    String hobby = JOptionPane.showInputDialog("Qual o seu hobby");

    int idadeSomadaComTempo = CapturarQuantoTempoQuerAumentarAIdade + idade;

    double diferencaEntreNotas = CapturarMaiorNotaDaEscola - MaiorNotaFaculdade;

    System.out.println("Olá, " + nome + " Você está bem? " + statusUsuario);
    System.out.println("O seu tipo sanguíneo é: " + tipoSanguineo + " E a sua idade: " + idade + " Daqui a : "
        + CapturarQuantoTempoQuerAumentarAIdade + " anos você terá: " + idadeSomadaComTempo);
    System.out.println(
        "Sua maior nota na escola foi: " + CapturarMaiorNotaDaEscola + " e sua faculdade está: " + statusDaFaculdade);
    System.out.println("Sua maior nota na faculdade foi: " + MaiorNotaFaculdade
        + " A diferença entre sua maior nota na escola e na faculdade foi: " + diferencaEntreNotas);
    System.out.println("O seu hobby é: " + hobby);
  }
}