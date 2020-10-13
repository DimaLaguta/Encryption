import java.util.HashMap;
import java.util.Map;

public class TarabarscayGramota {
    private Map<Character,Character> table = new HashMap<>();

    public TarabarscayGramota() {
        table.put('Б','Щ');
        table.put('В','Ш');
        table.put('Г','Ч');
        table.put('Д','Ц');
        table.put('Ж','Х');
        table.put('З','Ф');
        table.put('К','Т');
        table.put('Л','С');
        table.put('М','Р');
        table.put('Н','П');

        table.put('Щ','Б');
        table.put('Ш','В');
        table.put('Ч','Г');
        table.put('Ц','Д');
        table.put('Х','Ж');
        table.put('Ф','З');
        table.put('Т','К');
        table.put('С','Л');
        table.put('Р','М');
        table.put('П','Н');
    }

    public String encrypt(String input){
        StringBuilder result = new StringBuilder();
        for(char c : input.toCharArray()){
            result.append(table.getOrDefault(c, c));
        }
        return result.toString();
    }
}
