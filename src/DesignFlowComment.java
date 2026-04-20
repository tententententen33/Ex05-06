
public class DesignFlowComment {
	public static void main(String[] args) {
		String data = " Suzuki , Ichiro , 1998/4/12 , Tokyo ";
		
		String[] parts = data.split(",");
		for (int i = 0; i < parts.length; i++) {
			parts[i] = parts[i].trim();
		}
		
		String name = parts[0] + " " + parts[1];
		String birth = parts[2];
		String city = parts[3];
		
		String display = String.format(
				"氏名:%s 生年月日:%s 居住地:%s",name, birth, city);
		
		System.out.println(display);
	}
}
