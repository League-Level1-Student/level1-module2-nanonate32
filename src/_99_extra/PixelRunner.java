package _99_extra;

public class PixelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    PixelParty fun = new PixelParty();
    fun.setColor(30, 40, 80);
    fun.drawLine(200, 100, 333, 499);
    fun.drawTriangle(  100, 150, 130, 300, 130, 170);
    fun.drawCircle(100, 300, 500);
    fun.saveImage();
    fun.displayImage();
    		
	}

}
