//shahad almuhizi
import java.io.*;
public class Product implements Serializable{
private int Code;
private String Type;
private double Price;

public Product(int c,String t, double p){
Code=c;
Type=t;
Price=p;}

public int getCode(){
return Code;}

public String getType(){
return Type;}

public double getPrice(){
return Price;}


public void display(){
System.out.print("Code: "+Code+" Type: "+Type+" Price: "+Price);
}}