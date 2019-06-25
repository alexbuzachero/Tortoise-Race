package tortoise_race;
import java.util.Random;
import java.util.Arrays;

public class Tortoise_Race {
        
    public static void main(String[] args) {
//        Creating myHare and myTortouise object
        Hare myHare = new Hare();
        Tortoise myTortoise = new Tortoise();

//        Starting myHare and myTortoise in the firts position to start the Race
        myHare.setPosition(1);
        myTortoise.setPosition(1);
        
//        Declaring the track size
        int totalTrackLenght = 70;
        
//        Declaring the Counter to have a time between each while interation
        long endTimeMillis = System.currentTimeMillis() + 1;
        
        
        System.out.println("AND THEY'RE OFF!!");

//        This is a infitine looping that occurs until someone win the RAce
        while (myHare.getPosition() > 0){
            
//            Verifying if the time is bigger than the time declared using the Current time
            if (System.currentTimeMillis() > endTimeMillis) {
                
//           increasing the timer to 1Seg, when the loop return the content will print after 1 seg
                endTimeMillis = System.currentTimeMillis() + 1000;
            int n = (int)(Math.random()*10);
    
//            Verifiyng if the sort is between 1 - 10, and in each case 
//              something will happens with the Tortouise and the Hare

            switch (n){
                case 1:
                    myHare.BigHop();
                    myTortoise.FastPlod();
                    break;
                case 2:
                    myHare.BigHop();
                    myTortoise.FastPlod();
                    break;
                case 3:
                    myHare.SmallHop();
                    myTortoise.FastPlod();
                    break;
                case 4:
                    myHare.SmallHop();
                    myTortoise.FastPlod();
                    break;
                case 5:
                    myHare.SmallHop();
                    myTortoise.FastPlod();
                    break;
                case 6:
                    myHare.BigSlip();
                    myTortoise.SlowPlod();
                    break;
                case 7:
                    myHare.SmallSlip();
                    myTortoise.SlowPlod();
                    break;
                case 8:
                    myHare.SmallSlip();
                    myTortoise.SlowPlod();
                    break;
                case 9:
                    myHare.Sleep();
                    myTortoise.Slip();
                    break;
                case 10:
                    myHare.Sleep();
                    myTortoise.Slip();
            }
            
//            Verifyng the position if will print space, H (Hare) or T (Tortouise)
            
                if(myHare.getPosition() < myTortoise.getPosition()){
                for(int i = 1; i < myHare.getPosition(); i++){//print leading empty spaces
                    System.out.print(" ");
                }
                System.out.print("H");//print hare
                for(int i = myHare.getPosition(); i < myTortoise.getPosition(); i++){//print empty spaces
                     System.out.print(" ");
                }
                System.out.print("T");
                //print the postion of tortoise in a similar way
                System.out.println();//remember to start on a new line
                } else if ( myTortoise.getPosition() < myHare.getPosition()){
                for(int i = 1; i < myTortoise.getPosition(); i++){//print leading empty spaces
                      System.out.print(" ");
                }
                System.out.print("T");//print tortoise
                for(int i = myTortoise.getPosition(); i < myHare.getPosition(); i++){//print trailing empty spaces
                    System.out.print(" ");
                }
                System.out.print("H");//print hare
                System.out.println();//finish the line
                } else {//Are they in the same spot?
                  for(int i = 1; i < myTortoise.getPosition(); i++){//print leading empty spaces
                      System.out.print(" ");
                }
                  System.out.print("TH");
                  System.out.println();
                }
                
            
//            Verifying if is the final track and who won the Race
            if (myHare.getPosition() == totalTrackLenght | myTortoise.getPosition() == totalTrackLenght){
                if (myHare.getPosition() == myTortoise.getPosition()){
                        System.out.println("IT'S A TIE!!");
//                        System.out.println("Hare Position: " + myHare.getPosition() );
//                        System.out.println("Tortoise Position: " + myTortoise.getPosition());
                        break;
                    }
                if (myHare.getPosition() >= totalTrackLenght && myHare.getPosition() > myTortoise.getPosition()){
                    System.out.println("HARE WINS!!");
//                    System.out.println("Hare Position: " + myHare.getPosition() );
//                        System.out.println("Tortoise Position: " + myTortoise.getPosition());
                    break;
                }
                 if (myTortoise.getPosition() >= totalTrackLenght && myTortoise.getPosition() > myHare.getPosition()){
                        System.out.println("TORTOISE WINS!!");
//                        System.out.println("Hare Position: " + myHare.getPosition() );
//                        System.out.println("Tortoise Position: " + myTortoise.getPosition());
                        break;
                   }
                
                }
            }
        }
    }
}
   
