
public class SplitToDisplayGood {
	public static void main(String[] args) {
		String data = " tanaka , taro , 20 , Tokyo";
		String[] parts = data.split(",");
		
		String familyName = parts[0].trim();
		String firstName = parts[1].trim();
		int age = Integer.parseInt(parts[2].trim());
		String city = parts[3].trim();
		
		String message = String.format(
				"名前:%s %s 年齢:%d歳 住所:%s",familyName, firstName, age, city);
		
		System.out.println(message);
	}
}
