
package number.guessing;
import java.util.Random;
import java.util.Scanner;


class game{
 
    int computer;
    public game()
    {
        Random rand=new Random();
        computer= rand.nextInt(10);
        System.out.println(" Guess the number from 1 to 10");
    }
    public int computer()
    {
        return computer;
    }
}
public class NumberGuessing {
static  int takeuserInput()
{
    int user;
    System.out.println("Enter ");
    Scanner sc=new Scanner(System.in);
    user=sc.nextInt();
    return user;
    
}
static  void iscorrectNumber(int i,int j)
{
    if(i==j)
    {
        System.out.println("Correct No.Guess" +j);
    }
    if(i>j)
    {
        System.out.println("Your No. is Big than computer No");
    }
    else{
        System.out.println("Your No. is small than computer No");
    }
}

  
    public static void main(String[] args) {        
int user=0,computer=0,itteration=0;
game g=new game();
do{
    user =takeuserInput();
    computer=g.computer();
    
    iscorrectNumber(user, computer);
    itteration++;
}while(user!=computer);
        System.out.println("YOU GUESS NO IN "+itteration+"itteration");
            
    }
    
}
