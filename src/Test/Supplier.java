package Test;




//this class is made to use it in programs
//supplier has a name ,
// a product          ,
// and vidange        ,
// Vidange is counted the following way
// ----->  Vidange =V_price-price



 abstract class Supplier  {
     public String name;
     public String Product;
     public String Vidange;



     public Supplier(String name, String product, String vidange) {
         this.name = name;
         Product = product;
         Vidange = vidange; }

     @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", Product='" + Product + '\'' +
                ", Vidange='" + Vidange + '\'' ;
    }
}


