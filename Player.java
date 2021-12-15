import java.util.*;
import java.util.ArrayList;
public class Player
{
	private String name;
	private int pos=0;
	private ArrayList<Integer> positions=new ArrayList<Integer>(Arrays.asList(0));
	public Player(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int getPos()
	{
		return pos;
	}
	public void setPositions(int newPos)
	{
		positions.add(newPos);
	}
	public ArrayList getPositions()
	{
		return positions;
	}
	public void setLocation(int n){
		pos=n;
	}
}
