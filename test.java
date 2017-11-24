//shahad almuhizi
import java.util.*;
public class test {
static Scanner console=new Scanner (System.in);
public static void main(String[] args){
int code=0,years,player,choice=0,num,co,loc;
String type="",model,capacity,name;
double price=0.0;
Store s=new Store(4);
Product p;
boolean flag;
boolean add=false;
for (int i=0;i<4;i++){

flag=true;
while(flag){

try {
System.out.println("Enter the information of Product:");
System.out.println("Code:");
code=console.nextInt();
System.out.println("Type of the product: 1-ComputerGame 2-StorageDevice:");
type=console.next();
System.out.println("Price:");
price=console.nextDouble();
flag=false;}
catch (InputMismatchException e){
System.out.println("Invalid input");
console.next();}}

if (type.equals("2")){
type="StorageDevice";
System.out.println("Model:");
model=console.next();
System.out.println("Capacity:");
capacity=console.next();
capacity=capacity.toUpperCase();

flag=true;
while (flag){
try {

System.out.println("Guarantee Years:");
years=console.nextInt();

p=new StorageDevice(code,type,price,model,capacity,years);
flag=false;
add=s.addProduct(p);}
catch (InputMismatchException e){
System.out.println("Invalid input");
console.next();}
catch (OutOfRangeException e){
System.out.println(e.getMessage());}
}
if (add)
System.out.println("The product has been added");
else
System.out.println("The product has not been added");
}

/*if ((!type.equals("1")) && (!type.equals("2"))){
System.out.println("Invalid input");
i--;}
*/
else if (type.equals("1")){
type="ComputerGame";
flag=true;

System.out.println("Name:");
name=console.next();
while (flag){
try {
System.out.println("Player Number:");
player=console.nextInt();
p=new ComputerGame(code,type,price,name,player);
add=s.addProduct(p);
flag=false;
}
catch (InputMismatchException e){
System.out.println("Invalid input");
console.next();}

catch (OutOfRangeException e){
System.out.println(e.getMessage());}
}
if (add)
System.out.println("The product has been added");
else
System.out.println("The product has not been added");
}
else 
System.out.println("invalid input");}

do {
flag=true;

while (flag){
try{
System.out.println("********************");
System.out.println("Select");
System.out.println("1: Get storages devices that have specified capacity");
System.out.println("2: the number of Computer Games having specified number of players");
System.out.println("3: Get the class name of the product");
System.out.println("4: remove a Product");
System.out.println("5: display information of all products");
System.out.println("6: exit");
choice=console.nextInt();
flag=false;}
catch (Exception e){
System.out.println("Invalid input");
console.next();}}


switch (choice){
case 1:
flag=true;
try {
System.out.println("Enter the capacity");
String cap=console.next();
StorageDevice[] list=s.getStoragesWithCapacity(cap);
if (list.length>0){
for (int i=0;i<list.length;i++)
list[i].display();}
else
System.out.println("there is no device");
flag=false;}
catch (Exception e){
System.out.println("invalid input");
}
break;

case 2:
try{
System.out.println("Enter the number of players");
num=console.nextInt();
int computerG=s.SearchNumOfPlayers(num);
if (computerG!=0)
System.out.println("the number of games is: "+computerG);
else
System.out.println("there is no computer game");}
catch (OutOfRangeException e){
System.out.println(e.getMessage());}
catch (InputMismatchException e){
System.out.println("Invalid input");
console.next();}
catch (Exception e){
System.out.println("Invalid input");}
break;

case 3:
flag=true;
while (flag){
try{
System.out.println("Enter the product code");
co=console.nextInt();
String clas=s.GetProductClass(co);
if (clas!=null)
System.out.println(clas);
else
System.out.println("there is not product");
flag=false;}
catch (InputMismatchException e){
System.out.println("Invalid input");
console.next();}}
break;

case 4:
flag=true;
while (flag){
try{
System.out.println("Enter the product location");
loc=console.nextInt();
s.removeProduct(loc);
flag=false;}
catch (InputMismatchException e){
System.out.println("Invalid input");
console.next();}}
break;

case 5:
Product[] pro=s.getarrProducts();
for (int i=0;i<pro.length;i++)
pro[i].display();

break;

}


if (choice>6)
System.out.println("The input you entered is incorrect");

}while (choice!=6);
}}







