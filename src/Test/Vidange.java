package Test;




public class Vidange extends Product {
    public Vidange(String name, String product, String vidange, String label, double price, double v_price, double quantity, double cases, double barrels, double packs) {
        super(name, product, vidange, label, price, v_price, quantity, cases, barrels, packs);

        v_price=new Product(::getV_price);


    }


}