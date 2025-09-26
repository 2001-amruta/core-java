import java.util.Comparator;

public class sortByMarks implements Comparator<Program>{

	@Override
	public int compare(Program x, Program y) 
	{
		int diff=(int) (x.getMarks()-y.getMarks());
		return diff;
	}

}
