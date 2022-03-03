import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {

		// pc리스트 선언
		List<Integer> pc = new ArrayList<>();

		// 보너스번호 만들기
		int bonus = (int) (Math.random() * 45) + 1;

		// 랜덤 클래스 이용
		Random ran = new Random();

		for (int i = 0; i < 6; i++) {

			int rand = ran.nextInt(0, 45) + 1;

			// 중복제거

			while (i < 6) {

				rand = ran.nextInt(45) + 1;

				if (pc.contains(rand)) {
					continue;
				}
				if (bonus == rand) {
					continue;
				}

				pc.add(rand);

				i++;

			}

		}

		// 오름차순 정렬
		Collections.sort(pc);
		System.out.println("로또번호:" + pc);
		System.out.println("보너스번호:" + bonus);

		System.out.println("==================================");

		// 사용자 로또 번호
		List<Integer> user = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			// 사용자 키보드 입력
			int put = 0;
			Scanner scan = new Scanner(System.in);
			put = scan.nextInt();
			user.add(put);

		}
		
		// 오름차순 정렬
		Collections.sort(user);
		System.out.println("내가 쓴 번호:" + user);

		System.out.println("=================================");

		// pc번호와 user번호 비교 (당첨번호)
		// 두 개의 List를 비교하여,서로 중복되는 값을 찾기 위해서 Collection 객체의 retainAll() 메소드를 사용

		pc.retainAll(user);
		System.out.println("당첨번호:" + pc);

		// 2등일떄 보너스번호 판별하기
		// 향상된 for문으로 2등일떄 보너스번호 추출
		
		boolean bonus01 = false;

		for (int isBonus : user) {

			if (!bonus01 && pc.size() == 5) {

				if (bonus == isBonus) {

					System.out.println("보너스:" + bonus);
					
					bonus01 = true;

					break;

				}

			}

		}
		

		System.out.println("===============================");

		// 등수출력
		// int size()를 이용하여 맞은갯수 길이로 등수출력
		if (pc.size() == 6) {
			System.out.println("1등 당첨입니다.");
		}
		if (pc.size() == 5 && bonus01) {
			System.out.println("2등 당첨입니다.");
		} else if (pc.size() == 5 && !bonus01) {
			System.out.println("3등 당첨입니다");
		} else if (pc.size() == 4) {
			System.out.println("4등 당첨입니다");
		} else if (pc.size() == 3) {
			System.out.println("5등 당첨입니다");
		} else if (pc.size() < 3) {
			System.out.println("꽝입니다.");
		}

		
	}

}
