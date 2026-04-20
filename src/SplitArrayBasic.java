
public class SplitArrayBasic {
	public static void main(String[] args) {
		String[] data = "A,B,C".split(",");
		
		System.out.println("要素数:" + data.length);
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(i + 1 + "番目: " + data[i]);
		}
	}
}
