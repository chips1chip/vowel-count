public class CountVowels {
    public static void main(String[] args) {
        int count = 0;
        String str="My name is Anjali";
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
             
                 
                count++;
            }
        }
        System.out.println("THE NO. OF VOWELS:"+count);
    }
}