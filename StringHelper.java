package JUnitDemo;

public class StringHelper {

	public String removeA(String str){
		if(str.length()<2){
			return str.replace("A", "");
		}
		else{			
			String firstTwoChars = str.substring(0, 2);
			String rem = str.substring(2);			
			return firstTwoChars.replaceAll("A", "")+rem;
		}
	}
	
	public boolean areFirstAndLast2CharsSame(String str){
		if(str.length()<2)
			return false;		
		else if(str.length() == 2)
			return true;
		else{
			int len = str.length();
			String firstTwoChars = str.substring(0,2);
			String lastTwoChars= str.substring(len-2);			
			return firstTwoChars.equals(lastTwoChars);
		}
	}

}
