package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Wordcount {
	public static void main(String args[])
	{
		List<String> list=Arrays.asList("I Love india");
		List<String> wordcount=list.stream().filter(ele->ele.endsWith(" ")).collect(Collectors.toList());
		System.out.println(wordcount);
	}

}
