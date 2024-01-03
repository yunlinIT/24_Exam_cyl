import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<WiseSaying> wiseSayings = new ArrayList<>();
		WiseSaying wiseSaying = null;
		
		int lastArticleId = 0;
		
		String content;
		String author;
		String regDate = null;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("== 명언앱 실행 ==");
		int id = lastArticleId + 1;
		
		while(true) {
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine();

			switch (cmd) {
			case "등록":
				System.out.print("명언 : ");
				content = sc.nextLine();
				System.out.print("작가 : ");
				author = sc.nextLine();
	
				wiseSaying = new WiseSaying(id, regDate, content, author);
				wiseSayings.add(wiseSaying);
				
				System.out.printf("%d번 명언이 등록되었습니다.\n", id);
				id++;
				break;
			case "목록":
				System.out.println("번호  /  작가  /  명언");
				System.out.println("======================");
				
				for (int i = wiseSayings.size() - 1; i >= 0; i--) {
					System.out.printf("%d  /  %s  /  %s\n", wiseSaying.getId(), wiseSaying.getAuthor(), wiseSaying.getContent());
				}
				
				// 가장 최근에 등록된 명언만 반복 출력되는 문제를 해결하지 못하여 더 나아가지 못함. 
				// 반복분 또는, 객체에 조립하는 과정에서 문제가 생긴 듯 함.

				break;
			case "상세보기":

				break;
			case "수정":

				break;
			case "삭제":

				break;
			default :
				
			}


			
		}
		


		

	}
}
