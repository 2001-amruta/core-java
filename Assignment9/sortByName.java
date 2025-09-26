import java.util.Comparator;

public class sortByName implements Comparator<Program> {

	@Override
	public int compare(Program x, Program y) {
		int diff=x.getName().compareTo(y.getName());
		return diff;
	}

}
