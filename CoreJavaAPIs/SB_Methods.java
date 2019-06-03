package CoreJavaAPIs;

public class SB_Methods {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);		
// ===============================================================================
		
		
		StringBuilder sb2 = new StringBuilder().append(1).append('c');
		sb2.append("-").append(true); // can take all types
		System.out.println(sb2);		// 1c-true
// ===============================================================================
		
		
		StringBuilder sb3 = new StringBuilder("animals");
		sb3.insert(7, "-");
		sb3.insert(0, "-");
		sb3.insert(4, "-");
		
		System.out.println(sb3);
// ===============================================================================
		
		
		StringBuilder sb4 = new StringBuilder("abcdef");
		sb4.delete(1, 3); // deletes range
//		sb4.deleteCharAt(4); // specific character
		
		System.out.println(sb4);
// ===============================================================================
		
		
		StringBuilder sb5 = new StringBuilder("ABC");
		sb.reverse();
		
		System.out.println(sb5);
// ==============================================================
		
	}
	
}
