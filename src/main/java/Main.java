public class Main {
    private static final CesarEncryption cesarEncryption = new CesarEncryption();
    private static final TarabarscayGramota tarabarscayGramota = new TarabarscayGramota();
    private static final VigenerEncryption vigenerEncryption = new VigenerEncryption();
    private static final Transpose transpose = new Transpose(5,6);


    public static void main(String[] args) {

        String inputCesar1 = "ПРИШЁЛ";
        String inputCesar2 = "ТУЛЫИО";
        System.out.println("Шифр Цезаря");
        System.out.println(inputCesar1 + " -> " + cesarEncryption.encrypt(inputCesar1, 3));
        System.out.println(inputCesar2 + " -> " +cesarEncryption.encrypt(inputCesar2, 30));


        String inputTarabarscay1 = "РАРА";
        String inputTarabarscay2 = "МАМА";
        System.out.println("\nТарабарская грамота");
        System.out.println(inputTarabarscay1 + " -> " + tarabarscayGramota.encrypt(inputTarabarscay1));
        System.out.println(inputTarabarscay2 + " -> " +tarabarscayGramota.encrypt(inputTarabarscay2));


        String inputVigener1 = "НАДПАРИЖЕМНЕБОСИНЕЕ";
        String inputVigener2 = "ЮОЛПРЯРЖХЫХЕСЭЩИЮУМ";
        String key ="РОЗА";
        System.out.println("\nШифр Виженера");
        System.out.println(inputVigener1 + " -> " + vigenerEncryption.encrypt(inputVigener1,key));
        System.out.println(inputVigener2 + " -> " +vigenerEncryption.decrypt(inputVigener2,key));


        String inputTranspose1 = "МИНСКСТОЛИЦАРЕСПУБЛИКИБЕЛАРУСЬ";
        String inputTranspose2 = "МТРЛЛИОЕИАНЛСКРСИПИУКЦУБССАБЕЬ";
        System.out.println("\nПостолбцовая транспозиция");
        System.out.println(inputTranspose1 + " -> " + transpose.encrypt(inputTranspose1));
        System.out.println(inputTranspose2 + " -> " +transpose.decrypt(inputTranspose2));

        int n = 4;
        int[][] keyMatrix = {
                {0,1,0,0},
                {1,0,0,0},
                {0,1,0,0},
                {0,0,0,1}
        };
         CryptoSystemCardano cryptoSystemCardano = new CryptoSystemCardano(keyMatrix,n);
        String inputCardano1 = "ЛЛЛЛФФФФММММИИИИ";
        String inputCardano2 = "МЛФИ ЛФМФ ИЛИМ ФИМЛ ";
        System.out.println("\nКриптосистема Кардано");
        System.out.println(inputCardano1 + " -> " + cryptoSystemCardano.encrypt(inputCardano1));
        System.out.println(inputCardano2 + " -> " +cryptoSystemCardano.decrypt(inputCardano2));
    }
}
