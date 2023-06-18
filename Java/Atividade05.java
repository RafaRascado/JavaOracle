import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

    
    //primeiro problema da atividade utilizando If e Else
    System.out.println("Informe o comprimento de onda em nanômetros");

    Scanner teclado = new Scanner(System.in); 

    double ColorRange = teclado.nextDouble();

    if(ColorRange >= 380 && ColorRange < 450){
        System.out.println("A cor é violeta");
    } else if(ColorRange >= 450 && ColorRange < 495){
        System.out.println("A cor é azul");
    } else if(ColorRange >= 495 && ColorRange < 570){
        System.out.println("A cor é Verde");
    } else if(ColorRange >= 570 && ColorRange < 590){
        System.out.println("A cor é Amarelo");
    }else if(ColorRange >= 590 && ColorRange < 620){
        System.out.println("A cor é Laranja");
    } else if(ColorRange >= 620 && ColorRange < 750){
        System.out.println("A cor é Vermelho");
    } else {
      System.out.println("O comprimento de onda inserido não faz parte do espectro visível");
    }

    //Segundo problema da atividade utilizando If e Else
    System.out.println("Informe a cor da semáforo");

    int tecladoSemaforo = teclado.nextInt();

    if(tecladoSemaforo == 1){
      System.out.println("A próxima cor do semáforo é o verde");
    } else if(tecladoSemaforo == 2){
      System.out.println("A próxima cor do semaforo é amarela");
    } else if(tecladoSemaforo == 3){
      System.out.println("A próxima cor do semaforo é vermelha");
    } else {
      System.out.println("Cor inválida");
    }

    //Terceiro problema da atividade utilizando Switch

    System.out.println("Informe a cor que o semáforo está (irei utilizar o switch agora)");

    int escolha = teclado.nextInt();

    switch(escolha){
      case 1: 
         System.out.println("A próxima cor do semáforo é o verde");
        break;
      case 2: 
         System.out.println("A próxima cor do semaforo é amarela");
        break;
      case 3: 
         System.out.println("A próxima cor do semaforo é vermelha");
        break;
      default:
        System.out.println("Cor inválida");
    }
  }
}