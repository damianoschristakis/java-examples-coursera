package Test;

import com.sun.xml.internal.ws.api.pipe.Engine;

abstract class TestCar {
    public static void main(String[] args){
       Car NoobCar = new Car( " Electric and Front + rear motor combined output up to 779 bhp (581 kW), 1,250 N⋅m (920 lb⋅ft) , 3-phase AC induction motor", "Model S  ", "Winter Type","Tesla" );

       Car AstonMartin = new Car ( " was initially launched equipped with a 5.9-litre V12 engine. This generates 570 N⋅m (420 lb⋅ft) of torque at 5,000 rpm and a maximum power of 456 PS (335 kW; 450 hp) at 6,000 rpm",
               "DB-9" ,
               "" ,
               "Aston Martin");

                System.out.println( AstonMartin.getManufacturer()+" "+AstonMartin.getModel()+" "+AstonMartin.getEngine());
                System.out.println("Manufactured by :"+NoobCar.getManufacturer()+", "+"Model : "+NoobCar.getModel()+", "+"Car engine is:"+NoobCar.getEngine());
    }

}
