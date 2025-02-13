package BaiTap1;

public class BaiTap1_8 {
	private int hour;
	private int minute;
	private int second;

	public BaiTap1_8(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		return "BaiTap1_8 [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

	public BaiTap1_8 nextSecond() {
		second++;
		if (second >= 60) {
			second = 0;
			minute++;
			if (minute >= 60) {
				hour++;
				minute = 0;
				if (hour >= 24) {
					hour = 0;
				}
			}
		}
		return this;
	}
	public BaiTap1_8 priviousSecond() {
		second--;
		if (second <0) {
			second = 59;
			minute--;
			if (minute <0) {
				hour--;
				minute = 59;
				if (hour <0) {
					hour = 23;
				}
			}
		}
		return this;
	}
}
