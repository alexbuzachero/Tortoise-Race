package tortoise_race;

public class Hare {
    private int position;

        public void setPosition(int s){
            position = s;
        }

        public int getPosition(){
            return position;
        }

        public void BigHop(){
            position += 9;
        }

        public void SmallHop(){
            position += 1;
        }

        public void BigSlip(){
            if (position > 12){
                position -= 12;
            }
            else{
                position = 1;
            }
        }

        public void SmallSlip(){
            if (position > 2){
                position -= 2;
            }
            else{
                position = 1;
            }
        }

        public void Sleep(){
            position = position;
        }
}
