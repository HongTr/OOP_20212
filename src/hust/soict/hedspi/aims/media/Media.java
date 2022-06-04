package hust.soict.hedspi.aims.media;

public class Media {


    private static int temp = -1;
    public int ID;
    private String title;
    private String category;
    private float cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(String title, String category, float cost){
        temp++;
        this.ID = temp;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public void PrintList(){

    }
}
