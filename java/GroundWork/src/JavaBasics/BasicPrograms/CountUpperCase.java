package JavaBasics.BasicPrograms;

public class CountUpperCase {
    public static int countUppercaseLetters(String str) {
        int count = 0;
        for(char s: str.toCharArray()) {
            if(s > 64 && s < 91) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countUppercaseLetters("THis iasd HAPPU"));
    }

}
