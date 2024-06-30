package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        if (symbol == 'a' || symbol == 'b' || symbol == 'c' || symbol == 'd' || symbol == 'e' || symbol == 'f' ||
        symbol == 'g' || symbol == 'h' || symbol == 'i' || symbol == 'j' || symbol == 'k' || symbol == 'l' ||
        symbol == 'm' || symbol == 'n' || symbol == 'o' || symbol == 'p' || symbol == 'q' || symbol == 'r' ||
        symbol == 's' || symbol == 't' || symbol == 'u' || symbol == 'v' || symbol == 'w' || symbol == 'x' ||
        symbol == 'y' || symbol == 'z') {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
