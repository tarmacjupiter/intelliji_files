package unit_4.lab;

import java.util.Locale;

public class PigLatin {
    String phrase;

    public PigLatin(String phrase){
        this.phrase = phrase;
    }

    public void toPigLatin(String phrase){

        //Declare variable outside Loop to make sure you can access it later within the scope of the loop
        String output = "";

        //Turn phrase lowercase
        String lower = phrase.toLowerCase();

        //Break up String into an array of words, each split by a space (" ")
        String phraseArr[] = lower.split(" ");

        //Create new "StringBuffer" called "sb"
        StringBuffer sb = new StringBuffer();


        /*
        2. words beginning with vowels -> add "yay" to the end
                oval -> ovalyay
                apple -> appleyay
        3. words beginning with y -> treat y as a consonant
        yellow -> ellowyay
      */
        for(int i = 0; i < phraseArr.length; i++) {
            switch (phraseArr[i].charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    phraseArr[i] += "yay";
            }
            /*
                1. words beginning with consonants -> consonant/consonant cluster goes to end, add "ay"
                    cat -> atcay
                    black -> ackblay
            */
            if (phraseArr[i].charAt(0) != 'a' && phraseArr[i].charAt(0) != 'e' && phraseArr[i].charAt(0) != 'i' && phraseArr[i].charAt(0) != 'o' && phraseArr[i].charAt(0) != 'u') {
                    phraseArr[i] = phraseArr[i].substring(1) + phraseArr[i].charAt(0);
                    phraseArr[i] += "ay";
                }
                output = phraseArr[i] + " ";

//                System.out.print(output.substring(0,1).toUpperCase() + output.substring(1));
                 System.out.print(output);
        }
    }
}


