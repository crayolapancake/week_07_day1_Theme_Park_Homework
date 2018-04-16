package StallStuff;

public abstract class Stall {
    private String name;
    private String owner_name;
    private int parking;
    private int funRating;

    public Stall(String name, String owner_name, int parking, int funRating) {
        this.name = name;
        this.owner_name = owner_name;
        this.parking = parking;
        this.funRating = funRating;
    }

    public String getName(){
        return this.name;
    }

    public String getOwner_Name(){
        return this.owner_name;
    }

    public int getParking(){
        return this.parking;
    }

    public int getFunRating(){
        return this.funRating;
    }
}
