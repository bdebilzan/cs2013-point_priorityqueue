package cs2013.edu;

import java.util.Comparator; //interface -> must implement compare

public class PCompare implements Comparator<Point>
{
	public int compare(Point p2, Point p1)
	{
		if(p1.x < p2.x)
		{
			return 1;
		}
		else if(p1.x == p2.x)
		{
			if(p1.y < p2.y)
			{
				return 1;
			}
			if (p1.y == p2.y)
			{
				return 0;
			}
			else
			{
				return -1;
			}
		}
			return -1;
	}
}
