
public class SplitLengthCheck {
	public static void main(String[] args) {
		String data = "tanaka,taro";
		String[] result = data.split(",");
		
		if(result.length == 4) {
			System.out.println("形式は想定通りです");
		} else {
			System.out.println("要素数が想定と違います: " + result.length);
		}
	}
}
