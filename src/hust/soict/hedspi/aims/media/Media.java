package hust.soict.hedspi.aims.media;

public abstract class Media {
    private static int temp = -1;
    public int ID;
    private String title;
    private String category;
    private float cost;

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public int getID(){return ID;}
    /*public void setTitle(String title) {
        this.title = title;
    }*/



    /*public void setCategory(String category) {
        this.category = category;
    }*/



    /*public void setCost(float cost) {
        this.cost = cost;
    }*/

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
