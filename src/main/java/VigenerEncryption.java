public class VigenerEncryption {
    private final String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public String encrypt(String input, String key) {
        StringBuilder result = new StringBuilder();
        int iter = 0;
        for (char c : input.toCharArray()) {
            iter = iter != key.length() ? iter : 0;
            char keyCharacter = key.toCharArray()[iter];
            result.append(alphabet.charAt((alphabet.indexOf(c) + alphabet.indexOf(keyCharacter)) % alphabet.length()));
            iter++;
        }
        return result.toString();
    }

    public String decrypt(String input, String key) {
        StringBuilder result = new StringBuilder();
        int iter = 0;
        for (char c : input.toCharArray()) {
            iter = iter != key.length() ? iter : 0;
            char keyCharacter = key.toCharArray()[iter];
            result.append(alphabet.charAt((alphabet.indexOf(c) - alphabet.indexOf(keyCharacter)) % alphabet.length()));
            iter++;
        }
        return result.toString();
    }
}
