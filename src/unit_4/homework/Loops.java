package unit_4.homework;

public class Loops {
    /*
       Write the method everyOtherLetterPyramid that will print every other letter of the String that was printed on
       the previous line. To call this method inside public static void main, you will need to make this method static
       as well. Use this method header:
        */
    public static void everyOtherLetterPyramid(String str){
//        for(int i = str.length(); i > 0; i -= 2){
////            System.out.print(str.charAt(i));
//            for(int j = 1; j < i; j++){
//                System.out.print(str.charAt(j));
//            }
//            System.out.println();
//        }

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < i; j+=2){
                System.out.printf("%c ", str.charAt(j));
            }
            System.out.printf("%c\n", str.charAt(i));
        }
    }

    //String Builder :/

    public static void everyOtherWordBackwards(String str){
        /*
        This is not my code, I looked this up. I can sorta understand how it works, but I've never used
        StringBuilder before. 
        */

        StringBuilder sb = new StringBuilder();

        String[] words = str.split(" "); //step 1

        for(String word : words){
            String reversed = new StringBuilder(word).reverse().toString();
            sb.append(reversed + " ");
        }
        System.out.println(sb.toString().trim());
    }

    public static void main(String[] args) {

        everyOtherWordBackwards("hello there how are you!");


        everyOtherLetterPyramid("FremdVikings");
        System.out.println();
        /*
        Use 2 loops to generate the following output.
            12345
            1234
            123
            12
            1
         */
        for(int i = 6; i > 0; i--){
            for(int j = 1; j < i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        /*
        Use 2 loops to generate the following output.
            55555
            4444
            333
            22
            1
         */
        for(int i = 5; i > -1; i--){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
