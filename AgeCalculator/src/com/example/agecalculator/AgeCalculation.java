package com.example.agecalculator;


import java.util.Calendar;
import java.util.Date;

public class AgeCalculation {
private int startYear;
private int startMonth;

private Calendar end;
public String getCurrentDate()
{
end=Calendar.getInstance();
endYear=end.get(Calendar.YEAR);
endMonth=end.get(Calendar.MONTH);
endMonth++;
endDay=end.get(Calendar.DAY_OF_MONTH);
return endDay+":"+endMonth+":"+endYear;
}
public void setDateOfBirth(int sYear, int sMonth, int sDay)


}
public void calcualteYear()
{
resYear=endYear-startYear;

}


}
else
{
resMonth=endMonth-startMonth;
resMonth=12+resMonth;
resYear--;
}

}
public void calcualteDay()
{

if(endDay>=startDay)
{
resDay= endDay-startDay;
}
else
{
resDay=endDay-startDay;
resDay=30+resDay;
if(resMonth==0)
{
resMonth=11;
resYear--;
}


}
}

public String getResult()
{
return resDay+":"+resMonth+":"+resYear;
}
public long getSeconde()
{
start=Calendar.getInstance();
start.set(Calendar.YEAR, startYear);
start.set(Calendar.MONTH, startMonth);
start.set(Calendar.DAY_OF_MONTH, startDay);
start.set(Calendar.HOUR, 12);
start.set(Calendar.MINUTE, 30);
start.set(Calendar.MILLISECOND, 30);
long now=end.getTimeInMillis();
long old=start.getTimeInMillis();
long diff=old-now;
return diff/1000;
}
}