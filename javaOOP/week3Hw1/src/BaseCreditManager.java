public abstract class BaseCreditManager implements CreditManager {

    public abstract void calculate(); // Abstract(Gövdesiz method).

    public  void save() {
        System.out.println("Kaydedildi.");
    }

}
