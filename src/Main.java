import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("O'tkan kunlar", "Abdulla Qodiriy"));
        library.addBook(new Book("Sariq devni minib", "Xudoyberdi To'xtaboyev"));
        library.addBook(new Book("Mehrobdan chayon", "Abdulla Qodiriy"));

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                System.out.println("\n=== Kichik kutubxona ===");
                System.out.println("1. Kitoblarni ko'rish\n2. Kitob olish\n3. Kitobni qaytarish\n0. Chiqish");
                System.out.print("Tanlov: ");
                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1" -> library.getBooks().forEach(System.out::println);
                    case "2" -> {
                        System.out.print("Kitob nomi: ");
                        Book book = library.findBook(scanner.nextLine().trim());
                        if (book == null) System.out.println("Bunday kitob topilmadi.");
                        else if (book.borrow()) System.out.println("Kitob olindi: " + book.getTitle());
                        else System.out.println("Bu kitob allaqachon olingan.");
                    }
                    case "3" -> {
                        System.out.print("Qaytariladigan kitob nomi: ");
                        Book book = library.findBook(scanner.nextLine().trim());
                        if (book == null) System.out.println("Bunday kitob topilmadi.");
                        else if (book.returnBook()) System.out.println("Kitob qaytarildi: " + book.getTitle());
                        else System.out.println("Bu kitob oldin olinmagan.");
                    }
                    case "0" -> running = false;
                    default -> System.out.println("Noto'g'ri tanlov. Qaytadan urinib ko'ring.");
                }
            }
        }
        System.out.println("Dastur yakunlandi.");
    }
}
