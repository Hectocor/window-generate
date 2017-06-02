
import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class test{
	public test(){
		
	}
	public void metodoVentana(int limit){
		for(int i = 0; i < limit; i++){
			JFrame f = new JFrame();
			
			Random aleatorio = new Random();
			int intx = aleatorio.nextInt(1920);
			int inty = aleatorio.nextInt(1080);
			
			Ventana v = new Ventana(i, 200, 100, true, true, f, intx, inty);
			
		}
	}
	
	public static void main(String[] args) {
		test t = new test();
		t.metodoVentana(100);
		
	}

}