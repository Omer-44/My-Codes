package recapDemo2;

public class CampManager {
public void make(Camp camp) {
	System.out.println("kampýn "+camp.courseSchedule+". günü");
	System.out.println("kampýn "+camp.record+" kaydý izlendi");
	System.out.println("kampýn "+camp.homework+" ödevi yapýldý");
}
public void evaluate(Camp camp) {
	if(camp.evaluation != null) {
		
System.out.println(camp.evaluation+" deðerlendirmesi yapýlmýþtýr");
	}else {
	System.out.println("deðerlendirme yapýlmamýþtýr");
}

}
}
