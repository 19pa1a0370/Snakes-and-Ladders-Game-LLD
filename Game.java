import java.util.*;
class Game
{
	private Queue<Player> playerQ=new LinkedList<Player>();
	public Game(Queue<Player> playerQ)
	{
		this.playerQ=playerQ;
	}
	public void gamePlay(Board b)
	{
		Dice dice=new Dice();

		HashMap<Integer,Snake> snakes=b.getSnakes();
		HashMap<Integer,Ladder> ladders=b.getLadders();
		while(playerQ.size()>1)
		{
			Player x=playerQ.poll();
			int currPos=x.getPos();
			int move=dice.throwDice();
			while(move%6==0)
			{
				move += dice.throwDice();
				if(move==18)
				{
					move=0;
					break;
				}
			}
			if(currPos+move<=b.getMaxSize())
			{
				int newPos=currPos+move;
				if(snakes.containsKey(currPos+move))
				{
					Snake s= snakes.get(currPos+move);
					newPos=s.getEnd();
				}
				else if(ladders.containsKey(currPos+move))
				{
					Ladder l=ladders.get(currPos+move);
					newPos=l.getEnd();

				}
				else
				{
					newPos=currPos+move;
				}
				x.setLocation(newPos);
				x.setPositions(newPos);
			}
			if(currPos+move==b.getMaxSize())
			{
				System.out.println(x.getName()+" wins the game");
				System.out.println(x.getPositions());
			}
			else
			{
				playerQ.add(x);
			}
		}
	}
}
