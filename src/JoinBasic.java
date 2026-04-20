
public class JoinBasic {
	public static void main(String[] args) {
		System.out.println(String.join(",","うめ","もも","さくら"));
		
		String[] fruits = {"りんご","みかん","ぶどう"};
		System.out.println(String.join("/", fruits));
	}
}
