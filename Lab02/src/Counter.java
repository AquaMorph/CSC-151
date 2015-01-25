
public class Counter
{
	int count = 0;
	int stepAmount;
	
	public Counter(int step)
	{
		stepAmount = step;
	}
	
	public void increase()
	{
		count+=stepAmount;
	}
	
	public void decrease()
	{
		count-=stepAmount;
	}
	
	public int getCount()
	{
		return count;
	}
}
