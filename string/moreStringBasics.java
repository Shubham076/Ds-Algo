public class moreStringBasics {
    public static void main(String[] args){
        String s1 = "1";

        // extract numeric value from a string
        int x = Integer.parseInt(s1);
        char c = '2';

        // extract numeric value from a character
        // int y = Character.getNumericValue(c);
        int y = c - '0';
        System.out.println(x + " " + y);

        // check if character is a digit or not
        System.out.println(Character.isDigit(c));

        // print ascii value of a character;
        int v = (int)'A';
        System.out.println(v);

        // printing charaters from a 
        char a = 'a' + 2;
        System.out.println(a);
    }
}
