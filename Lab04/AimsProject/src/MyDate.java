public class MyDate {
	MyDate(String day, String month, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	MyDate(int dayint, int monthint, int yearint) {
		super();
	}
	private String day;
	private String month;
	private String year;
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public MyDate dateprocess(MyDate date) {
		MyDate processedDate = new MyDate("0", "0", "0");
		String month = date.getMonth();
		month = month.substring(0, 1).toUpperCase() + month.substring(1);
		processedDate.setMonth(month);
		String day = date.getDay();
		if (day == "1" || day == "11" || day == "21" || day == "31") day = day + "st";
		else if (day == "2" || day == "12" || day == "22") day = day + "nd";
		else if (day == "3" || day == "13" || day == "23") day = day + "rd";
		else day = day + "th";
		processedDate.setDay(day);
		processedDate.setYear(date.getYear());
		return processedDate;
	}
	public void print(MyDate date) {
		MyDate processedDate = dateprocess(date);
		System.out.println(processedDate.getMonth() + " " + processedDate.getDay() + " " + processedDate.getYear());
	}
	public void alternativePrint(MyDate date) {
		System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
	}
}

