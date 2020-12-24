
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        char input[]=new char[9];
        for(int i=0;i<9;i++){
            input[i]= ' ';
        }
        System.out.println("---------");
        System.out.println("| " + input[0] + " " + input[1] + " " + input[2] + " |");
        System.out.println("| " + input[3] + " " + input[4] + " " + input[5] + " |");
        System.out.println("| "+ input[6] + " " + input[7] + " " + input[8] +  " |");
        System.out.println("---------");
         for(int j=0;j<8;){
             count+=1;
        System.out.println("Enter the coordinates");
        String co=scanner.nextLine();
        int a=0,b=0,num=0;
        a=Integer.parseInt(String.valueOf(co.charAt(0)));
        b=Integer.parseInt(String.valueOf(co.charAt(2)));
        if(a==1 && b<4){
            num=b-1;
        }
        else if(a==2 && b<4){
            num=3+b-1;
        }
        else if(a==3 && b<4){
            num=6+b-1;
        }
        else{
            System.out.println("Coordinates should be from 1 to 3!");
            count-=1;}
        if(a==4 || b==4) continue;
        
        if(input[num]==' '){
            if (count%2==0){
                input[num]='O';}
                else{
            input[num]='X';}
            j++;
            System.out.println("---------");
         System.out.println("| " + input[0] + " " + input[1] + " " + input[2] + " |");
         System.out.println("| " + input[3] + " " + input[4] + " " + input[5] + " |");
         System.out.println("| "+ input[6] + " " + input[7] + " " + input[8] +  " |");
         System.out.println("---------");
        }
            else{System.out.println("This cell is occupied! Choose another one!");
        count-=1;}
        //}for
        
        boolean xHasWon = false;
        boolean oHasWon = false;
        boolean impossible = false;
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == 'X') {
                xCount++;
            } else if (input[i] == 'O') {
                oCount++;
            }
        }

        if (Math.abs(xCount - oCount) >= 2) {
            impossible = true;
        }

        // X wins
         if (input[0] == 'X' && input[1] == 'X' && input[2] == 'X' ||
            input[3] == 'X' && input[4] == 'X' && input[5] == 'X' ||
            input[6] == 'X' && input[7] == 'X' && input[8] == 'X' ||
            input[0] == 'X' && input[3] == 'X' && input[6] == 'X' ||
            input[1] == 'X' && input[4] == 'X' && input[7] == 'X' ||
            input[2] == 'X' && input[5] == 'X' && input[8] == 'X' ||
            input[0] == 'X' && input[4] == 'X' && input[8] == 'X' ||
            input[2] == 'X' && input[4] == 'X' && input[6] == 'X') {
            xHasWon = true;
         }

         if (input[0] == 'O' && input[1] == 'O' && input[2] == 'O' ||
            input[3] == 'O' && input[4] == 'O' && input[5] == 'O' ||
            input[6] == 'O' && input[7] == 'O' && input[8] == 'O' ||
            input[0] == 'O' && input[3] == 'O' && input[6] == 'O' ||
            input[1] == 'O' && input[4] == 'O' && input[7] == 'O' ||
            input[2] == 'O' && input[5] == 'O' && input[8] == 'O' ||
            input[0] == 'O' && input[4] == 'O' && input[8] == 'O' ||
            input[2] == 'O' && input[4] == 'O' && input[6] == 'O') {
            
            oHasWon = true;
         }

         if (xHasWon && !oHasWon) {
             System.out.println("X wins");
             break;
         } else if (oHasWon && !xHasWon) {
             System.out.println("O wins");
             break;
         } else if (count>=9&&!xHasWon && !oHasWon) {
            System.out.println("Draw");
            break;
        } 
    }//for
    }
}