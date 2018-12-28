package prob4;

public class StringUtil {

	public static String concatenate(String[] str) {
		// TODO Auto-generated method stub
		
		StringBuilder strBuilder=new StringBuilder();
		
		for(String token:str) {
		strBuilder.append(token);
		}
		return strBuilder.toString();
	}

}
