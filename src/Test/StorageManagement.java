package Test;



//    This program is made to know real-time vidange at stock


   public class StorageManagement {

       private String Supplier;
       private double Vidange;

       public StorageManagement(String supplier, double vidange) {
           this.Supplier = supplier;
           Vidange = vidange; }

       public String getSupplier() { return Supplier; }

       public void setSupplier(String supplier) { Supplier = supplier; }

       public double getVidange() { return Vidange; }

       public void setVidange(double vidange) { Vidange = vidange; }


       @Override
       public String toString() {
           return "StorageManagement{" + "Supplier='" + Supplier + '\'' + ", Vidange=" + Vidange + '}'; }
   }

