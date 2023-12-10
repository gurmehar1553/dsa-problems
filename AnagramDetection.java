public class AnagramDetection {
    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";
        boolean ans = checkAnagram(s1,s2);
        if (ans){
            System.out.println("Two strings are anagram");
        }
        else {
            System.out.println("Two strings are not anagram");
        }
    }

    public static boolean checkAnagram(String s1, String s2) {
        int[] freq = new int[26];
        for (int i=0;i<s1.length();i++){
            freq[(s1.charAt(i)-'a')]++;
        }
        for (int i=0;i<s2.length();i++){
            freq[(s2.charAt(i)-'a')]--;
        }
        for (int i =0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
