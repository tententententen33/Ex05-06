
public class PracticeFormat3 {
	public static void main(String[] args) {
		String line = " Java Silver , Java Bronze , ITパスポート";
		String[] items = line.split(",");
		
		for (int i = 0; i < items.length; i++) {
			items[i] = items[i].trim();
		}
		
		String joined = String.join("/",items);
		System.out.printf("受講予定:%s", joined);
	}
}
