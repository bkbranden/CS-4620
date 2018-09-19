import meggy.Meggy;

class PA4Test3{
    public static void main(String[] args){
        new Pixel().findDarkPixelPixel(1, 4);
        new Pixel().findDarkPixelPixel(4, 4);
        new Pixel().findDarkPixelPixel(6, 6);
        new Pixel().findDarkPixelPixel(0, 0);

    }
}

class Pixel{
    public void findDarkPixelPixel(int x, int y){
        if(x == 4 && y == 4){
            Meggy.setPixel((byte)x, (byte)y, Meggy.Color.DARK);
        }

        if(x == 6 && y == 6){
            Meggy.setPixel((byte)x, (byte)y, Meggy.Color.DARK);
        }

       
    }
}