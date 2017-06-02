import javax.swing.*;

public class Ventana extends JFrame{
	
	private int i;
	
	public Ventana(int i, int sizex, int sizey, boolean visible, boolean resizable, JFrame f, int lctionx, int lctiony){
		f.setVisible(visible);
		f.setTitle("Ventana "+i);
		f.setLocation(lctionx, lctiony);
		f.setSize(sizex, sizey);
		f.setResizable(resizable);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}