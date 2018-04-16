package StallStuff;

public abstract class Stall {
    private String name;
    private String ownerName;
    private int parking;
    private int funRating;

    public Stall(String name, String owner_name, int parking, int funRating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parking = parking;
        this.funRating = funRating;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getParking(){
        return this.parking;
    }

    public int getFunRating(){
        return this.funRating;
    }
}
