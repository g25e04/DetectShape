package summer012;

import java.util.ArrayList;

public class Answer {

	ArrayList<Integer> allnumber = new ArrayList<>();
	
	private int time;
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}

	
	public void set(int a, int b, int c, int d) {
		allnumber.add(a);
		allnumber.add(b);
		allnumber.add(c);
		allnumber.add(d);
		
	}
	
	public int getTime() {
		return time;
	}
	
	
	public void setTime(int time) {
		this.time=time;

	}
	
	public boolean findMax(int a, int b, int c, int d) {
		if(a>b&&a>c&&a>d) {
			
			if(a>(b+c+d))
				return false;
			else
				return true;
		}
		
		else if(b>a&&b>c&&b>d) {
			
			if(b>(a+c+d))
				return false;
			else
				return true;
		}
		
		else if(c>b&&c>a&&c>d) {
			
			if(c>(b+a+d))
				return false;
			else
				return true;
		}
		
		else{
			
			if(d>(b+c+a))
				return false;
			else
				return true;
		}
			
	}
	
	public boolean rectangle(int a, int b, int c, int d) {
		if((a==b && c==d)||(a==c && b==d)||(a==d && b==c))
			return true;
		else
			return false;
	}
	
	public String toString() {
			if(allnumber.get(getTime())==allnumber.get(getTime()+1)&&allnumber.get(getTime())==allnumber.get(getTime()+2)&&allnumber.get(getTime())==allnumber.get(getTime()+3))
				return "正方形";
			else if(rectangle(allnumber.get(getTime()),allnumber.get(getTime()+1),allnumber.get(getTime()+2),allnumber.get(getTime()+3)))
				return "矩形";
			else if((findMax(allnumber.get(getTime()),allnumber.get(getTime()+1),allnumber.get(getTime()+2),allnumber.get(getTime()+3))))
				return "四邊形";
			else
				return "香蕉";
		
	}
}
