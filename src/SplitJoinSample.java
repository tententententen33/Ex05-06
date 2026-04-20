
public class SplitJoinSample {
	public static void main(String[] args) {
		String text = "tanaka , taro , Tokyo";
		String[] parts = text.split(",");
		
		for(int i = 0; i < parts.length; i++) {
//			parts[i] = parts[i].trim();
			parts[i] = parts[i].strip();
		}
		
		String output = String.join("/", parts);
		System.out.println(output);
	}
}
