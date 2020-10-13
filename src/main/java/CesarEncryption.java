public class CesarEncryption {

    private final  String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public String encrypt(String input,int offset){
        StringBuilder result = new StringBuilder();
        for(char c : input.toCharArray()){
            result.append(alphabet.charAt((alphabet.indexOf(c) + offset)% alphabet.length()) );
        }
        return result.toString();
    }
}
