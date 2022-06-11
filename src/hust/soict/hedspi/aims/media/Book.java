package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    public void addAuthor (String authorName){
        if(authors.contains(authorName)) {
            System.out.println("This author is already existed!");
            return;
        }
        authors.add(authorName);
    }
    public void removeAuthor(String authorName){
        boolean haveName = false;
        for (int i = 0; i < authors.size(); i++){
            if (authors.get(i) == authorName){
                haveName = true;
                authors.remove(i);
            }
        }
        if (!haveName){
            System.out.println("This author does not exist!");
            return;
        }
        System.out.println("Removed author successfully!");
    }
    /*public void PrintList(){
        System.out.print("ID" + this.ID + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getCost() + " ");
        for (int i = 0; i < authors.size(); i++){
            System.out.print(authors.get(i) + " ");
        }
    }*/
}
