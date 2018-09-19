import meggy.Meggy;

class PA4Test2{
    public static void main(String[] args){
        Meggy.toneStart(Meggy.Tone.C3, 8);
        new thisCheckButton().setColorOffButton();
    }
}

class thisCheckButton{

    public void chooseType(int i){
        if (i == 1){

            Meggy.delay(1);
        }

        if (i ==2){
            Meggy.delay(2);
        }

        // if(i == 1){
        //     Meggy.checkButton(Meggy.Button.A);
        
        // }

        // if(i == 2){
        //     Meggy.checkButton(Meggy.Button.Up);
        
        // }

        // if(i == 3){
        //     Meggy.checkButton(Meggy.Button.Down);
        
        // }

        // if(i == 4){
        //     Meggy.checkButton(Meggy.Button.Left);
         
        // }

        // if(i == 5){
        //     Meggy.checkButton(Meggy.Button.Right);
           
        // }
    }

    public void setColorOffButton(){
        this.chooseType(1);
        if(Meggy.checkButton(Meggy.Button.A)){
            Meggy.setPixel((byte) 1, (byte) 2, Meggy.Color.BLUE);
        }
    }
}