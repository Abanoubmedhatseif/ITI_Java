import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class WordSearch {
public static void main (String args []){


String text = "This is my text i want to go home please im sorry please i beg your mercy";
String word = "please";

int countSplit = wordCountSplit (text,"please");
if (countSplit == -1){
	System.out.println("Word not Found");
}
else {
System.out.println("Count using Split :" + countSplit);
}


int countIndex = wordCountIndex (text ,"please");
if (countIndex == -1){
	System.out.println("Word not Found");
}
else {
	System.out.println("Count using Index :" + countIndex);
}




int countToken = wordCountStringTokenizer (text ,"please");
if (countToken == -1){
	System.out.println("Word not Found");
}
else {
System.out.println("Count using Tokenizer :" + countToken);
}




int countRegex = wordCountRegex (text ,"please");
if (countRegex == -1){
	System.out.println("Word not Found");
}
else {
System.out.println("Count using Regex :" + countRegex);
}



} // end main ya beeeeh



	public static int wordCountSplit (String text , String word){
		String strArray [] = text.split(" ");
		int count = 0;
		for (int i = 0 ; i<strArray.length ; i++ ){
			if (word.equals(strArray[i])){
				count++ ;
			}
		}
		if (count == 0){
			return -1;
		}
		return count;
	}

	
	public static int wordCountIndex (String text , String word){
		int count = 0;
		int index = text.indexOf(word);

		while ( index != -1 ){
			count++ ;
			index = text.indexOf(word , index+1);
		}
		if (count == 0){
			return -1;
		}
		return count;
	}

	public static int wordCountStringTokenizer (String text , String word){
		StringTokenizer newStringToken = new StringTokenizer(text);
		int count=0;
		while (newStringToken.hasMoreTokens()) {
            		String temp = newStringToken.nextToken();
			if (word.equals(temp)){
				count++ ;
			}
		}
		if (count == 0){
			return -1;
		}
		return count;
	}

	public static int wordCountRegex ( String text , String word ){
		Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b");
		Matcher matcher = pattern.matcher(text);

		int count = 0;
       		while (matcher.find()){
            		count++;
        	}
		if (count == 0){
			return -1;
		}
       	 return count;
	}







}





