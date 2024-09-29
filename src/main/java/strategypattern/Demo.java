package strategypattern;

public class Demo {
    public static void main(String[] args) {


        TataCar tiago = new Tiago();
        tiago.display();

        TataCar altroz = new Altroz();
        altroz.display();

        TataCar nexon = new Nexon();
        nexon.display();

    }
}
