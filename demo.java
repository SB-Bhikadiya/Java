public class demo {

    static Object sentenceCase(String text) {
        if (!text.equals("")) {
            String result = text.replaceAll("([A-Z])", " $1");
            return result.substring(0, 1).toUpperCase() + result.substring(1).toLowerCase();
        }
        return null;
    }

    public static void main(String[] args) {
        String text = "mySampleText";
        System.out.println(sentenceCase(text));  // My sample text
    }
}