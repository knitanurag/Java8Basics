import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	
	String s = "Anurag";
	String s1 =null;
	
	System.out.println("Anurag".equalsIgnoreCase(s1));
	System.out.println(s1.equalsIgnoreCase("Anurag"));
	/*System.out.println();
	
	
	List<String> list = new ArrayList<String>();
	list.add("a,b");
	list.add("c,d,e");
	
	String[] arr = getUsingBuffer(list);
	for(String ar :arr){
		System.out.println(ar);
	}
	System.out.println(arr.toString());*/

}

private static String[] getUsingBuffer(List<String> list) {
	StringBuilder inqs = new StringBuilder();
	for (String inquiry : list) {
		if(inqs.length()!=0){
			inqs.append(",");
		}
		inqs.append(inquiry);
	}
	return inqs.toString().split(",");
	
}

}

