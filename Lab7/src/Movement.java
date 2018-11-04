import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

//Wit Sampson
// Data Created: 10/19/2018
//The purpose of this class is to give movement to the game
public class Movement {
	private String objectMoving;
	playerOne pOne;
	int xCord;
	int yCord;
	
	
	public Movement(String objectMoving) {
		this.objectMoving = objectMoving;
	}
	
	public Movement(playerOne pOne,int xCord, int yCord) {
		this.pOne = pOne;
		this.xCord = xCord;
		this.yCord = yCord;
	}
	
	public Movement(playerOne pOne) {
		this.pOne = pOne;
	}
	
	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	public void movement(KeyEvent event) 
	{
		KeyCode myCode = event.getCode();
		
		if(myCode == KeyCode.A)
		{
			xCord-=10;
			
			
		}
		else if(myCode == KeyCode.D)
		{
			xCord+=10;
		
		}
		else if(myCode == KeyCode.S)
		{
			yCord+=10;
			
			
		}
		else if(myCode == KeyCode.W)
		{
			yCord-=10;
		}
		
	}
	

	
	
}

	
	

