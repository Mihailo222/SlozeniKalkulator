package zadatak2v3;

public class SlozeniKalkulator {
	void ispisi55Do1() {
		for(int i=55; i>=1;i--) {
			System.out.print(i+"   ");
		}
	}
	
	
	
	
	static  int faktorijel(int n) {
		int rez=1;
		for(int i=1; i<=n; i++) {
			rez=i*rez;
			
		}
		return rez;
	}
	
	
	
	
	static int ABN(int a, int b, int n) {//a+b na n
		
		int rez=1;
		int sabrani=a+b;
		
		for(int i=1; i<=n; i++) {
			rez=rez*sabrani;
		}
		return sabrani;
	}
	
	
	
}
