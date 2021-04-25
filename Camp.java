package recapDemo2;

public class Camp {
	public Camp(int courseSchedule, String record,String homework,String evaluation) {
		this.courseSchedule=courseSchedule;
		this.record=record;
		this.homework=homework;
		this.evaluation=evaluation;
	}
	public Camp(int courseSchedule, String record,String homework) {
		this.courseSchedule=courseSchedule;
		this.record=record;
		this.homework=homework;
		
	}
	int courseSchedule;
	String record;
    String homework;
    String evaluation;
}
