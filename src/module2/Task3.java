package module2;


public class Task3 {
    public static void main(String[] args) {
        char[][] symbols = {{'a', 'b', 'r'}, {'c', 'c', 'c'}};
        printSymbols(symbols);
    }

    private static void printSymbols(char[][] symbols) {
        int length = symbols.length;
        for (int i = 0; i < length; i++) {
            char[] symbolsI = symbols[i];
            for (int j = 0; j < symbolsI.length; j++) {
                char symbol = symbolsI[j];
                System.out.println(symbol);
            }
        }
    }
}
