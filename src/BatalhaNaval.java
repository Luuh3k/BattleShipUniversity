public class BatalhaNaval {
    public static void main(String[] args) {
        // Board size
        int linhas = 5;
        int colunas = 5;

        //Creation of the board (not mandatory to fill in now, we only use the coordinates)
        char[][] tabuleiro = new char[linhas][colunas];

        // Defining the size of ships
        int tamanhoNavioVertical = 3;
        int tamanhoNavioHorizontal = 4;

        //Initial vertical ship position (X, Y)
        int navioVerticalX = 1;
        int navioVerticalY = 2;

        // Initial horizontal ship position (X, Y)
        int navioHorizontalX = 3;
        int navioHorizontalY = 0;

        System.out.println("Posições dos navios:");

        // Positioning the ship vertically (same column, different rows)
        System.out.println("Navio Vertical:");
        for (int i = 0; i < tamanhoNavioVertical; i++) {
            int x = navioVerticalX + i;
            int y = navioVerticalY;
            System.out.printf("(%d, %d)\n", x, y);
            tabuleiro[x][y] = 'V'; // For board display only, optional
        }

        // Positioning the ship horizontally (same row, different columns)
        System.out.println("Navio Horizontal:");
        for (int i = 0; i < tamanhoNavioHorizontal; i++) {
            int x = navioHorizontalX;
            int y = navioHorizontalY + i;
            System.out.printf("(%d, %d)\n", x, y);
            tabuleiro[x][y] = 'H'; // For board display only, optional
        }

        // Displaying the board (optional, visual only)
        System.out.println("\nTabuleiro:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (tabuleiro[i][j] == 'V' || tabuleiro[i][j] == 'H') {
                    System.out.print(tabuleiro[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
