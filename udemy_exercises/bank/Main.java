package udemy_exercises.bank;

public class Main {

    public static void main(String[] args){





        Bank bank = new Bank("Legend Bank");

        bank.addBranch("Fort Worth");

        bank.addCustomer("Fort Worth", "Joe", 100.00);
        bank.addCustomer("Fort Worth", "Bill", 50.00);
        bank.addCustomer("Fort Worth", "Karen", 75.00);

        bank.addBranch("Hurst");
        bank.addCustomer("Hurst", "Jim", 50.00);

        bank.addCustomer("Fort Worth", "Jeramie", 100000.00);
        bank.addCustomer("Fort Worth", "Sam", 100.00);

        bank.listCustomers("Fort Worth", true);
        bank.listCustomers("Hurst", true);

        if(!bank.addCustomer("Dallas", "Brian", 65.00 )) {
            System.out.println("Error! Branch does not exist");
        }


    }
}

