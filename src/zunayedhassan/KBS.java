package zunayedhassan;

import javafx.scene.shape.Rectangle;

public class KBS {
    private String oprSystem;
    private boolean visible = false;
    protected int kbsTimesUsed = 0;
    protected int tbTimesClicked = 0;
    private String function;
    private boolean pinned;
    private String iconImage;
    KBS(){

    }

    KBS(String oprSystem, String function){
        this.oprSystem = oprSystem;
        this.function = function;


    }

    public Rectangle displayKBS(){
       return new Rectangle(100,100,100,50);
    }







}
