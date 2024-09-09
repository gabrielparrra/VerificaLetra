public class App {
    public static void main(String[] args) throws Exception {
    String input = "Abracadabra";
    char target = 'a';
    int count = 0;

    for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (c == target || Character.toLowerCase(c) == target) {
            count++;
        }
    }

    System.out.println("A letra 'A' aparece " + count + " vezes na frase.");
    }
}
