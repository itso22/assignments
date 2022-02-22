import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		// pc로또 배열을 선언한 뒤 랜덤함수를 이용헤서 데이터를 삽입

		int[] pc = new int[7];// 보너스 자리까지 남겨두기

		for (int i = 0; i < pc.length; i++) {
			pc[i] = (int) (Math.random() * 45) + 1;

			// 중복처리
			for (int j = 0; j < i; j++) {
				if (pc[i] == pc[j]) {
					i--;
					break;
				}
			}

		}

		// 6개의 당첨번호라 pc[0]~pc[5]

		for (int i = 0; i < pc.length - 1; i++) {
			System.out.println("당첨번호:" + pc[i]);
		}
		System.out.println("보너스번호:" + pc[6]);

		System.out.println("================================");

		// 사용자 로또배열 선언
		int[] user = new int[6];

		for (int i = 0; i < user.length; i++) {

			// 사용자 키보드 입력

			Scanner scan = new Scanner(System.in); 
			user[i] = scan.nextInt();
		}

		// 배열값 출력

		for (int i = 0; i < user.length; i++) {

			// System.out.println("내가 쓴 번호:"+user[i]);

		}

		System.out.println("내가 쓴 번호:" + Arrays.toString(user));

		System.out.println("====================================");

		// 맞은 번호 배열선언

		int[] corNum = new int[6];

		// pc와 user 숫자 비교
		int corCount = 0; // 맞은로또 개수
		boolean isBonus = false;

		for (int i = 0; i < corNum.length; i++) {
			for (int j = 0; j < corNum.length; j++) {

				if (user[i] == pc[j]) {

					corNum[corCount] = pc[j];
					corCount++;

					System.out.println("당첨번호:" + user[i]);
					break;
				}

				// 보너스 번호가 맞았을떄 보너스 번호까지 출력되게 하기

				// 아직 보너스 번호를 못찾았다면 비교
				if (!isBonus) {
					if (user[i] == pc[6]) {
						isBonus = true;
					}

				}
			}

			if (corCount == 5 && isBonus) {
				System.out.println("보너스번호:" + pc[6]);
			} else {
				// 보너스 번호가 없다면 그냥 출력
				System.out.println();
			}

		}
		System.out.println("===========================================");

		// corCount=맞은개수를 이용하여 if문으로 출력하기

		if (corCount == 6) {
			System.out.println("1등 당첨");
		}

		if (corCount == 5 && isBonus) {
			System.out.println("2등 당첨"); // 보너스자리의 배열값과 유저 값이 같을때
		} else if (corCount == 5 && !isBonus) {
			System.out.println("3등 당첨");
		} else if (corCount == 4) {
			System.out.println("4등 당첨");
		} else if (corCount == 3) {
			System.out.println("5등 당첨");
		} else if (corCount < 3) {
			System.out.println("꽝");
		}

	}
}
