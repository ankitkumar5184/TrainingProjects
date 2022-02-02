import java.util.ArrayList;
import java.util.Scanner;

public class BadWords
{
    ArrayList <String> list = new ArrayList <String>();
    void list1()
    {
        list.add("Stupid");
        list.add("Idiot");
        boolean containsSearchStr = list.stream().anyMatch("Stupid"::equalsIgnoreCase);
    }
    public void ReplaceBadWords()
    {
        Scanner sc = new Scanner(System.in);
        list1();
        System.out.println("Please Enter the word : ");
        String word = sc.nextLine();

        for(String word1 : list)
        {
            word = word.replace(word1, "*****");
        }
        System.out.println(word);
    }
    public static void main(String[] args)
    {
        BadWords bd = new BadWords();
        bd.ReplaceBadWords();
    }
    private boolean equalsIgnoreCase(String string1)
    {
        return false;
    }
}
