import java.util.HashMap;

public class firstUniqChar {
    public int uniqueChar(String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if(!hashMap.containsKey(currentChar)) {
                hashMap.put(currentChar, i);
            } else {
                hashMap.put(currentChar, -1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (char c: hashMap.keySet()
             ) {
            if(hashMap.get(c) > -1 && hashMap.get(c) < min) {
                min = hashMap.get(c);
            }
        }

        return min == Integer.MAX_VALUE ? - 1 : min;
    }
    public static void main(String[] args){
        firstUniqChar firstUniqChar = new firstUniqChar();
        String s = "leetcode";
        System.out.println(firstUniqChar.uniqueChar(s));
    }
}
