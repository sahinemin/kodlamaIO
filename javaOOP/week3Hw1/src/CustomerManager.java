public class CustomerManager {

    private final Customer customer;
    private final CreditManager creditManager;

    public CustomerManager(Customer customer,CreditManager creditManager) {
        this.customer = customer;
        this.creditManager =creditManager;
    }

    public void save() {
        System.out.println("Müşteri kaydedildi: "+ customer.getId() );
    }
    public void delete() {
        System.out.println("Müşteri silindi: "+ customer.getId() );
    }

    public void giveCredit() {
        creditManager.calculate();
        System.out.println("Kredi verildi.");
    }
}