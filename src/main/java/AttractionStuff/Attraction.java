package AttractionStuff;

public abstract class Attraction {
    private String name;
    private int funRating;

    public Attraction(String name, int funRating) {
        this.name = name;
        this.funRating = funRating;
    }

    public String getName() {
        return this.name;
    }

    public int funRating() {
        return this.funRating;
    }
}
