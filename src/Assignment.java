import java.util.Locale;

public class Assignment {
    /**
     * Returns the sum of all the received numbers.
     */
    public int addThreeNumbers(int i, int j, int k) {
        return i+j+k;
    }

    /**
     * Evaluates if the received number is
     * Small (less than 100).
     * Big (greater than 1000).
     * Medium (not small or big)
     */
    public String isNumberSmallMediumOrBig(int number){
        if(number > 100){
            return "Small";
        }
        else if(number < 1001){
            return "Big";
        }
        else
            return "Medium";

    }


    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     */
    public void printAllStrings(String[] strings){
        for(String s: strings){
            System.out.println(s);
        }
    }

    /**
     * Returns the sum of all numbers in received array.
     */

    int sum;
    public int arraySum(int[] numbers){
        for(Integer number : numbers){
            sum +=number;
        }
        return sum;
    }

    /**
     * Print all characters until a char is "."
     * Do not print in separate lines.
     */
    public void printFirstSentence(char[] chars) {
        for(char c : chars){
            if(c=='.'){
                System.out.print(c);
                break;
            }
            System.out.print(c);
        }
    }

    /**
     * Prints course name for provided course code.
     * PGR103 -> Objektorientert programmering
     * DB1102 -> Database
     * TK2100 -> Informasjonssikkerhet
     * or "Uknown" if none of the above.
     */
    public void printCourseName(String courseCode){

        switch (courseCode){
            case "PGR103":
                System.out.print("Objektorientert programmering");
                break;
            case "DB1102":
                System.out.print("Database");
                break;
            case "TK2100":
                System.out.print("Informasjonssikkerhet");
                break;
            default:
                System.out.print("Unknown");
        }
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not exactly "Corona".
     */
    public void printAllStringsNotCorona(String[] strings){
        for(String s : strings) {
            if (!"Corona".equals(s)) {
                System.out.print(s);
            }
        }
    }

    /**
     * Prints the provided strings in upper case letters.
     * One String on each line.
     */
    public void printUpperCaseStrings(String[] strings){
        for(String s : strings){
            System.out.println(s.toUpperCase(Locale.ROOT));
        }
    }

    /**
     * Returns true if provided color is represented in the Norwegian flag.
     * Color input is lowercase only. */
    public boolean isColorInNorwegianFlag(String color){
        switch (color.toLowerCase()){
            case "red":
            case "white":
            case "blue":
                return true;
            default:
                return false;
        }
    }

    /**
     * Returns the index of the first occurrence of char c in String string.
     * Returns -1 if char is not found.
     */
    public int firstOccurrence(String string, char c){
        char[] toChar = string.toCharArray();
        for(int i = 0; i < toChar.length; i++){
            if(c == toChar[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the combined length of the provided Strings.
     */
    public int combinedLength(String s1, String s2){
        return s1.length() + s2.length();
    }

    /**
     * Returns the sum of all the received numbers.
     */

    public int sums;
    public int addNumbers(int... numbers){
        for(Integer i : numbers){
            sums+=i;
        }
        return sums;
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not Corona (case insensitive).
     */
    public void printAllStringsNotCoronaCaseInsensitive(String[] strings){
        for(String s : strings){
            if(!"Corona".equalsIgnoreCase(s)){
                System.out.println(s);
            }
        }
    }

}
