package unit_4.lab;

public class PigLatin {
    String phrase;

    public PigLatin(String phrase){
        this.phrase = phrase;
    }

    public void toPigLatin(String phrase){
        //Break up String into an array of words, each split by a space (" ")
        String phraseArr[] = phrase.split(" ");

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
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                    phraseArr[i] += "yay";
            }
            /*
                1. words beginning with consonants -> consonant/consonant cluster goes to end, add "ay"
                    cat -> atcay
                    black -> ackblay
            */
            if (phraseArr[i].charAt(0) != 'a' && phraseArr[i].charAt(0) != 'e' && phraseArr[i].charAt(0) != 'i' && phraseArr[i].charAt(0) != 'o' && phraseArr[i].charAt(0) != 'u' && phraseArr[i].charAt(0) != 'A' && phraseArr[i].charAt(0) != 'E' && phraseArr[i].charAt(0) != 'I' && phraseArr[i].charAt(0) != 'O' && phraseArr[i].charAt(0) != 'U') {
                    phraseArr[i] = phraseArr[i].substring(1) + phraseArr[i].charAt(0);
                    phraseArr[i] += "ay";
                }
                System.out.print(phraseArr[i] + " ");
            }
        }
    }


