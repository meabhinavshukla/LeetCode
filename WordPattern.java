/*
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.

*/

public class Solution 
{
    public boolean wordPattern(String pattern, String str) 
    {
        
        String[] strSplit = str.split("\\s+");
        int i =0;
        
        // Create mapping from pattern --> str
        HashMap<String,String> index = new HashMap<String, String>();
        
        // Create mapping from str --> pattern, reverse index, efficient lookup
        HashMap<String,String> revIndex = new HashMap<String, String>();
        
        // Basic check return false
        if(strSplit.length != pattern.length())
            return false;
        
        while(i < strSplit.length)
        {
            if(index.containsKey(""+pattern.charAt(i)))
            {
                String s = index.get(""+pattern.charAt(i));
                // If pattern char not equal to string return false
                if(!s.equals(strSplit[i]))      
                    return false;
            }
            else
            {
                // If reverse index already contains str, return false
                if(revIndex.containsKey(strSplit[i]))
                    return false;
                // Create index and reverse index    
                index.put(""+pattern.charAt(i), strSplit[i]);
                revIndex.put( strSplit[i], ""+pattern.charAt(i));
            }
            
            i++;
        }
        return true;
    }
}

