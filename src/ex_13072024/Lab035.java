package ex_13072024;

public class Lab035 {
    public static void main(String[] args) {
        // Escape Chars
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1st char
        char c3 = '\r'; // Backlash, delete 1st  word
        System.out.println("Sanket" + c3 + "Umrani");//deleted 1st word
        System.out.println("Sanket" + c2 + "Umrani");//deleted space between two words
        System.out.println("Sanket" + c1 + "Umrani");//added extra space between two words
        System.out.println("Sanket" + c + "Umrani");//last word printed in next line
    }
}
