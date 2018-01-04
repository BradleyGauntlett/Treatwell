/**
 * Treatwell Application Code
 * 
 * @author Bradley Gauntlett
 *
 */
public class Treatwell {
	public static void main(String [] args){
		drawBox(10, 40);
	}
	
	/**
	 * drawBow() method - takes height and width as args and based on these values will draw the appropriate box
	 * @param h
	 * @param w
	 */
	public static void drawBox(int h, int w){
		char[][] box = new char[h][w];
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
