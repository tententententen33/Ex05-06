
public class PracticeFormat1 {
	public static void main(String[] args) {
		String name = "山田";
		int age = 19;
		String city = "今治";
		
		System.out.println("私の名前は" + name + "です。" + age + "歳で、出身は" + city + "です。");
		System.out.println(String.format("私の名前は%sです%d歳で、出身は%sです。", name, age, city));
	}
}
