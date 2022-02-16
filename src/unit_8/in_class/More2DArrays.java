package unit_8.in_class;

public class More2DArrays {
    public static void main(String[] args) {
        String[] myKids = new String[]{"Aubrey", "Riley", "Brayden"};
        int numKids = myKids.length;

        for (String kid: myKids) {
            System.out.println(kid);
        }

        int[][] favNums = { {1, 2, 3}, {2, 4, 6}, {3, 6, 9} };

        for (int[] row: favNums) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        String[] pets = {"cat", "dog", "bird"};
        String[] foods = {"pizza", "ice cream", "chocolate"};
        String[] movies = {"Avengers", "Harry Potter", "Oceans 11"};

        String[][] myFavs = {pets, foods, movies};

        boolean result = isFound(myFavs, "ice cream");
        System.out.println("Is ice cream a fav? " + result);

        result = isFound(myFavs, "speghetti");
        System.out.println("Is speghetti a fav? " + result);
    }
    public static boolean isFound(String[][] arr, String word){
        for(String[] row : arr){
            for(String column : row){
                if(column.equals(word)){
                    return true;
                }
            }
        }
        return false;
    }
}
