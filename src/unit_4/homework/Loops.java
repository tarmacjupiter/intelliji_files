package unit_4.homework;

public class Loops {
    /*
       Write the method everyOtherLetterPyramid that will print every other letter of the String that was printed on
       the previous line. To call this method inside public static void main, you will need to make this method static
       as well. Use this method header:
        */
    public static void everyOtherLetterPyramid(String str){
        for(int i = str.length(); i > 0; i -= 2){
//            System.out.print(str.charAt(i));
            for(int j = 1; j < i; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

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
