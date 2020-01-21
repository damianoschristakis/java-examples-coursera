package Test;



//   The product has the following parameters :
//          -Label is the name of each drink category
//       -price  is the price we bought the product from the supplier
//      -V_price  is the price of how much money i earn /per product and all the  money i can get in my pocket.For example all cases and glass (with or without product in it) count as V_price
//          -quantity
//          -number of cases
//          -number of barrels
//          -number of packs


public class Product extends Supplier {


    private String label;
    private double price;
    private double V_price ;
    private double quantity;
    private double cases;
    private double barrels;
    private double packs;

    public Product(String name, String product, String vidange, String label, double price, double v_price, double quantity, double cases, double barrels, double packs) {
        super(name, product, vidange);
        this.label = label ;
        this.price = price;
        V_price = v_price;
        this.quantity = quantity;
        this.cases = cases;
        this.barrels = barrels;
        this.packs = packs; }


    public String getLabel() { return label; }

    public void setLabel(String label) { this.label = label; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public double getV_price() { return V_price; }

    public void setV_price(double v_price) { V_price = v_price; }

    public double getQuantity() { return quantity; }

    public void setQuantity(double quantity) { this.quantity = quantity; }

    public double getCases() { return cases; }

    public void setCases(double cases) { this.cases = cases; }

    public double getBarrels() { return barrels; }

    public void setBarrels(double barrels) { this.barrels = barrels; }

    public double getPacks() { return packs; }

    public void setPacks(double packs) { this.packs = packs; }





    @Override
    public String toString() {
        return "Product{" + "label='" + label + '\'' + ", quantity=" + quantity + ", cases=" + cases + ", barrels=" + barrels + ", packs=" + packs + ", price=" + price +  ", price=" + price +
                ", V_price=" + V_price
                ;
    }
}
