package interfaceatv;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = scanner.nextLine();

        System.out.println("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), fmt);
        System.out.println("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), fmt);

        RentalData rentalData = new RentalData(start, finish, new Vehicle(carModel));
        System.out.println(rentalData);

        System.out.println("Entre com o preço por hora: ");
        Double pricePerHour = Double.parseDouble(scanner.nextLine());
        System.out.println("Entre com o preço por dia: ");
        Double pricePerDay = Double.parseDouble(scanner.nextLine());

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(rentalData);

        System.out.println("FATURA: ");
        System.out.println("Pagamento inicial: " + rentalData.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + rentalData.getInvoice().getTax());
        System.out.println("Total a pagar: " + rentalData.getInvoice().totalPayment());

        scanner.close();
    }

}
