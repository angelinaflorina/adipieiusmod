public class CleanUp {
    public static void main(String[] args) {
        String text = "This is a sample text with some unwanted characters!@#$";
        String cleanText = text.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println("Cleaned text: " + cleanText);
    }
}
