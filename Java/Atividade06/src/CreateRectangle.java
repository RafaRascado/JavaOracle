public class CreateRectangle {

    public void Rectangle(int largura, int altura) {

        if (largura < 4 || altura < 3) {
            System.out.println("Infelizmente o tamanho informado não conseguirá realizar o desenho do retangulo");
        } else {
            for (int i = 0; i < largura; i++) {
                System.out.print("# ");
            }

            System.out.println();

            for (int i = 1; i < altura - 1; i++) {
                System.out.print("# ");

                for (int j = 1; j < largura - 1; j++) {
                    System.out.print("  ");
                }

                System.out.print("#\n");
            }

            for (int i = 0; i < largura; i++) {
                System.out.print("# ");
            }
        }
    }
}