package recapDemo2;

public class CampManager {
public void make(Camp camp) {
	System.out.println("kamp�n "+camp.courseSchedule+". g�n�");
	System.out.println("kamp�n "+camp.record+" kayd� izlendi");
	System.out.println("kamp�n "+camp.homework+" �devi yap�ld�");
}
public void evaluate(Camp camp) {
	if(camp.evaluation != null) {
		
System.out.println(camp.evaluation+" de�erlendirmesi yap�lm��t�r");
	}else {
	System.out.println("de�erlendirme yap�lmam��t�r");
}

}
}
