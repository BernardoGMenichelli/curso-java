package application;

/**
 * Exercicio de interface em Java.
 * Autor: Bernardo
 * Data: Janeiro de 2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter the contract data:");
        System.out.print("Contract number: ");
        int contractNumber = sc.nextInt();
        System.out.print("Contract date: ");
        LocalDate contractDate = LocalDate.parse(sc.next(), dtf);
        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        System.out.println();
        System.out.print("Enter the number of installments: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);
        
        System.out.println();    
        System.out.println("Installments: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }
        
        sc.close();
    }
}
