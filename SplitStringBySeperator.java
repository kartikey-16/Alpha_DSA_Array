package in.leetcode;

import java.util.*;
import java.util.regex.Pattern;

public class SplitStringBySeperator {


	private static List<String> splitWordBySeperator(List<String> words , String seperator) {
		// TODO Auto-generated method stub
		List <String> result = new ArrayList<>();
		for(int i = 0 ; i < words.size() ; i++)
		{
			String wordArray[] = words.get(i).split(Pattern.quote(seperator));
			for(String word : wordArray)
			{
				if(word!= "")
					result.add(word);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String seperator = ".";
		List<String> words = new ArrayList<>();
		words.add("one.two.three");
		words.add("four.five");
		words.add("six");
		List<String> str =  splitWordBySeperator(words , seperator);
		for(String s : str)
		{
			System.out.println(s);
		}
	}
}
