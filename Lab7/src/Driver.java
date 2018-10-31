import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Driver extends Application {
	TextField txt;
	Text text1;
	ImageView myImageView;
	int x = 0, y = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	}

	@Override
	public void start(Stage PrimaryStage) throws Exception {
		// TODO Auto-generated method stub
		Text text = new Text("WELCOME TO MY GAME");
		text.setFont(Font.font(40));
		text.setLayoutX(35);
		text.setLayoutY(100);
		
		txt = new TextField("ENTER YOUR NAME");
		txt.setLayoutX(175);
		txt.setLayoutY(350);
		
		Button button = new Button("START GAME");
		button.setLayoutX(200);
		button.setLayoutY(250);
		button.setOnAction(this::startGame);
		
		
		
		
		Group root = new Group(text,button,txt);
		Scene scene = new Scene(root,500,500,Color.WHITE);
		PrimaryStage.setTitle("Game");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
	}
	
	public void startGame(ActionEvent args) {
		
		Image image1 = new Image("file:src/hero.png");
		myImageView = new ImageView(image1);
		myImageView.setFitWidth(50);
		myImageView.setFitHeight(50);
		myImageView.setX(x);
		myImageView.setY(y);
		
		int itemCollected = 0;
		String name = txt.getText();
		
		playerOne pOne = new playerOne(name,itemCollected);
		
		
		text1 = new Text();
		text1.setText(pOne.getPlayerName());
		
		
		Group root2 = new Group(myImageView,text1);
		Scene scene2 = new Scene(root2,500,500,Color.WHITE);
		scene2.setOnKeyPressed(this::listenUp);
		Stage SecondaryStage = new Stage();
		SecondaryStage.setScene(scene2);
		SecondaryStage.show();
	}
	
	public void listenUp(KeyEvent event)
	{
		KeyCode myCode = event.getCode();
		
		if(myCode == KeyCode.A)
		{
			x-=10;
			
			
		}
		else if(myCode == KeyCode.D)
		{
			x+=10;
			
		}
		else if(myCode == KeyCode.S)
		{
			y+=10;
			
			
		}
		else if(myCode == KeyCode.W)
		{
			y-=10;
			
		
		}
	

		myImageView.setX(x);
		myImageView.setY(y);
		text1.setX(x);
		text1.setY(y);
		
		
	}
	
	

}
