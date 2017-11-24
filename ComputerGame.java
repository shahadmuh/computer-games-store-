//shahad almuhizi
import java.io.*;
public class ComputerGame extends Product implements Serializable{
private String Name;
private int NumOfPlayers;

public ComputerGame(int code,String type,double p,String name,int num) throws OutOfRangeException{
super(code,type,p);
Name=name;
if (num>0&&num<7)
NumOfPlayers=num;
else 
throw new OutOfRangeException("Player Number should be between 1 and 6");}

public ComputerGame(ComputerGame game){
super(game.getCode(),game.getType(),game.getPrice());
Name=game.Name;
NumOfPlayers=game.NumOfPlayers;

}
public String getName(){
return Name;}
public int getNumOfPlayers(){
return NumOfPlayers;}

public void display(){
super.display();
System.out.println(" Name: "+Name+" Player Number: "+NumOfPlayers);

}}