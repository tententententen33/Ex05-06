
public class SplitToDisplayBad {
	public static void main(String[] args) {
		String data = "tanaka,taro,20,Tokyo";
		String[] parts = data.split(",");
		
		System.out.println("名前: " + parts[0] + " " + parts[1] + " 年齢: " + parts[2] + "歳 住所: " + parts[3]);
	}
}
