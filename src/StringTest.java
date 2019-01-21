import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringFunctions function = new StringFunctions();

        System.out.print("Please enter a sentence to reverse\n");
        function.setSentence(input.nextLine());
        //System.out.println(function.reverseString(function.getSentence()));
        function.reverseString(function.getSentence());
        //function.reverseIndex(function.getSentence());

        //Gives the user the option to enter a different sentence
        System.out.println("Would you like to enter a new sentence? yes or no");
        String newString = input.nextLine();
        if(newString.equalsIgnoreCase("yes")){
            System.out.println("Enter a new sentence.");
            function.setSentence(input.nextLine());
        }

        //Count a letter in the sentence
        System.out.println("Enter a letter to count");
        char letter = input.next().charAt(0);
        System.out.println("The letter appears " + function.letterCount(letter, function.getSentence())
                + " times");

        System.out.println("");
        input.nextLine();

        System.out.println("Enter a substring to check for and count.");
        function.setSubStr(input.nextLine());
        System.out.println(function.countSS(function.getSentence(), function.getSubStr()));

    }
}
