import java.util.HashSet;
import java.util.Set; 
class Countwords {
    public int countWords(String[] words1, String[] words2) {
        Set<String> word1=new HashSet<>();
        Set<String> arr1=new HashSet<>();
        for(int i=0;i<words1.length;i++)
        {
            if(!word1.add(words1[i]))
            {
                arr1.add(words1[i]);
            }
        }
        word1.removeAll(arr1);
        Set<String> word2=new HashSet<>();
        Set<String> arr2=new HashSet<>();
        for(int i=0;i<words2.length;i++)
        {
            if(!word2.add(words2[i]))
            {
                arr2.add(words2[i]);
            }
        }
        word2.removeAll(arr2);  
        word1.retainAll(word2);
        return word1.size();
    }
}