import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isIsomorphic(words[i], pattern)) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        HashMap<Character, Character> map = new HashMap<Character, Character>(len, 1);
        for (int i = 0; i < len; i++) {
            char curr1 = s.charAt(i);
            char curr2 = t.charAt(i);
            if (map.get(curr2) == null) {
                if (map.containsValue(curr1)) {
                    return false;
                } else {
                    map.put(curr2, curr1);
                }
            } else if (map.get(curr2) == curr1) {
                //do nothing
            } else {
                return false;
            }
        }
        return true;
    }
}

