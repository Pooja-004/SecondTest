import java.util.ArrayList;
import java.util.Date;

public class Employee {
	private final int eno;
	private final String ename;
	private final Date doj;
	private final ArrayList<String> mobile;
	private final Address addr;
	public Employee(int eno,String ename,Date doj,ArrayList<String> mobile,Address addr) {
		this.eno=eno;
		this.ename=ename;
		this.doj=doj;
		this.mobile=mobile;
		this.addr=addr;
	}
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public Date getDoj() {
		return (Date) doj.clone();
	}
	public ArrayList<String> getMobile() {
		return new ArrayList<String>(mobile);
	}
	public Address getAddr() {
		return new Address(addr.getZip(),addr.getCity());
	}
	public String toString() {
		return eno+" "+ename+" "+doj+" "+mobile+"--"+addr;
	}

}
