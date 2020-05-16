
package applicantion;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Roberto
 */
public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        
        for (int i = 1 ; i <= n ; i++){
            System.out.println("Tax payer #" + i + " data");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            
            switch(ch){
                case 'i':
                    System.out.print("Health expenditures: ");
                    Double healthExp = sc.nextDouble();
                    list.add(new IndividualPayer(name,anualIncome,healthExp));
                    break;
                 
                case 'c':
                    System.out.print("Number of employees: ");
                    Integer numEmp = sc.nextInt();
                    list.add(new CompanyPayer(name,anualIncome,numEmp));
                    break;
            }
        }
        
        System.out.println("\nTAXES PAID: ");
        Double sum = 0.0;
        for(TaxPayer c : list){
            System.out.print(c.getName() + ": $ " + String.format("%.2f\n",c.taxesPaid()));
            sum +=c.taxesPaid();
        }
            
        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
                   
        sc.close();
    }
    
}
