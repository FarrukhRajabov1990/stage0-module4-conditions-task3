package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("Vowel");
        } else if (character == 'b' || character == 'c' || character == 'd' || character == 'f' || character == 'g' ||
        character == 'h' || character == 'j' || character == 'k' || character == 'l' || character == 'm' || character == 'n' ||
        character == 'p' || character == 'q' || character == 'r' || character == 's' || character == 't' || character == 'v' ||
        character == 'w' || character == 'x' || character == 'y' || character == 'z' ||
                character == 'B' || character == 'C' || character == 'D' || character == 'F' || character == 'G' ||
                character == 'H' || character == 'J' || character == 'K' || character == 'L' || character == 'M' || character == 'N' ||
                character == 'P' || character == 'Q' || character == 'R' || character == 'S' || character == 'T' || character == 'V' ||
                character == 'W' || character == 'X' || character == 'Y' || character == 'Z') {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
