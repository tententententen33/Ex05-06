
public class PracticeSplit2 {
	public static void main(String[] args) {
		String data = "tanaka , taro , Tokyo";
		String[] parts = data.split(",");
		
		for(int i = 0; i < parts.length; i++) {
			parts[i] = parts[i].trim();
			System.out.println((i + 1) + "番目: " + parts[i]);
		}
	}
}
