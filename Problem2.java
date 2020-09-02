
public class Problem2 implements Comparable {
	
	int month;
	int day;
	int year;
	
	Problem2(int m, int d, int y){
		this.month = m;
		this.day = d;
		this.year = y;
		
	}
	
	public int compareTo(Object arg0) {
		Problem2 other = (Problem2) arg0;
		if(this.year > other.year) {
			return 1;	
		}else if (this.year < other.year) {
			return -1;
			
		}else {
			if(this.month > other.month) {
				return 1;
				
			}else if(this.month < other.month) {
				return -1;
			}else {
				if(this.day > other.day) {
					return 1;
				}else if(this.day < other.day) {
					return -1;
				}else {
					return 0;
				}
			}
		}
	}

	public String toString() {
		return "" + this.month + "/" + this.day + "/" + this.year; 
	}
}
