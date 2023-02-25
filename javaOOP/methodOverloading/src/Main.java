public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem=new DortIslem();
        int sonuc= dortIslem.topla(2, 3);
        System.out.println(sonuc);
        int sonuc2=dortIslem.topla(2, 3, 6);
        System.out.println(sonuc2);
    }

}