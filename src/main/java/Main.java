import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*        //System.out.println("car".substring(0, 1));
        //System.out.println(StringIntersection.stringIntersection("carrot", "carwash"));
        String wordA = "Sychelless";
        String wordB = "Sydney";
        String common = "";

        for(int i=0;i<wordA.length();i++){
            for(int j=0;j<wordB.length();j++){
                if(wordA.charAt(i)==wordB.charAt(j)){
                    common += wordA.charAt(i)+" ";
                    break;
                }
            }
        }
        System.out.println("common is: "+common);*/

        String str = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crown?d sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.\n";
        char sample = 'l';

        System.out.println(StartsWithLetter.startsWithLetter(str, sample));
        System.out.println(StartsWithLetter.startsWithLetter(str, 'L'));


    }
}
