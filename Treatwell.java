/**
 * Treatwell Application Code
 * 
 * @author Bradley Gauntlett
 *
 */
public class Treatwell {
	public static void main(String [] args){
		drawBox(4, 7);
	}
	
	/**
	 * drawBow(int, int) - takes height and width as args and based on these values will draw the appropriate box
	 * @param h - represents box height
	 * @param w - represents box width
	 */
	public static void drawBox(int h, int w){
		char[][] box = new char[h][w];
		
		if (h ==0 || w ==0){
			System.out.println("Error: Enter values greater than 0");
		} else {
			/*Populate box*/
			for(int i= 0; i<h;i++){
				for(int j=0; j<w;j++){
					
					if( (i == 0 || i == h-1) && (j != 0 || j != w-1)){
						box[i][j] = '─';
					}
					if(j == 0 || j == w-1){
						box[i][j] = '|';
					}
					if(i==0 && j ==0){
						box[i][j] = '┌';
					}
					if(j==w-1 && i==0){
						box[i][j] = '┐';
					}
					
					if(j==0 && i==h-1){
						box[i][j] = '└';
					}
					
					if(j==w-1 && i==h-1){
						box[i][j] = '┘';
					}	
				}
			}
			
			/*Print box*/
			for(int i= 0; i<h;i++){
				for(int j=0; j<w;j++){
					System.out.print(box[i][j]);
				}
				System.out.println();
			}
			
		}
		
	}
}
