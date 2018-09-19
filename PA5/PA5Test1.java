import meggy.Meggy;

class PA5Test1{
    public static void main(String[] args){
        new FieldsTesting().setFields(5, 6);
        
    }
}

class FieldsTesting{
    int x;
    int y;

    public void setFields(int val1, int val2){
        x = val1;
        y = val2;
        Meggy.setPixel((byte) x, (byte) y, Meggy.Color.RED);
    }
}