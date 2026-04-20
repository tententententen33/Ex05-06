
public class PracticeSplit1 {
	public static void main(String[] args) {
		String data = "Java,Python,C言語";
		
		String[] result = data.split(",");
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("要素数: " + result.length);
	}
}
