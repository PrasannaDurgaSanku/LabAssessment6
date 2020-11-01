import java.io.*;
import java.util.*;
import java.util.Set;

public class FrequencyOfWord
{

	public static void main(String[] args) 
	{
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		BufferedReader br=null;
		try
		{
			br=new BufferedReader(new FileReader("story.txt"));
		}
		catch (FileNotFoundException ex) 
		{
			ex.printStackTrace();
		} 

	
String line = null;
try
{
while ((line = br.readLine()) != null)
{
	String words[] = line.split("");
	for (String word : words) 
	{
		if(map.containsKey(word))
		{
			int freq=map.get(word);
			map.put(word,  ++freq);
		}
		else
		{
			map.put(word,1);
		}
	}
}

}  
catch (IOException ex) 
{
	ex.printStackTrace();
}
Set<Entry<String, Integer>> entrySet = map.entrySet();
for(Entry<String, Integer> setItem : entrySet) {
	System.out.println(setItem.getKey() + " appear " + setItem.getValue() + " times ");
}
}

}