//shahad almuhizi
import java.util.*;
public class Store{
static Scanner console=new Scanner (System.in);
private int numOfProduct;
private Product[] arrProducts;

public Store(int num){
numOfProduct=0;
arrProducts=new Product[num];}

public StorageDevice[] getStoragesWithCapacity(String capacity)throws ClassNotFoundException {
capacity=capacity.toUpperCase();
StorageDevice[] list;
int size=0;
int i;
for (i=0;i<numOfProduct;i++){
if ((arrProducts[i] instanceof StorageDevice) &&((StorageDevice)arrProducts[i]).getCapacity().equals(capacity))
size++;}

list=new StorageDevice[size];
size=0;
for (i=0;i<numOfProduct;i++)
if ((arrProducts[i] instanceof StorageDevice) &&((StorageDevice)arrProducts[i]).getCapacity().equals(capacity))
list[size++]=(StorageDevice)arrProducts[i];
return list;}

public int SearchNumOfPlayers(int num)throws ClassNotFoundException, OutOfRangeException{
int count=0;
if (num>0&&num<7){

for (int i=0;i<numOfProduct;i++)
if ((arrProducts[i] instanceof ComputerGame) && ((ComputerGame)arrProducts[i]).getNumOfPlayers()==num)
count++;
}
else 
throw new OutOfRangeException("Player Number should be between 1 and 6");
return count;}

public String GetProductClass(int code){
for (int i=0;i<numOfProduct;i++)
if (arrProducts[i].getCode()==code)
return arrProducts[i].getClass().getName();
return null;}



public void display(){
for (int i=0;0<numOfProduct;i++)
arrProducts[i].display();}

public boolean addProduct(Product pro){
if (numOfProduct<arrProducts.length){
arrProducts[numOfProduct++]=pro;
return true;}
return false;
}

public void removeProduct(int location){
boolean repeat=true;
while (repeat){
try {
if (arrProducts[location]!=null){
arrProducts[location]=null;
for (int i=location;i<numOfProduct-1;i++)
arrProducts[i]=arrProducts[i+1];
arrProducts[--numOfProduct]=null;
System.out.println("the product has been removed");}
else
System.out.println("the product has not been removed");
repeat=false;}
catch (ArrayIndexOutOfBoundsException e){
System.out.println("Enter a new location:");
location=console.nextInt();}}
}

public Product[] getarrProducts(){
return arrProducts;}

}
