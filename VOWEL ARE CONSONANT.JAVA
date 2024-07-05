import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().trim();
        checkVowelOrConsonant(input);
    }
    public static void checkVowelOrConsonant(String input){
        if(input.length()!=1||! Character.isLetter(input.charAt(0))){
            System.out.println("-1");
        }else{
            char ch=Character.toLowerCase(input.charAt(0));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
    }
}
