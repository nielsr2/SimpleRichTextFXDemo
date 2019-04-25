package zunayedhassan;

import javafx.scene.shape.Rectangle;

public class KBS {
    private String oprSystem;
    private boolean visible = false;
    private int kbsTimesUsed = 0;
    private int tbTimesClicked = 0;
    private int nrOnList;
    private boolean pinned;

    KBS(){

    }
    KBS(String oprSystem){
        this.oprSystem = oprSystem;
    }

    public Rectangle displayKBS(){
       return new Rectangle(100,100,100,50);
    }







}
