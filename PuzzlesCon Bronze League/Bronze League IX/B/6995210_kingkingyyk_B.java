import java.util.Scanner;

class Main {
	
	public static void main (String [] abc) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int t=0;t<T;t++) {
			int day=sc.nextInt();
			int [] h=new int [sc.nextInt()];
			for (int i=0;i<h.length;i++) h[i]=sc.nextInt();

			int c=0;
			for (int i=1;i<=day;i++) {
				if (i%7!=0 && i%7!=6) {
					for (int i2=0;i2<h.length;i2++) {
						if (i%h[i2]==0) {
							c++;
							break;
						}
					}
				}
			}
							
			System.out.println(c);
		}
	}
	
}