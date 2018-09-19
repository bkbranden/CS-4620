import meggy.Meggy;

class PA4Test1{
    public static void main(String[] args){
        new Testing().changeColor(3,5,Meggy.Color.GREEN);
    }
}

class Testing{
    public void changeColor(int bt1, int bt2, Meggy.Color color){
        Meggy.setPixel((byte) bt1, (byte) bt2, color);
    }
    
}