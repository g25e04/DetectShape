package summer012;

public class Detect {

	private int number;
	
	public Detect() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Detect(int number) {
		setNumber(number);
	}

	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public String check() {
		if(getNumber()<1)
			return "請輸入大於1的整數\n";
		else
			return "";
	}
	
	
}
