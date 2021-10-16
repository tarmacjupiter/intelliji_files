package unit_4.lab;

public class PigLatin {
    String phrase;

    public PigLatin(String phrase){
        this.phrase = phrase;
    }

    public void toPigLatin(String phrase){

        String phraseArr[] = phrase.split(" ");



     /*
     1. words beginning with consonants -> consonant/consonant cluster goes to end, add "ay"
        cat -> atcay
        black -> ackblay

    3. words beginning with y -> treat y as a consonant
        yellow -> ellowyay
      */

        // 2. words beginning with vowels -> add "yay" to the end
        //        oval -> ovalyay
        //        apple -> appleyay

        for(int i = 0; i < phraseArr.length; i++){
            switch(phraseArr[i].charAt(0)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    phraseArr[i] += "yay";
            }
            System.out.print(phraseArr[i] + " ");
        }

//        System.out.println(phraseArr[0]);

    }

}
