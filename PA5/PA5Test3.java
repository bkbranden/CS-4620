import meggy.Meggy;

class PA5Test3{
    public static void main(String[] args){
        new ProtoRun().run();
    }
}

class ProtoRun{
    int x;
    int y;
    Meggy.Color c;
    Meggy.Tone t;

    public void run(){
        x = 0;
        y = 0;
        c = Meggy.Color.DARK;
        t = Meggy.Tone.C3;
        while(true){
            x =  x + 1;
            y =  y +1;

            if(x < 3){
                c = Meggy.Color.RED;
            }
            else{
                c = Meggy.Color.VIOLET;
            }

            if (y < 3){
                t = Meggy.Tone.D3;
            }
            else{
                t = Meggy.Tone.G3;
            }


            if (x == 7){
                x = 0;
            }
            if (y == 7){
                y = 0;
            }

            Meggy.setPixel((byte) x, (byte) y, c);
            Meggy.toneStart(t, y +1);
        }
    }
}