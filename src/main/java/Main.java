import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println("car".substring(0, 1));
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
        System.out.println("common is: "+common);
    }
}
