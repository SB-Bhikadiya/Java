import java.util.Scanner;

public class pro_8 implements Runnable {
    private String title;
    private String author;
    private String publication;
    private double price;

    public pro_8(String title, String author, String publication, double price) {
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.price = price;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(title + " by " + author + " (" + publication + "): $" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        pro_8[] books = new pro_8[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter information for Book #" + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Publication: ");
            String publication = scanner.nextLine();
            System.out.print("Price: Rs.");
            double price = scanner.nextDouble();
            scanner.nextLine();

            books[i] = new pro_8(title, author, publication, price);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (books[i].price < books[j].price) {
                    pro_8 temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(books[i]);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
