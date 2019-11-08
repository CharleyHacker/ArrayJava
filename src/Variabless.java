import java.util.Scanner;
public class Variabless {
    public static void main(String[] args){
        Scanner hacker= new Scanner(System.in);
        String j= "Davis is stupid";
        int k=0;
        System.out.println("Enter number of times Davis has made you feel stupid");
        /* this is the loop number
        also shows use of comments
         */
        int x= hacker.nextInt();
        while (k<=x)
        {
            System.out.println(j);
            k++;
        }
    }
}
