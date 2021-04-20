package testzhujie;

public class Yunsuan {
    @Errorannotation
    public int  add( int i ,int b){
        return i+b;
    }
    @Errorannotation
    public int  sub(int i, int b){
        return i-b;
    }
    @Errorannotation
    public int div(int i ,int b){
        return i/b;
    }
}
