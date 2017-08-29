/**
* The CryptoApp is to resolve the edx Microsoft Java Crypto project
* https://courses.edx.org/courses/course-v1:Microsoft+DEV276x+2T2017
*
 */
import java.util.*;

class CryptoApp{
    public static void main(String[] args) {
        String result = normalizeText("This is some \"really\" great. (Text!?)");
        String passValue = "THISISSOMEREALLYGREATTEXT";
        boolean pass = result.equals(passValue);
        System.out.println(result);
        System.out.println("normalizeText method passes: " + pass);

    }

    public static String normalizeText(String inputTexString){
    /**
    * Removes all the spaces from your text
    * Remove any punctuation (. , : ; \' \" \! \? ( ) )
    * Turn all lower-case letters into upper-case letters
    * Return the result.
    * Then call
    * normalizeText("This is some \"really\" great. (Text!?)");
     */
        String text = inputTexString.toUpperCase();
        text = text.replaceAll("[^\\w]", "" );
        return text;
    }

}