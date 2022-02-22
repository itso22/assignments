public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if문 써서 이등변삼각형 만들기
		
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<i+1 ; j++) {
				if(i<10-j) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			 System.out.println();
		}
		System.out.println("=========================================");
		System.out.println();
		//if 문 써서 역 이등변 삼각형 만들기
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10-i; j++) {
				if(i<j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		System.out.println("=========================================");
		//마름모 만들기
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<i+1 ; j++) {
				if(i<10-j) {
				System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			 System.out.println();
		}
			 for(int i=1; i<10; i++) {
					for(int j=0; j<10-i; j++) {
						if(i<j) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}System.out.println();
				}
	}

}
