package unit_4.examples;
//import org.apache.commons.lang3.StringUtils;


public class StringAlgorithms {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line

        for(int i = 0; i < mySchool.length(); i+=2){
            System.out.print(mySchool.charAt(i) + " ");
        }

        System.out.println();

        // print the String mySchool in reverse (all characters on the same line)


        for(int i = mySchool.length() - 1; i >= 0; i--){
            System.out.print(mySchool.charAt(i));
        }


         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */

        String animal = "monkey";
        String output = "";

        for(int i = 0; i < animal.length(); i++){
            output += animal.charAt(i);
            System.out.println(output);
        }


        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow";


        // Print the amount of times the word "little" appears within phrase?

        String little = "little";
        int index = phrase.indexOf(little);

        int count = 0;

        while(index != -1){
            count++;
            phrase = phrase.substring(index + 1);
            index = phrase.indexOf(little);
        }

        System.out.println("The word 'little' appeared " + count + " times.");

        // create a new String, or modify the existing String, that removes
        // the word "little" entirely

//       String newStr = "";
//       newStr += phrase.re
//       System.out.println(newStr);



        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"



        System.out.println(phrase.replace("little", "BIG"));


    }
}
