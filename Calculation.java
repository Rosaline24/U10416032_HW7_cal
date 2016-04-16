import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;



public class Calculation extends Application {
	
	String display = "";
 	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage) {
		
		
		FlowPane pane = new FlowPane();
		FlowPane p1 = new FlowPane();
		GridPane p2 = new GridPane();
		
		p2.setVgap(2);
		p2.setHgap(2);
		
		TextField result = new TextField("0");
		result.setEditable(false);
		result.setPrefWidth(260);
		
		//Set buttons
		Button mc = new Button("MC");
		mc.setPrefSize(50,50);
		Button mr = new Button("MR");
		mr.setPrefSize(50,50);
		Button ms = new Button("MS");
		ms.setPrefSize(50,50);
		Button mp = new Button("M+");
		mp.setPrefSize(50,50);
		Button mm = new Button("M-");
		mm.setPrefSize(50,50);

		Button back = new Button("<--");
		back.setPrefSize(50,50);
		Button ce = new Button("CE");
		ce.setPrefSize(50,50);
		ce.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				display = "0";
				result.setText(display);
			}
		});
		Button c = new Button("C");
		c.setPrefSize(50,50);
		c.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				display = "0";
				result.setText(display);
			}
		});
		Button bpm = new Button("+-");
		bpm.setPrefSize(50,50);
		Button sqrt = new Button("sqrt");
		sqrt.setPrefSize(50,50);		
		
		Button seven = new Button("7");
		seven.setPrefSize(50,50);
		seven.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				display = "7";
				result.setText(result.getText()+display);
			}
		});
		
		Button eight = new Button("8");
		eight.setPrefSize(50,50);
			eight.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "8";
				result.setText(result.getText()+display);
			}
		});
		Button nine = new Button("9");
		nine.setPrefSize(50,50);
			nine.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "9";
				result.setText(result.getText()+display);
			}
		});
		Button bd = new Button("/");
		bd.setPrefSize(50,50);
		Button bm = new Button("%");
		bm.setPrefSize(50,50);
		
		
		Button four = new Button("4");
		four.setPrefSize(50,50);
			four.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "4";
				result.setText(result.getText()+display);
			}
		});
		Button five = new Button("5");
		five.setPrefSize(50,50);
			five.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "5";
				result.setText(result.getText()+display);
			}
		});
		Button six = new Button("6");
		six.setPrefSize(50,50);
			six.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "6";
				result.setText(result.getText()+display);
			}
		});
		Button bmul = new Button("*");
		bmul.setPrefSize(50,50);
		Button bo = new Button("1/x");
		bo.setPrefSize(50,50);

		
		Button one = new Button("1");
		one.setPrefSize(50,50);
			one.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "1";
				result.setText(result.getText()+display);
			}
		});
		Button two = new Button("2");
		two.setPrefSize(50,50);
			two.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "2";
				result.setText(result.getText()+display);
			}
		});
		Button three = new Button("3");
		three.setPrefSize(50,50);
			three.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "3";
				result.setText(result.getText()+display);
			}
		});
		Button bmin = new Button("-");
		bm.setPrefSize(50,50);
			bmin.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "-";
				result.setText(result.getText()+display);
			}
		});
		
		Button zero = new Button("0");
		zero.setPrefSize(100,50);
			zero.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "0";
				result.setText(result.getText()+display);
			}
		});
		Button bdot = new Button(".");
		bdot.setPrefSize(50,50);
			bdot.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = ".";
				result.setText(result.getText()+display);
			}
		});
		Button bp = new Button("+");
		bp.setPrefSize(50,50);
			bp.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event){
				display = "+";
				result.setText(result.getText()+display);
			}
		});
		Button be = new Button("=");
		be.setPrefSize(50,100);
		
		p1.getChildren().addAll(result);

		//add buttons on the pane2
		p2.add(mc , 0,0);
		p2.add(mr , 1,0);
		p2.add(ms , 2,0);
		p2.add(mp , 3,0);
		p2.add(mm , 4,0);
		
		p2.add(back , 0,1);
		p2.add(ce , 1,1);
		p2.add(c , 2,1);
		p2.add(bpm , 3,1);
		p2.add(sqrt , 4,1);
		
		p2.add(seven , 0,2);
		p2.add(eight , 1,2);
		p2.add(nine , 2,2);
		p2.add(bd , 3,2);
		p2.add(bm , 4,2);
		
		p2.add(four , 0,3);
		p2.add(five, 1,3);
		p2.add(six , 2,3);
		p2.add(bmul , 3,3);
		p2.add(bo , 4,3);

		p2.add(one , 0,4);
		p2.add(two, 1,4);
		p2.add(three , 2,4);
		p2.add(bmin , 3,4);
		
		p2.add(zero , 0,5,2 ,1);
		p2.add(bdot , 2,5);
		p2.add(bp ,3,5);
		p2.add(be , 4 , 4 ,1 ,2);
		
		
		MenuBar mb = new MenuBar();
		
		Menu item1 = new Menu("View");
		MenuItem it1 = new MenuItem("1");
		MenuItem it2 = new MenuItem("2");
		
		item1.getItems().addAll(it1 , it2);
		
		Menu item2 = new Menu("Edit");
		MenuItem it3 = new MenuItem("3");
		MenuItem it4 = new MenuItem("4");
		item2.getItems().addAll(it3 , it4);
		
		Menu item3 = new Menu("Illustrate");
		MenuItem it5 = new MenuItem("5");
		MenuItem it6 = new MenuItem("6");
		item3.getItems().addAll(it5 , it6);

		//add the function to menu bar		
		mb.getMenus().addAll(item1 , item2 , item3);
		pane.getChildren().addAll(mb);		
		pane.getChildren().addAll(p1 , p2);


		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 260, 360);
		// Set title
		primaryStage.setTitle("Calculator");
		// Place the scene in the stage
		primaryStage.setScene(scene); 
		// Display the stage
		primaryStage.show(); 

	}
}

