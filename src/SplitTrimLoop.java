
public class SplitTrimLoop {
	public static void main(String[] args) {
		String text = "tanaka, taro, Tokyo";
		String[] parts = text.split(",");
		
		for(int i = 0; i < parts.length; i++) {
			parts[i] = parts[i].trim();
			System.out.println(i + 1 + "件目: " + parts[i]);
		}
	}
}
