
public class PracticeSplit3 {
	public static void main(String[] args) {
		String data = "りんご,みかん,ぶどうとばなな";
		String[] fruits = data.split("[,と]");
		String result = String.join("→", fruits);
		System.out.println(result);
	}
}
