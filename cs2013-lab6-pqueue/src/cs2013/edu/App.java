package cs2013.edu;

import java.util.PriorityQueue;

public class App
{
	public static void main(String[] args)
	{
		PriorityQueue<Point> pq = new PriorityQueue<Point>( new PCompare() );
		
		pq.add(new Point(2,1) );
		pq.add(new Point(1,1) );
		pq.add(new Point(1,2) );
		
		while( !pq.isEmpty())
		{
			System.out.println(pq.remove());
		}
	}
}