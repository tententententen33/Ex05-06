
public class DesignFlowSample {
	public static void main(String[] args) {
		String line = " Java Silver , Java Bronze , ITパスワード";
		String[] items = line.split(",");
		
		for(int i = 0; i < items.length; i++) {
			items[i] = items[i].trim();
		}
		
		String joined = String.join("/", items);
		String message = String.format("受講予定の科目:%s", joined);
		System.out.println(message);
	}
}
