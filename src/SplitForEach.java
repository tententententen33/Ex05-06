
public class SplitForEach {
	public static void main(String[] args) {
		String text = "Java,Python,C言語,JavaScript";
		String[] langs = text.split(",");
		
		for(String lang : langs) {
			System.out.println(lang);
		}
	}
}
