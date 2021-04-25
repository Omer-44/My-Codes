package recapDemo2;

public class Main {

	public static void main(String[] args) {
		Camp camp1 =new Camp(1,"1. gün","veri tipleri");
		Camp camp2 =new Camp(2,"2.gün","classlar","çok iyi bir kamp");
		CampManager campManager=new CampManager();
    Camp[] camps= {camp1,camp2};
    for(Camp kamp: camps) {
    	campManager.make(kamp);
    	campManager.evaluate(kamp);
    	
    }
	}

}
