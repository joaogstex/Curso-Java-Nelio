import java.util.Scanner;

public class App {

    static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("How many values?");
        Integer quantity = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < quantity; i++) {
            System.out.print("");
            Integer value = Integer.parseInt(scanner.nextLine());
            PrintService.addValue(value);
        }
        PrintService.print();
    }
}