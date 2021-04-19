package hust.soict.globalict.aims.utils;
public class DateUtils {
	public static int compare(MyDate date1, MyDate date2) { 
		int date1Day = Integer.parseInt(date1.getDay());
		monthConversion(date1);
		int date1Month = Integer.parseInt(date1.getMonth());
		int date1Year = Integer.parseInt(date1.getYear()); 
		int date2Day = Integer.parseInt(date2.getDay());
		monthConversion(date2);
		int date2Month = Integer.parseInt(date2.getMonth());
		int date2Year = Integer.parseInt(date2.getYear());
		if (date1Year < date2Year) return -1;
		else if (date1Year > date2Year) return 1;
		else
		{
			if (date1Month < date2Month) return -1;
			else if (date1Month > date2Month) return 1;
			else {
				if (date1Day < date2Day) return -1;
				else if (date1Day > date2Day) return 1;
				else return 0;
			}
		}
	}
	public static void monthConversion(MyDate date) {
		String month = date.getMonth();
		if (month.toLowerCase() == "january" || month.toLowerCase() == "jan") date.setMonth("1");
		if (month.toLowerCase() == "february" || month.toLowerCase() == "feb") date.setMonth("2");
		if (month.toLowerCase() == "march" || month.toLowerCase() == "mar") date.setMonth("3");
		if (month.toLowerCase() == "april" || month.toLowerCase() == "apr") date.setMonth("4");
		if (month.toLowerCase() == "may") date.setMonth("5");
		if (month.toLowerCase() == "june" || month.toLowerCase() == "jun") date.setMonth("6");
		if (month.toLowerCase() == "july" || month.toLowerCase() == "jul") date.setMonth("7");
		if (month.toLowerCase() == "august" || month.toLowerCase() == "aug") date.setMonth("8");
		if (month.toLowerCase() == "september" || month.toLowerCase() == "sep") date.setMonth("9");
		if (month.toLowerCase() == "october" || month.toLowerCase() == "oct") date.setMonth("10");
		if (month.toLowerCase() == "november" || month.toLowerCase() == "nov") date.setMonth("11");
		if (month.toLowerCase() == "december" || month.toLowerCase() == "dec") date.setMonth("12");
	}
	public static void sortDate(MyDate[] datearray) {
		MyDate temp;
		for (int i=0; i< datearray.length; i++) {
			for (int j=1; j< datearray.length - i; j++) {
				if (compare(datearray[j], datearray[j-1]) == -1) {
					temp = datearray[j-1];
					datearray[j-1] = datearray[j];
					datearray[j] = temp;
				}
			}
		}
	}
}
