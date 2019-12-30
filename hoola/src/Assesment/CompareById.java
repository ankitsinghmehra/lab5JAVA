package Assesment;
import java.util.Comparator;

public class CompareById implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1==null || o2==null)
			return 0;
		else
		return o1.getId()-o2.getId();
	}

	
	}
