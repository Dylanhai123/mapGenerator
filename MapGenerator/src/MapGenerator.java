import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
private static final Color Colorblack = null;
public int map [][];
public int brickHeight;
public int brickWidth;
public MapGenerator(int row,int col) {
	map=new int [row][col];
	for(int i=0; i<map.length; i++) {
		for(int j=0; j<map[0].length; j++) {
			map[i][j]=1;
		}
	}
	brickHeight=150/row;
	brickWidth=540/col;
}

public void draw (Graphics2D g) {
	for(int i=0; i<map.length; i++) {
		for(int j=0; j<map[0].length; j++) {
			if (map [i][j]>0) {
				g.setColor(Color.white);
				g.fillRect(j*brickWidth+80, i*brickHeight+50,brickWidth, brickHeight);
				g.setStroke(new BasicStroke(3));
				g.setColor(Colorblack);
				g.drawRect(j*brickWidth+80, i*brickHeight+50, brickHeight, j);
				
				
				
				
			}
		}
}
}
public void setBrickValue(int value, int row, int colum) {
	//int value = 0;
	map[row][colum]=value;
}
}













