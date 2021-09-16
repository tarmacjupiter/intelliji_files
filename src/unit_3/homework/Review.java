package unit_3.homework;

public class Review {
    private String name;
    private String business;
    private int rating;

    //FULL CONSTRUCTOR
    public Review(String aName, String aBusiness, int aRating){
        name = aName;
        business = aBusiness;
        rating = aRating;
    }
    //DEFAULT CONSTRUCTOR
    public Review(){
        name = "N/A";
        business = "N/A";
        rating = 0;
    }

    //GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    /*
    toString() method
     */

    public String toString(){
        System.out.println(name + ", " + business + ", " + rating);
        if(rating == 5){
            return "** Strongly Recommended";
        }else if(rating == 1){
            return "** Strongly Discouraged";
        }else{
            return "** Neither Recommended or Discouraged";
        }
    }
}
