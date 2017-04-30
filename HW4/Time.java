// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.02 - L10

class Time {
  private int hour;
  private int minute;
  private int second;
  public Time () {
    Calendar cal = Calendar.getInstance();
    this.hour = cal.get(Calendar.HOUR_OF_DAY);
    this.minute = cal.get(Calendar.MINUTE);
    this.second = cal.get(Calendar.SECOND);
  }
  public Time(long elapseTime) {
    this.hour = (int)(((elapseTime / 1000) / 60) / 60) % 24;
    this.minute = (int)((elapseTime / 1000) / 60) % 60;
    this.second = (int)(elapseTime / 1000) % 60;
  }
  public Time(int hr, int mn, int sc) {
    this.hour = hr;
    this.minute = mn;
    this.second = sc;
  }
  public int getHour() {
    return hour;
  }
  public int getMinute() {
    return minute;
  }
  public int getSecond() {
    return second;
  }
  public void setTime(long elapseTime) {
    this.hour = (int)(((elapseTime / 1000) / 60) / 60) % 24;
    this.minute = (int)((elapseTime / 1000) / 60) % 60;
    this.second = (int)(elapseTime / 1000) % 60;
  }
}

/*public class TestTime {
  public static void main(String[] args) {
    Time time1 = new Time();
    Time time2 = new Time(555550000);
    System.out.println("Time1 is : " + time1.getHour() + "h" + time1.getMinute() + "mn" + time1.getSecond());
    System.out.println("Time2 is : " + time1.getHour() + "h" + time2.getMinute() + "mn" + time1.getSecond());
  }
}*/
