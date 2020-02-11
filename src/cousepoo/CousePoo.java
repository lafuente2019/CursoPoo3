/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cousepoo;

import entiites.Account;
import java.util.Locale;
import java.util.Scanner;


public class CousePoo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Teste git");
        
        System.out.println("Entre com os dados da conta:");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();
        System.out.println("Holder: ");
        String holder = sc.nextLine();
        System.out.println("Balance: ");
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
