package unit_3.examples;

public class IceCream {
    private String flavor;
    private int numScoops;
    private boolean inCone;

    public IceCream(String flavor, int numScoops, boolean inCone) {
        this.flavor = flavor;
        this.numScoops = numScoops;
        this.inCone = inCone;
    }

    // two IceCream objects are equal if ALL variables are the same
    public boolean equals(IceCream other) {
        if(this.flavor.equals(other.flavor) && this.numScoops == other.numScoops && this.inCone == inCone){
            return true;
        }else{
            return false;
        }
    }


    // two IceCream objects are compared based on the number of scoops.
    // a cone with less scoops is considered to come "before" a cone with
    // more scoops
    public int compareTo(IceCream other) {
        if(this.numScoops < other.numScoops){
            return -1;
        }else if(this.numScoops > other.numScoops){
            return 1;
        }else{
            return 0;
        }
    }

}

