public class 구구단8단을출력해주세요_1000부터1까지곱해주세요 {
	public static void main(String[] args) {
		// 문제 : 아래와 같이 출력해주세요.
		// 문제 : 단을 * 1000까지 출력해주세요.
		// 조건 : 곱하는 순서를 거꾸로 해주세요.
		int dan=8;
		for(int i=1000;i>=1;i--) {
         System.out.println(dan+"x"+i+"="+dan*i);
		}
	}

}
