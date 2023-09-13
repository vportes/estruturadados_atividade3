import java.util.Scanner;

public class atividade {
    static int numeros[][] = new int[4][4];
    static Scanner teclado = new Scanner(System.in);

    public static void inserir(){
        for (int linha = 0; linha < numeros.length; linha++){
            for(int coluna = 0; coluna < numeros[linha].length; coluna++){
                System.out.print("Linha " + linha + " coluna " + coluna+": ");
                numeros[linha][coluna] = teclado.nextInt();
            }
        }
    }
    public static void mostrarTodos(){
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                System.out.println("Linha " + linha + " coluna " + coluna + " = " +numeros[linha][coluna]);
            }
        }
    }

    public static void somarTodos(){
        int soma = 0;
        for (int linha = 0; linha < numeros.length; linha++) {
            for (int coluna = 0; coluna < numeros[linha].length; coluna++) {
                soma = soma + numeros[linha][coluna];
            }
            System.out.println("Soma de todos os elementos = "+soma);
        }
    }

    public static void mostrarSomaColuna(int coluna){
        int soma = 0;
        for (int linha = 0; linha < numeros.length; linha++) {
            soma = soma + numeros[linha][coluna];
        }
        System.out.println("Soma da coluna "+coluna+" = "+soma);
    }

    public static void mostrarSomaLinha(int linha){
        int soma = 0;
        for (int coluna = 0; coluna < numeros.length; coluna++) {
            soma = soma + numeros[linha][coluna];
        }
        System.out.println("A soma da linha "+linha+" = "+soma);
    }

    public static void somarDiagonal(){
        int soma = 0;
        for (int x = 0; x < numeros.length; x++) {
            soma = soma + numeros[x][x];
        }
        System.out.println("Soma da diagonal = "+soma);
    }

    public static void somarDiagonalSecundaria(){
        int soma = 0;
        for (int linha = 0; linha < numeros.length; linha++) {
            soma = soma + numeros[linha][numeros.length - 1 - linha];
        }
        System.out.println("Soma da diagonal secundaria = " + soma);
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("\n1 - Inserir elementos");
            System.out.println("2 - Mostrar todos os elementos");
            System.out.println("3 - Somar coluna");
            System.out.println("4 - Somar linha");
            System.out.println("5 - Somar todos os elementos");
            System.out.println("6 - Somar diagonal");
            System.out.println("7 - Somar diagonal secundaria");
            System.out.println("9 - Fim");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1 :
                    inserir();
                    break;
                case 2 :
                    mostrarTodos();
                    break;
                case 3 :
                    int coluna = 0;
                    System.out.print("Digite a coluna a ser somada: ");
                    coluna = teclado.nextInt();
                    mostrarSomaColuna(coluna);
                    break;
                case 4 :
                    int linha = 0;
                    System.out.print("Digite a linha a ser somada: ");
                    linha = teclado.nextInt();
                    mostrarSomaLinha(linha);
                    break;
                case 5 :
                    somarTodos();
                    break;
                case 6 :
                    somarDiagonal();
                    break;
                case 7 :
                    somarDiagonalSecundaria();
                    break;
                case 9 :
                    System.out.print("Fim.");
                    break;
                default :
                    System.out.print("Escolha incorreta.");
                    break;
            }
        }
    }
}