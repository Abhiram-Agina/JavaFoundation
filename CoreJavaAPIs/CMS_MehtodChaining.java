package CoreJavaAPIs;

public class CMS_MehtodChaining {
	
	public static void main(String[] args) {
		
		String start = "AniMal    ";
		System.out.println(start);
		
		String trimmed  = start.trim();
		System.out.println(trimmed);
		
		String lowercase = trimmed.toLowerCase();
		System.out.println(lowercase);
		
		String result = lowercase.replace('a', 'A');
		System.out.println(result);
		String easy = "AniMal    ".trim().toLowerCase().replace('a', 'A');
		System.out.println(easy);
		System.out.println();
		System.out.println("===============================================================================");
		//=================================================================================================
		
		
		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		
		
	}

}
