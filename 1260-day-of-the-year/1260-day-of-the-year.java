class Solution {
    public int dayOfYear(String date) {
        String arr[] = date.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);
        int totalDays = 0;
        for(int i=1; i<month; i++)
        {
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)   
                totalDays += 31;
            else if(i==2)
                totalDays += (leapYear(year)?29: 28);
            else 
                totalDays += 30;
        }
        totalDays += day;
        return totalDays;
    }
    public static boolean leapYear(int year)
    {
        if(year%400==0 || (year%4==0 && year%100!=0))
            return true;
        return false;
    }
}