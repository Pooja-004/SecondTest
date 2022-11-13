import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee(111,"Ramakant",new Date(),(ArrayList<String>) Arrays.stream(new String[] {"123","3456"})
				.collect(Collectors.toList()),new Address(845401,"Motihari"));
		//emp.getDoj().setDate(7);
		//emp.getMobile().add("000");
		//emp.getAddr().setCity("betia");
		System.out.println(emp);

	}

}
