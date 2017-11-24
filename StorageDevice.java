//shahad almuhizi
import java.io.*;
public class StorageDevice extends Product implements Serializable{
private String Model;
private String Capacity;
private int GuaranteeYears;

public StorageDevice (int code,String type,double p,String m,String cap,int years) throws OutOfRangeException{
super(code,type,p);
Model=m;
Capacity=cap;
if (years>=0&&years<3)
GuaranteeYears=years;
else 
throw new OutOfRangeException("the Guarantee Years should be between 0 and 2");
}

public StorageDevice (StorageDevice device){
super(device.getCode(),device.getType(),device.getPrice());
Model=device.Model;
Capacity=device.Capacity;
GuaranteeYears=device.GuaranteeYears;
}

public String getCapacity(){
return Capacity;}

public String getModel(){
return Model;}

public void display(){
super.display();
System.out.println(" Model: "+Model+" Capacity: "+Capacity+" Gurantee Years: "+GuaranteeYears);
}}