//1. Write a generic static method to find minimum from an array of Number.
package sunbeam.com;

public class Program {
	
	public static<T extends Comparable>  T printMinimumArray(T[] arr)
	{
		T min = arr[0];
        for (T element : arr)
        {
            if (element.compareTo(min) < 0) 
            {
                min = element;
            }
        }
		return min;
	}

	public static void main(String[] args) {
		Integer[] arr= {11,22,33,44,55};
		Program. printMinimumArray(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Minimum value: " + printMinimumArray(arr));
	}

	

}
