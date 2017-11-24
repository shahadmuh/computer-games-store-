import java.io.*;
public class Files {
public static void main (String[]args){
try {
File f=new File ("MyStore.obj");
FileInputStream FIS=new FileInputStream(f);
ObjectInputStream OIS=new ObjectInputStream(FIS);

int numS=OIS.readInt();
int numC=OIS.readInt();
int count=0;

Product[] p=new Product[numS+numC];
int i=0;
for (i=0;i<numS;i++){
p[i]=(StorageDevice)OIS.readObject();
count++;}
for (int j=i;i<numC;i++){

p[j]=(ComputerGame)OIS.readObject();
count++;}

File f1=new File("Result.txt");
FileOutputStream FS=new FileOutputStream(f1);
PrintWriter pw=new PrintWriter(FS);
pw.print("Code\t Type\t");
pw.println("Model or Name");
pw.println("-----------------------");
for (int o=0;o<count;o++){

pw.print(p[i].getCode()+"\t");
pw.print(p[i].getType()+"\t");


if (p[i] instanceof StorageDevice)
pw.println(((StorageDevice)p[i]).getModel());


if (p[i] instanceof ComputerGame)
pw.println(((ComputerGame)p[i]).getName());
}
double sum=0;
for (int q=0; q<count;q++){
sum+=p[q].getPrice();
pw.println("Total = "+sum);}
OIS.close();
pw.close();


File f2=new File("MyFiles");
PrintWriter pW=new PrintWriter(f2);

if (f.exists() && f.isDirectory()){
String [] list=f.list();

for (int w=0;w<list.length;w++){
File s=new File(list[i]);
if (s.isFile())
pW.println(list[w]);
}}
pW.close();


}catch (FileNotFoundException e){
System.out.println("File doesnt exist");}
catch (ClassNotFoundException e){
System.out.println("Class doesnt exist");}
catch (IOException e){
e.printStackTrace();}

}}
