//Aș avea și eu o întrebare, în clasa Books.java am creat toString, dar subclasele Albums și Novels nu moștenesc asta, iar când apelez sout îmi apare doar proprietățile de la clasa Albums/Novels, nu am implem,entat eu ceva corect?
//        Și încă o întrebare am încercat să creez funcția ADDBook care ar trebui să conțină de la linia 16 la 50, dar nu am reusit
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int i = 1;

        ArrayList<Books> Boooks = new ArrayList<>();

        Scanner EveryNumberWeNeed = new Scanner(System.in);
        Scanner EveryThingsAboutBooks;

        String BooksName;
        int BooksPageNumber;
        while (i == 1) {

            System.out.println("Please insert the name of the book");
            EveryThingsAboutBooks = new Scanner(System.in);
            BooksName = EveryThingsAboutBooks.nextLine();

            System.out.println("Please insert the number of the page");
            EveryNumberWeNeed = new Scanner(System.in);
            BooksPageNumber = EveryNumberWeNeed.nextInt();

            System.out.println("Please insert true if your books is Nouvels ");
            boolean chekTheTypeOfTheBook = EveryThingsAboutBooks.hasNextBoolean();

            if (chekTheTypeOfTheBook) {

                System.out.println("Please insert the type of Nouvels");
                Scanner EveryThingAboutNouvels = new Scanner(System.in);
                String NouvelsType = EveryThingAboutNouvels.nextLine();

                Novels books = new Novels(BooksPageNumber, BooksName, NouvelsType);
                Boooks.add(books);

            } else {
                System.out.println("Please insert the paper qualyti");
                Scanner EveryThingAboutAlbums = new Scanner(System.in);
                String PaperQuality = EveryThingAboutAlbums.nextLine();

                Albums books = new Albums(BooksPageNumber, BooksName, PaperQuality);
                Boooks.add(books);
            }

            System.out.println("IF you want to continue, please insert 1, else insert 0");
            EveryNumberWeNeed = new Scanner(System.in);
            i = EveryNumberWeNeed.nextInt();
        }
        do {

            System.out.println("Please chose what do you want to do add/delete/print");
            EveryThingsAboutBooks = new Scanner(System.in);
            String CheckOperation = EveryThingsAboutBooks.nextLine();

            switch (CheckOperation) {

                case ("add"):

                    i = 1;
                    while (i == 1) {

                        System.out.println("Please insert the name of the book");
                        EveryThingsAboutBooks = new Scanner(System.in);
                        BooksName = EveryThingsAboutBooks.nextLine();

                        System.out.println("Please insert the number of the page");
                        BooksPageNumber = EveryNumberWeNeed.nextInt();

                        System.out.println("Please insert true if your books is Nouvels ");
                        EveryThingsAboutBooks = new Scanner(System.in);
                        boolean chekTheTypeOfTheBook = EveryThingsAboutBooks.hasNextBoolean();

                        if (chekTheTypeOfTheBook) {

                            System.out.println("Please insert the type of Nouvels");
                            Scanner EveryThingAboutNouvels = new Scanner(System.in);
                            String NouvelsType = EveryThingAboutNouvels.nextLine();

                            Novels books = new Novels(BooksPageNumber, BooksName, NouvelsType);
                            Boooks.add(books);

                        } else {
                            System.out.println("Please insert the paper qualyti");
                            Scanner EveryThingAboutAlbums = new Scanner(System.in);
                            String PaperQuality = EveryThingAboutAlbums.nextLine();

                            Albums books = new Albums(BooksPageNumber, BooksName, PaperQuality);
                            Boooks.add(books);
                        }

                        System.out.println("IF you want to continue, please insert 1, else insert 0");
                        i = EveryNumberWeNeed.nextInt();
                    }

                    break;

                case ("delete"):

                    do {
                        System.out.println("Please insert the index of the element do you want to delete");
                        EveryNumberWeNeed = new Scanner(System.in);
                        int d = EveryNumberWeNeed.nextInt();

                        Boooks.remove(d);
                        System.out.println();
                        System.out.println("IF you want to continue, please insert 1, else insert 0");
                        EveryNumberWeNeed = new Scanner(System.in);
                        i = EveryNumberWeNeed.nextInt();

                    } while (i == 1);

                    break;

                case ("print"):

                    for (i = 0; i < Boooks.size(); i++) {
                        System.out.println(Boooks.get(i));
                        System.out.println("---------");
                    }
                    System.out.println(Boooks.size());
                    break;
            }
            System.out.println("IF you want to close the application, please insert 0, else insert 1");
            i = EveryNumberWeNeed.nextInt();
        } while (i == 1);

    }
}



