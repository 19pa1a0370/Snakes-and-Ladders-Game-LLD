import java.util.*;
class Driver
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of snakes:");
		int noOfSnakes=sc.nextInt();
		HashMap<Integer,Snake> s = new HashMap<Integer,Snake>();
		for(int i=0;i<noOfSnakes;i++)
		{
			int start=sc.nextInt();
			int end=sc.nextInt();
			Snake s1=new Snake(start,end);
			s.put(start,s1);
		}
		System.out.println("Enter no of Ladders");
		int noOfLadders=sc.nextInt();
		HashMap<Integer,Ladder> l=new HashMap<Integer,Ladder>();
		for(int i=0;i<noOfLadders;i++)
		{
			int start=sc.nextInt();
			int end=sc.nextInt();
			Ladder l1=new Ladder(start,end);
			l.put(start,l1);
		}
		System.out.println("Enter no of players:");
		int noOfPlayers=sc.nextInt();
		sc.nextLine();
		Queue<Player> p=new LinkedList<Player>();
		for(int k=1;k<=noOfPlayers;k++)
		{
			System.out.println("Enter player"+k+" name:");
			String PLAYER=sc.nextLine();
			Player n=new Player(PLAYER);
			p.add(n);
		}
		Board r= new RealBoard(s,l);
		Game g=new Game(p);
		g.gamePlay(r);

	}
}
