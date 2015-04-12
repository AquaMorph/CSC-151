public class SequentialGenerator implements NumberGenerator
{
	public long start, end, num;

	public SequentialGenerator(long start, long end)
	{
		this.start = start - 1;
		this.end = end;

	}

	@Override
	public long nextValue()
	{
		if (hasNext())
		{
			start++;
			return start;
		}
		else
			return 0;

	}

	@Override
	public boolean hasNext()
	{
		if(start+1>end)
			return false;
			else 
				return true;
	}
}
