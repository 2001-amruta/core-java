import java.util.Comparator;


public class sortByRollno implements Comparator<Program>{


	@Override
	public int compare(Program x, Program y) {
		return x.getRollno()-y.getRollno();
		
	}

}
