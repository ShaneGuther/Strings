import javax.print.DocFlavor;

public class StringFunctions {
    private String sentence;
    private String subStr;
    private char[] letters;
    private char[] reversed;
    //private String sent;

    public String getSentence() {
        return sentence;
    }

    public String getSubStr(){
        return subStr;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setSubStr(String subString){
        this.subStr = subString;
    }

/*    public void setSent(String sent) {
        this.sent = sent;
    }*/

    public char[] reverseString(String sentence) {
        letters = sentence.toCharArray();
        for (int count = letters.length - 1; count >= 0; count--) {
            int counter1 = 0;
            counter1++;
            reversed = new char[sentence.length()];
            reversed[counter1] = letters[count];
            System.out.print(letters[count]);

        }
        System.out.println("");
        return reversed;
    }

    private int counter = 0;

    public int letterCount(char c, String s) {
        for (int count = 0; count < s.length(); count++) {
            if (c == s.charAt(count)) {
                counter++;
            }
        }
        return counter;
        //System.out.println("The letter appears " + counter + " times.");

    }

    private int counter4 = 0;
    public int countSS(String s, String t){
        for(int i = 0; i <= s.length(); i++){
            for(int j = i; j <= s.length(); j++){
                if(t.equalsIgnoreCase(s.substring(i,j))){
                    counter4++;
                }
            }
        }
        return counter4;
    }

       /* public void reverseIndex(String sentence){
        for(int i = sentence.length()-1; i >=0; i--)
            System.out.println(sentence.);

    }*/
}
