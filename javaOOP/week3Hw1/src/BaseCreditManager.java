public abstract class BaseCreditManager implements CreditManager {

    public abstract void Calculate(); // Abstract(Gövdesiz method).

    public  void Save() {
        System.out.println("Kaydedildi.");
    }

}
