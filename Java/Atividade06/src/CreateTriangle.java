public class CreateTriangle {

    public void triangle(int altura, int base) {

        if (altura < 3 || base < 3) {
            System.out.println("Infelizmente o tamanho informado não conseguirá realizar o desenho do retangulo");
        } else {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == altura - 1 || j == i) {
                        System.out.print("# ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}