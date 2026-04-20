
public class SplitIntro {
	public static void main(String[] args) {
		String data = "tanaka,taro,20,Tokyo";
		String[] result = data.split(",");
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
