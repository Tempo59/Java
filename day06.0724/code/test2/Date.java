
public  class Date {
	private String year;
	private String month;
	private String day;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	private Date(String year,String month,String day) {
		this.year =year ;
		this.month=month ;
		this.day=day;
	}
	private static Date date=new Date("2017","1","1");
    public static Date getS() {
    	return date;
    }
	public static  void main(String[]args){
	System.out.println(Date.getS().year);}
  
}
   