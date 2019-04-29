package zunayedhassan;

import javafx.scene.shape.Rectangle;

public class KBS {
    private String oprSystem;
    private boolean visible = false;
    protected int kbsTimesUsed = 0;
    protected int tbTimesClicked = 0;
    private int nrOnList;
    private boolean pinned;
    public int KBStype[] = new int[5];
    KBS(){

    }

    KBS(String oprSystem){
        this.oprSystem = oprSystem;
    }
    // TODO MOVE VENTEGODT FUNCTION HERE
    public Rectangle displayKBS(){
       return new Rectangle(100,100,100,50);
    }







}
