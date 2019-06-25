package tortoise_race;

public class Tortoise {
    private int position;

    public void setPosition(int s){
        position = s;
    }

    public int getPosition(){
        return position;
    }

    public void FastPlod(){
        position += 3;
    }

    public void SlowPlod(){
        position += 1;
    }


    public void Slip(){
        if (position > 6){
            position -= 6;
        }
        else{
            position = 1;
        }
    }
}
