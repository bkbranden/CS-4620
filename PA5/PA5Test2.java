import meggy.Meggy;

class PA5Test2{
    public static void main(String[] args){
        new objTest().setPixelWithObject(Meggy.Color.DARK);
    }
}

class objTest{

    cObj ob;

    public void setPixelWithObject(Meggy.Color c){
        ob = new cObj();
        ob.set(3,6);
        Meggy.setPixel((byte) ob.getX(), (byte) ob.getY(), c); 
    }

}

class cObj{
    int x;
    int y;
    public void set(int val1, int val2){
        x = val1;
        y = val2;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}