package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.myDate;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //private int qtyOrdered = 0;
    //rivate myDate dateOrdered;

    //private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    /*public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered <= MAX_NUMBERS_ORDERED){
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
        }
        else{
            System.out.println("The order is full!");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == 0){
            System.out.println("There is no dvd in an order list");
            return;
        }
        int i;
        for (i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i] == disc){
                break;
            }
        }

        if (i == qtyOrdered - 1){
            qtyOrdered--;
        }
        else{
            for (int j = i+1; j < qtyOrdered; j++){
                itemsOrdered[j - 1] = itemsOrdered[j];
            }
            qtyOrdered--;
        }
    }

    public float totalcost(){
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++){
            total += itemsOrdered[i].getCost();
        }
        return total;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        int number_add = dvdList.length;
        if (qtyOrdered + number_add > MAX_NUMBERS_ORDERED){
            System.out.println("Sorry, too many orders");
        }
        else{
            for (int i = 0; i < dvdList.length; i++){
                addDigitalVideoDisc(dvdList[i]);
            }
            System.out.println("Added successfully");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED){
            System.out.println("Sorry, too many orders");
            return;
        }
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
        System.out.println("Added successfully");
    }

    public static final int MAX_LIMITTED_ORDERS = 5;
    private static int nbOrders = 0;
    public Order(myDate dateOrdered){
        if(nbOrders > MAX_LIMITTED_ORDERS){
            System.out.println("Full!!Cannot hust.soict.hedspi.aims.order.Order any more...");

        }
        else{
            nbOrders++;
            System.out.println("hust.soict.hedspi.aims.order.Order successfully...");
            this.dateOrdered= dateOrdered;
        }
    }

    public void printList(){
        System.out.println("******************hust.soict.hedspi.aims.order.Order******************");
        System.out.println("Date: " + dateOrdered);
        System.out.println("Ordered Items: ");
        for (int i = 0; i < qtyOrdered; i++){
            System.out.println((i + 1) + " .DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - "
            + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " - " + itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: " + totalcost());
        System.out.println("*****************************************");
    }

    public DigitalVideoDisc getALuckyItem(){
        int i = (int) Math.random() * qtyOrdered;
        System.out.println("Congratulation! Your " + itemsOrdered[i].getTitle() + " will be free!");
        itemsOrdered[i].setCost(0f);
        return itemsOrdered[i];
    }*/
    public List<Media> itemsOrdered = new ArrayList <Media>();
    public void addMedia(Media media){
        itemsOrdered.add(media);
    }

    public void removeMedia(Media media){
        itemsOrdered.remove(media);
    }

    public float totalcost(){
        float total = 0;
        for (int i = 0; i < itemsOrdered.size(); i++){
            total += itemsOrdered.get(i).getCost();
        }
        return total;
    }

    public Media returnID(int ID){
        for (int i = 0; i < itemsOrdered.size(); i++){
            if (itemsOrdered.get(i).ID == ID){
                return itemsOrdered.get(i);
            }
        }
        return null;
    }
    public void printList(){
        System.out.println("******************Order******************");
        System.out.println("Ordered Items: ");
        for (int i = 0; i < itemsOrdered.size(); i++){
            System.out.print((i + 1) + ". ");
            itemsOrdered.get(i).PrintList();
            System.out.println();
        }
        System.out.println();
        System.out.println("Total cost: " + totalcost());
        System.out.println("*****************************************");
    }
}
