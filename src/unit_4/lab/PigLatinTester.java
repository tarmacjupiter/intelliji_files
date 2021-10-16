package unit_4.lab;

public class PigLatinTester {
    public static void main(String[] args) {

        //Turn String into instances of PigLatin cause I have no idea how to make it work otherwise
        PigLatin phrase1_obj = new PigLatin("The black cat ate a red apple");

        PigLatin phrase2_obj = new PigLatin("Writing college essays is driving me crazy");

        PigLatin phrase3_obj = new PigLatin("Everyone loves to code in Java");

        //Set the phrases to the object + containing to string using ".phrase"
        String phrase1 = phrase1_obj.phrase;

        String phrase2 = phrase2_obj.phrase;

        String phrase3 = phrase3_obj.phrase;




        translatePhrase(phrase1_obj.phrase, phrase1_obj);
        translatePhrase(phrase2_obj.phrase, phrase2_obj);
        translatePhrase(phrase3_obj.phrase, phrase3_obj);
    }

    public static void translatePhrase(String phrase, PigLatin other) {
        System.out.println("In English:");
        System.out.println("\t" + phrase);
        System.out.println("In Pig Latin: ");
        System.out.print("\t");
        other.toPigLatin(phrase);
//        System.out.println("\t" + PigLatin.toPigLatin(phrase));
        System.out.println();
    }

}
