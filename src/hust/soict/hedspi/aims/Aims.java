package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.myDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aims {
    public static void showMenu(){
        System.out.println("Order Management Application: ");
        System.out.println("------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");

    }
    public static void main(String[] args) {
        boolean valid = false; // kiểm tra đã tạo order hay chưa
        boolean exit = false; // exit menu
        Order anOrder = null;
        Scanner sc = new Scanner(System.in);
        
        Scanner userChoice = new Scanner(System.in);
        do {
            showMenu();
            switch (userChoice.nextInt()) {
                case 1:
                    anOrder = new Order();
                    valid = true;
                    System.out.println("Create an order successfully");
                    break;
                case 2:
                    if(valid == true) {
                        System.out.print("You want to add Book/Disc/CD?: ");
                        String temp = sc.nextLine();
                        if (temp.equals("Disc")) {
                            System.out.print("Title: ");
                            String title = sc.nextLine();
                            System.out.print("Category: ");
                            String category = sc.nextLine();
                            System.out.print("Director: ");
                            String director = sc.nextLine();
                            System.out.print("Length: ");
                            int length = sc.nextInt();
                            System.out.print("Cost: ");
                            float cost = sc.nextFloat();
                            Media media = new DigitalVideoDisc(title, category, cost, length, director);
                            anOrder.addMedia(media);
                            DigitalVideoDisc disc_temp = (DigitalVideoDisc)media;
                            sc.nextLine();
                            System.out.print("Play DVD? (Y/N) ");
                            String play_choice = sc.nextLine();
                            if (play_choice.equals("Y")){
                                disc_temp.play();
                            }
                            else {
                                System.out.println("You have added DVD successfully!");
                            }
                        } else if (temp.equals("Book")) {
                            System.out.print("Title: ");
                            String title = sc.nextLine();
                            System.out.print("Category: ");
                            String category = sc.nextLine();
                            System.out.print("Cost: ");
                            float cost = sc.nextFloat();
                            System.out.print("Number of Author: ");
                            Book book = new Book(title, category, cost);
                            int numberOfAuthor = sc.nextInt();
                            sc.nextLine();

                            for (int i = 0; i < numberOfAuthor; i++) {
                                System.out.print("Author " + (i + 1) + ": ");
                                String name = sc.nextLine();
                                book.addAuthor(name);
                            }
                            anOrder.addMedia(book);

                            System.out.println("Add Book successfully!");
                        }
                        else if (temp.equals("CD")){
                            System.out.print("Title: ");
                            String title = sc.nextLine();
                            System.out.print("Category: ");
                            String category = sc.nextLine();
                            System.out.print("Director: ");
                            String director = sc.nextLine();
                            System.out.print("Cost: ");
                            float cost = sc.nextFloat();
                            System.out.print("Length: ");
                            int length = sc.nextInt();
                            CompactDisc cd = new CompactDisc(title,category,cost,length,director);
                            System.out.print("Number of tracks?");
                            int number = sc.nextInt();
                            sc.nextLine();
                            for (int i = 0; i < number; i++){
                                System.out.print("Track " + (i + 1) + ": ");
                                System.out.print("Title: ");
                                sc = new Scanner(System.in);
                                String t = sc.nextLine();
                                System.out.print("Length: ");
                                sc = new Scanner(System.in);
                                int l = sc.nextInt();
                                Track t_temp = new Track(t, l);
                                cd.addTrack(t_temp);
                            }
                            sc.nextLine();
                            System.out.print("Play CD? (Y/N) ");
                            String play_choice = sc.nextLine();
                            if (play_choice.equals("Y")){
                                cd.play();
                            }
                            else {
                                System.out.println("You have added CD successfully!");
                            }
                        }
                        else {
                            System.out.println("Invalid choice");
                        }
                    }
                    else{
                        System.out.println("You haven't created order!");
                    }
                    break;
                case 3:
                    if (valid == true) {
                        System.out.print("Insert ID: ");
                        int ID = sc.nextInt();
                        Media mediaTemp = anOrder.returnID(ID);
                        if (mediaTemp == null) {
                            //sc.nextLine();
                            System.out.println("Sorry, invalid ID");
                        } else {
                            anOrder.removeMedia(mediaTemp);
                            //sc.nextLine();
                            System.out.println("Removed successfully");
                        }
                    }
                    else{
                        System.out.println("You haven't created order!");
                    }
                    break;
                case 4:
                    if (valid == true){
                        anOrder.printList();
                    }
                    else{
                        System.out.println("You haven't created order!");
                    }
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exit the program...");
                    break;
                default:
                    System.out.println("Please choose a number: 0-1-2-3-4");
                    break;
            }
        } while (exit == false);
        /*DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion king");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Aller");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setLength(124);
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setLength(90);
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        anOrder.addDigitalVideoDisc(dvd3);

        anOrder.printList();*/
    }
}
