/*******************************************************************************
 * Spritesheet.java
 *
 * This class represents a spritesheet, an image containing a grid of sprites
 * to be used in a game.
 *
 * @author Sam Waggoner
 * @modified Daniel Brady
 * @date 23 April 2013
 */

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Spritesheet {
		
	public final int PER_ROW;			// number of sprites per row
	public final int TILESIZE;		// width of a tile, in pixels (tiles are square)
	public int width, height;			// width and height of the spritesheet, in pixels
	public int[] pixels;					// an array of integer pixels in default RGB color mode (TYPE_INT_ARGB)


	public Spritesheet(String path, int tileSize) {
		BufferedImage sheet;
		try {
			/* Find a resource with the given path and return a BufferedImage as the
				 result of decoding the InputStream with automatically-chosen ImageReader */
			sheet = ImageIO.read(getClass().getResourceAsStream(path)); // ImageIO.read() throws an IOException
			width = sheet.getWidth();
			height = sheet.getHeight();
			pixels = sheet.getRGB(0, 0, width, height, null, 0, width);
			
		} catch (IOException e) {
			e.printStackTrace();
		}1
		TILESIZE = tileSize;
		PER_ROW = width / TILESIZE;
	}
} // end class Spritesheet
