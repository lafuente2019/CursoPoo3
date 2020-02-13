/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cousepoo;

import entities.Account;
import entities.BusinessAccount;
import java.util.Locale;
import java.util.Scanner;


public class CousePoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Account acc = new Account (1001, "junior", 0.0);
        BusinessAccount bacc = new BusinessAccount(500.0, 1002,"Lafuente", 0.0);
        
        //UPCASTING
        
        
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
        
        
        
        sc.close();
    }
    
}
