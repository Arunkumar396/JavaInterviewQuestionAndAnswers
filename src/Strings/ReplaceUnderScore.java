package Strings;

public class ReplaceUnderScore {

	public static void main(String[] args) {
		//Replace the 2nd & subsiquent occurrance of the character with under score (_)
		
		String str = "sgtestinginstitute";
		String res = "";
		
		
			//	   sg te__in_ ______u__
			for(int i=0; i<str.length(); i++)
			{
				if(res.contains(String.valueOf(str.charAt(i))))
				{
					res+="_";
				}else {
					res+=String.valueOf(str.charAt(i));
				}
			}
			System.out.println(res);

	}

}
