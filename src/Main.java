public class Main {

    public static void main(String[] args) {
	String word = "cihat";
    String wordstar = " ";
        for(int i=0;i<word.length();i++){
           String s = "*"+ word.charAt(i);
           wordstar =wordstar+ s;
        }
        System.out.println(wordstar);
        System.out.println("*");
        System.out.println("***");
    }
}
