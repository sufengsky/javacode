package basic.demo0015;

public class  Point{
    private  int x;
    private  int y;

    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(int i,int j){
        this.x=i;
        this.y=j;
    }

    public void  print(){
        System.out.println("point(x="+this.x+",y="+this.y+")");
    }
}