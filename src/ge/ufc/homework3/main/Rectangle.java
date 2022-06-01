package ge.ufc.homework3.main;

public class Rectangle {

    private int length;
    private int width;

    public static int maxLength = 30;
    public static int maxWidth = 24;

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    public Rectangle(int length){
        this.length = length;
        checkLength(length);
    }

    public Rectangle(){
        this.width = 16;
        checkWidth(width);
    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        checkLength(length);
        checkWidth(width);
    }

    private void checkLength(int length){
        if(this.length <= maxLength){
            this.length = length;
        }else {
            this.length = maxLength;
        }
    }

    private void checkWidth(int width){
        if(this.width <= maxWidth){
            this.width = width;
        }else {
            this.width = maxWidth;
        }
    }

    public int getArea() {
        return length * width;
    }

    public static Rectangle largestArea(Rectangle[] array){
        Rectangle maxArea = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i].getArea() > maxArea.getArea()){
                maxArea = array[i];
            }
        }
        return maxArea;

    }



}
