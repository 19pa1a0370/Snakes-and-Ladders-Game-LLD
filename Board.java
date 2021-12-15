import java.util.*;
interface Board
{
	public int getMaxSize();
	public HashMap<Integer,Snake> getSnakes();
	public HashMap<Integer,Ladder> getLadders();
}
class RealBoard implements Board
{
	private int maxSize=100;
	private HashMap<Integer,Snake> snakes=new HashMap<Integer,Snake>();
	private HashMap<Integer,Ladder> ladders=new HashMap<Integer,Ladder>();
	public RealBoard(HashMap<Integer,Snake> snakes,HashMap<Integer,Ladder> ladders)
	{
		this.snakes=snakes;
		this.ladders=ladders;
	}
	public int getMaxSize()
	{
		return maxSize;
	}
	public HashMap<Integer,Snake> getSnakes()
	{
		return snakes;
	}
	public HashMap<Integer,Ladder> getLadders()
	{
		return ladders;
	}
}