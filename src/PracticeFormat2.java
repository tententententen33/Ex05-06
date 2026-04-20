
public class PracticeFormat2 {
	public static void main(String[] args) {
		String data = " suzuki , ichiro , 20 , Tokyo";
		
		String[] parts = data.split(",");
		
		for (int i = 0; i < parts.length; i++) {
			parts[i] = parts[i].trim();
		}
		
		String familyName = parts[0];
		String firstName = parts[1];
		int age = Integer.parseInt(parts[2]);
		String city = parts[3];
		
		String message = String.format(
				"名前:%s %s 年齢:%d歳 住所:%s",familyName, firstName, age, city);
		
		System.out.println(message);
	}
}
