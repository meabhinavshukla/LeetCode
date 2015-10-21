/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets
*/

public class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character, Integer> first = new HashMap<Character, Integer>();
        int i =0;
        int firstLength = s.length();
        
        //Construct a hashmap for the first string-> s to hold key as the character and value as the count of that character.
        while(i<firstLength)
        {
               if(first.containsKey(s.charAt(i)))
               {
                   int count = first.get(s.charAt(i));
                   first.put(s.charAt(i), ++count);
               }
               else
                first.put(s.charAt(i), 1);
               
               i++;
        }
        
        // Subtract counts from the above constructed hashmap per character from string 2
        i=0;
        int secondLength = t.length();
        while(i<secondLength)
        {
            if(first.containsKey(t.charAt(i)))
            {
                int count = first.get(t.charAt(i));
                count--;
                if(count!=0)
                    first.put(t.charAt(i), count);
                else
                    first.remove(t.charAt(i));
            }
            else
                return false;
                
            i++;
        }
        
        // Return true if the size of hashmap eqauls zero. 
        return first.size()==0 ? true : false;
    }
}
