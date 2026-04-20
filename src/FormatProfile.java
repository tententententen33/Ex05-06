
public class FormatProfile {
	public static void main(String[] args) {
		String name = "田中";
		int age = 20;
		String city = "松山";
		
		String message = String.format(
				"名前:%s 年齢:%d歳 住所:%s",name, age, city);
		
		System.out.println(message);
	}
}
