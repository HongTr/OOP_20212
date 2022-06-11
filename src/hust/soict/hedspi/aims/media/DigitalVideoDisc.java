package hust.soict.hedspi.aims.media;



public class DigitalVideoDisc extends Disc implements Playable {


    public DigitalVideoDisc(String title, String category, float cost, int length, String director) {
        super(title, category, cost, length, director);
    }
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }


    //Overloading


    /*public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }*/
    /*public void PrintList(){
        System.out.println(". DVD" + this.ID + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getCost());
    }*/


    /*public boolean search(String title){
        boolean check = false;
        String[] tokens = title.split(" ");
        String[] disktitle = super.getTitle().split(" ");
        for(String token : tokens) {
            check = false;
            for (String temp : disktitle) {
                if (token.equals(temp) == true) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                return check; }
        }
        return check;
    }*/

}
