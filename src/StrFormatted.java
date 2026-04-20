
public class StrFormatted {
	public static void main(String[] args) {
		String pattern = "名前は%1$s、%3$d歳です。%1$sは元気です。";
		System.out.println(pattern.formatted("サクラ","女の子",1));
	}
}
