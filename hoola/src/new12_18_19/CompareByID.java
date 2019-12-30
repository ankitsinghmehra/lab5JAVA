package new12_18_19;
import java.util.Comparator;

import lab1.Empl;
public class CompareByID implements Comparator<Empl> {

	@Override
	public int compare(Empl o1, Empl o2) {
		
		return o1.getEmpid()-o2.getEmpid();
	}
}
