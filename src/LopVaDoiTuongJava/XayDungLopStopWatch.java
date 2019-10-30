package LopVaDoiTuongJava;

import java.util.Date;

public class XayDungLopStopWatch {
    public static void main(String[] args) {
        Date date = new Date();
        Time time = new Time(date, date);
        System.out.println(time.startTime);
    }

    public static class Time {
        private int startTime;
        private int endTime;

        public Time(Date startTime, Date endTime) {
        }

        public String getStartTime() {
            return String.valueOf(this.startTime);

        }

        public String getEndTime() {
            return String.valueOf(this.endTime);
        }

        public String Start() {
            return String.valueOf(this.startTime);
        }

        public String End() {
            return String.valueOf(this.endTime);
        }

        public String getElapsedTime() {
            return String.valueOf(this.endTime-this.startTime);
        }
    }
}
