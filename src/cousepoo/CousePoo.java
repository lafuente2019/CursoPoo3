/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cousepoo;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import java.util.Locale;
import java.util.Scanner;


public class CousePoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Account acc = new Account (1001, "junior", 0.0);
        BusinessAccount bacc = new BusinessAccount(500.0, 1002,"Lafuente", 0.0);
        
        //UPCASTING
        
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(500.0,1003, "Valter", 0.0);
        Account acc3 = new SavingsAccount(500.00, 1004, "jose", 0.0);
        
        // DOWNCASTING
        
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.00);
        
        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
           BusinessAccount acc5 = (BusinessAccount) acc3;
           acc5.loan(200.0);
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
            
        }
        
        System.out.println("Entre com os dados da conta:");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Balance: ");
        Double balance = sc.nextDouble();
        
        Account account = new Account(number, holder, balance);
        System.out.println(account.toString());
        System.out.println("--------------------");
        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        account.withDraw(saque);
        System.out.println(account);
        System.out.println("---------------------");
        System.out.println("Digite o valor do deposito: ");
        double deposito = sc.nextDouble();
        account.deposit(deposito);
        System.out.println(account);
        
        Account acc6 = new Account(1001, "valter", 1000.0);
        acc6.withDraw(200.0);
        System.out.println(acc6.getBalance());
        
        Account acc7 =  new SavingsAccount(0.01, 1002, "juniorr", 1000.00);
        acc7.withDraw(200.00);
        System.out.println(acc7.getBalance());
        
        sc.close();
    }
    
}
