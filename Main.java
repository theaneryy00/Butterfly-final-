package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	
	public static void main(String[] args) { 
		Application.launch(args);
		
		
}
	
	
	@Override
	public void start(Stage Stage)throws Exception{
		
		Group root = new Group();
		Scene scene = new Scene(root, Color.LAVENDER);
		
		Image icon = new Image("butterfly.png");
		Stage.getIcons().add(icon);
		Stage.setWidth(1024);
		Stage.setHeight(768);
		Stage.setResizable(false);

		Text text = new Text("butterfly");
		text.setFont(Font.font("quadaptor", FontWeight.BOLD, FontPosture.ITALIC, 60));
		text.setFill(Color.DARKBLUE);
		text.setX(400);
		text.setY(70);
		
		Text text2 = new Text("A girl who's still learning to fly");
		text2.setFont(Font.font("quadaptor",  FontPosture.ITALIC, 20));
		text2.setFill(Color.DARKBLUE);
		text2.setX(390);
		text2.setY(710);
		
		Text text3 = new Text("butterfly");
		text3.setFont(Font.font("quadaptor", FontWeight.BOLD, FontPosture.ITALIC, 45));
		text3.setFill(Color.DARKBLUE);
		text3.setX(430);
		text3.setY(675);
		
		// wings
		
		//left wing
		
		//top part
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(
				281.0, 294.0,
				375.0, 100.0,
				492.0, 331.0
				);
		triangle.setFill(Color.DARKBLUE);
		
		Ellipse ellipsel = new Ellipse();
		ellipsel.setCenterX(334.0);
		ellipsel.setCenterY(145.78);
		ellipsel.setRadiusX(66);
		ellipsel.setRadiusY(60);
		ellipsel.setFill(Color.DARKBLUE);
		ellipsel.setRotate(45);
		
		Ellipse ellipsel2 = new Ellipse();
		ellipsel2.setCenterX(290.89 );
		ellipsel2.setCenterY(235.56 );
		ellipsel2.setRadiusX(65);
		ellipsel2.setRadiusY(59);
		ellipsel2.setFill(Color.DARKBLUE);
		
		//lower part
		Polygon triangle2 = new Polygon();
		triangle2.getPoints().setAll(
				233.0, 453.0,
				415.0, 576.0,
				492.0, 331.0
				);
		triangle2.setFill(Color.DARKBLUE);
		
		Ellipse ellipsel3 = new Ellipse();
		ellipsel3.setCenterX(749.41);
		ellipsel3.setCenterY(503.52);
		ellipsel3.setRadiusX(65);
		ellipsel3.setRadiusY(59);
		ellipsel3.setFill(Color.DARKBLUE);
		
		Ellipse ellipsel4 = new Ellipse();    // wrong
		ellipsel4.setCenterX(350.41);  //
		ellipsel4.setCenterY(566.52);  //
		ellipsel4.setRadiusX(65);
		ellipsel4.setRadiusY(59);
		ellipsel4.setFill(Color.DARKBLUE);
				
		
		
		
		// right wing
		
		// TOP PART
		Polygon triangle3 = new Polygon();
		triangle3.getPoints().setAll(
				524.0, 331.0,
				640.0, 100.0,
				722.0, 294.0
				);
		triangle3.setFill(Color.DARKBLUE);
		
		Ellipse ellipser = new Ellipse();
		ellipser.setCenterX(688.0);
		ellipser.setCenterY(145.78);
		ellipser.setRadiusX(66);
		ellipser.setRadiusY(60);
		ellipser.setFill(Color.DARKBLUE);
		ellipser.setRotate(45);
		
		Ellipse ellipser2 = new Ellipse();  
		ellipser2.setCenterX(715.31);
		ellipser2.setCenterY(235.14);
		ellipser2.setRadiusX(65);
		ellipser2.setRadiusY(59);
		ellipser2.setFill(Color.DARKBLUE);
		
		
		// LOWER PART
		
		Polygon triangle4 = new Polygon();
		triangle4.getPoints().setAll(
				600.0, 576.0,
				772.0, 448.0,
				524.0, 331.0
				);
		triangle4.setFill(Color.DARKBLUE);
		
		Ellipse ellipser3 = new Ellipse();
		ellipser3.setCenterX(265.41);
		ellipser3.setCenterY(504.52);
		ellipser3.setRadiusX(65);
		ellipser3.setRadiusY(59);
		ellipser3.setFill(Color.DARKBLUE);
		
		Ellipse ellipser4 = new Ellipse(); 
		ellipser4.setCenterX(661.41); 
		ellipser4.setCenterY(561.52); 
		ellipser4.setRadiusX(65);
		ellipser4.setRadiusY(59);
		ellipser4.setFill(Color.DARKBLUE);
		
	
		
		
		//Second layer
		
		//LEFT WING
		//top part
				Polygon trianglelightblueL = new Polygon();
				trianglelightblueL.getPoints().setAll(
						306.50, 288.50,
						480.50, 320.50,
						380.50, 135.50 //-10 to x  -34 to y  (395.50, 169.50)
						);
				trianglelightblueL.setFill(Color.SKYBLUE);
				
				Ellipse ellipselightblueL = new Ellipse();
				ellipselightblueL.setCenterX(335.10); //(+1.10)
				ellipselightblueL.setCenterY(150.32); //(+4.54) 
				ellipselightblueL.setRadiusX(61); //(-5)
				ellipselightblueL.setRadiusY(55); //(-5)
				ellipselightblueL.setFill(Color.SKYBLUE);
				ellipselightblueL.setRotate(45);
			
				Ellipse ellipselightblueL2 = new Ellipse();
				ellipselightblueL2.setCenterX(298.89); //-10  
				ellipselightblueL2.setCenterY(237.18); //-15
				ellipselightblueL2.setRadiusX(65);
				ellipselightblueL2.setRadiusY(54); //-5
				ellipselightblueL2.setFill(Color.SKYBLUE);
				
		//lowerpart
				Polygon trianglelowSkyblueL = new Polygon();
				trianglelowSkyblueL.getPoints().setAll(
						239.0, 465.0,
						404.0, 575.0,
						482.0, 341.0
						);
				trianglelowSkyblueL.setFill(Color.SKYBLUE);
				
				Ellipse ellipselowskyBlueL = new Ellipse();
				ellipselowskyBlueL.setCenterX(265.41); // right
				ellipselowskyBlueL.setCenterY(504.52);
				ellipselowskyBlueL.setRadiusX(55);
				ellipselowskyBlueL.setRadiusY(49);
				ellipselowskyBlueL.setFill(Color.SKYBLUE);
				
				Ellipse ellipselowskyBlueL2 = new Ellipse();
				ellipselowskyBlueL2.setCenterX(351.41);
				ellipselowskyBlueL2.setCenterY(563.52);
				ellipselowskyBlueL2.setRadiusX(60);
				ellipselowskyBlueL2.setRadiusY(54);
				ellipselowskyBlueL2.setFill(Color.SKYBLUE);
				

				
		// RIGHT WING
		
		// TOP PART
				Polygon triangletopskyBlueR = new Polygon();
				triangletopskyBlueR.getPoints().setAll(
						538.0, 320.0,
						635.0, 128.0,
						719.0, 284.0
						);
				triangletopskyBlueR.setFill(Color.SKYBLUE);
				
				Ellipse ellipsetopskyBlueR = new Ellipse();
				ellipsetopskyBlueR.setCenterX(688.0);
				ellipsetopskyBlueR.setCenterY(145.78);
				ellipsetopskyBlueR.setRadiusX(60);
				ellipsetopskyBlueR.setRadiusY(54);
				ellipsetopskyBlueR.setFill(Color.SKYBLUE);
				ellipsetopskyBlueR.setRotate(45);
				
				Ellipse ellipsetopskyBlueR2 = new Ellipse();  
				ellipsetopskyBlueR2.setCenterX(715.31);
				ellipsetopskyBlueR2.setCenterY(235.14);
				ellipsetopskyBlueR2.setRadiusX(58);
				ellipsetopskyBlueR2.setRadiusY(50);
				ellipsetopskyBlueR2.setFill(Color.SKYBLUE);

				
		// LOWER PART
				Polygon trianglelowskyBlueR = new Polygon();
				trianglelowskyBlueR.getPoints().setAll(
						615.0, 585.0,
						780.0, 460.0,
						533.0, 343.0
						);
				trianglelowskyBlueR.setFill(Color.SKYBLUE);
				
				Ellipse ellipselowskyBlueR = new Ellipse();
				ellipselowskyBlueR.setCenterX(751.41);
				ellipselowskyBlueR.setCenterY(502.52);
				ellipselowskyBlueR.setRadiusX(55);
				ellipselowskyBlueR.setRadiusY(54);
				ellipselowskyBlueR.setFill(Color.SKYBLUE);
				
				Ellipse ellipselowskyBlueR2 = new Ellipse(); 
				ellipselowskyBlueR2.setCenterX(661.41); 
				ellipselowskyBlueR2.setCenterY(561.52); 
				ellipselowskyBlueR2.setRadiusX(57);
				ellipselowskyBlueR2.setRadiusY(54);
				ellipselowskyBlueR2.setFill(Color.SKYBLUE);
			
		
		// THIRD LAYER
				
				//LEFT WING
				
				//UPPER PART
				Polygon triangleyellowgreenL = new Polygon();
				triangleyellowgreenL.getPoints().setAll(
						326.50, 283.50, //(-5 to y) (+10 to x)
						470.50, 312.50, // (-10 to x (-8 to y))
						395.50, 183.50 // (+14)
						);
				triangleyellowgreenL.setFill(Color.GREENYELLOW);
				
				Ellipse ellipseyellowgreenL = new Ellipse();
				ellipseyellowgreenL.setCenterX(336.10); //(+1.10)
				ellipseyellowgreenL.setCenterY(154.86); //(+4.54) 
				ellipseyellowgreenL.setRadiusX(56); //(-5)
				ellipseyellowgreenL.setRadiusY(50); //(-5)
				ellipseyellowgreenL.setFill(Color.GREENYELLOW);
				ellipseyellowgreenL.setRotate(45);
				
				Ellipse ellipseyellowgreenL2 = new Ellipse();
				ellipseyellowgreenL2.setCenterX(293.89); //-5
				ellipseyellowgreenL2.setCenterY(237.18); 
				ellipseyellowgreenL2.setRadiusX(53); // -12
				ellipseyellowgreenL2.setRadiusY(49); //-5
				ellipseyellowgreenL2.setFill(Color.GREENYELLOW);
				
				// LOWER PART
				
				Polygon trianglelowSkyblueL3rd = new Polygon();
				trianglelowSkyblueL3rd.getPoints().setAll(
						285.0, 450.0,
						403.0, 539.0,
						475.0, 349.0
						);
				trianglelowSkyblueL3rd.setFill(Color.GREENYELLOW);
				
				Ellipse ellipseyellowGreenL3rd = new Ellipse();
				ellipseyellowGreenL3rd.setCenterX(265.41);
				ellipseyellowGreenL3rd.setCenterY(504.52);
				ellipseyellowGreenL3rd.setRadiusX(50);
				ellipseyellowGreenL3rd.setRadiusY(44);
				ellipseyellowGreenL3rd.setFill(Color.GREENYELLOW);
				
				Ellipse ellipseyellowGreenL3rd2 = new Ellipse();
				ellipseyellowGreenL3rd2.setCenterX(349.41);
				ellipseyellowGreenL3rd2.setCenterY(565.52);
				ellipseyellowGreenL3rd2.setRadiusX(53);
				ellipseyellowGreenL3rd2.setRadiusY(46);
				ellipseyellowGreenL3rd2.setFill(Color.GREENYELLOW);
			
				// RIGHT WING
				
				// TOP PART
				
				Polygon triangletopyeltopgreenR = new Polygon();
				triangletopyeltopgreenR.getPoints().setAll(
						550.0, 310.0,
						620.0, 170.0,
						690.0, 284.0
						);
				triangletopyeltopgreenR.setFill(Color.GREENYELLOW);
				
				Ellipse ellipsetopyeltopgreenR = new Ellipse();
				ellipsetopyeltopgreenR.setCenterX(688.0);
				ellipsetopyeltopgreenR.setCenterY(145.78);
				ellipsetopyeltopgreenR.setRadiusX(55);
				ellipsetopyeltopgreenR.setRadiusY(49);
				ellipsetopyeltopgreenR.setFill(Color.GREENYELLOW);
				ellipsetopyeltopgreenR.setRotate(45);
				
				Ellipse ellipsetopyeltopgreenR2 = new Ellipse();  
				ellipsetopyeltopgreenR2.setCenterX(720.31);
				ellipsetopyeltopgreenR2.setCenterY(235.14);
				ellipsetopyeltopgreenR2.setRadiusX(48);
				ellipsetopyeltopgreenR2.setRadiusY(45);
				ellipsetopyeltopgreenR2.setFill(Color.GREENYELLOW);
				
				
				// LOWER PART
				
				Polygon trianglelowyellowGreenR = new Polygon();
				trianglelowyellowGreenR.getPoints().setAll(
						610.0, 525.0,
						735.0, 450.0,
						540.0, 351.0
						);
				trianglelowyellowGreenR.setFill(Color.GREENYELLOW);
				
				Ellipse ellipselowyellowGreenR = new Ellipse();
				ellipselowyellowGreenR.setCenterX(751.41);
				ellipselowyellowGreenR.setCenterY(502.52);
				ellipselowyellowGreenR.setRadiusX(50);
				ellipselowyellowGreenR.setRadiusY(49);
				ellipselowyellowGreenR.setFill(Color.GREENYELLOW);
				
				Ellipse ellipselowyellowGreenR2 = new Ellipse(); 
				ellipselowyellowGreenR2.setCenterX(661.41); 
				ellipselowyellowGreenR2.setCenterY(561.52); 
				ellipselowyellowGreenR2.setRadiusX(52);
				ellipselowyellowGreenR2.setRadiusY(49);
				ellipselowyellowGreenR2.setFill(Color.GREENYELLOW);
			
				
		// FORTH LAYER
				
				// left wing
				
				// top
				Polygon triangleorangeL = new Polygon();
				triangleorangeL.getPoints().setAll(
						336.50, 278.50, //(-5 to y) (+10 to x)
						460.50, 304.50, // (-10 to x (-8 to y))
						395.50, 193.50 // (+14 to y)
						);
				triangleorangeL.setFill(Color.ORANGE);
				
				Ellipse ellipseorangeL = new Ellipse();
				ellipseorangeL.setCenterX(337.10); //(+1.10)
				ellipseorangeL.setCenterY(157.4); //(+4.54) 
				ellipseorangeL.setRadiusX(51); //(-5)
				ellipseorangeL.setRadiusY(45); //(-5)
				ellipseorangeL.setFill(Color.ORANGE);
				ellipseorangeL.setRotate(45);
				
				Ellipse ellipseorangeL2 = new Ellipse();
				ellipseorangeL2.setCenterX(295.89); //-5
				ellipseorangeL2.setCenterY(237.18); 
				ellipseorangeL2.setRadiusX(45); // -12
				ellipseorangeL2.setRadiusY(44); //-5
				ellipseorangeL2.setFill(Color.ORANGE);
				
				//lower
				
				Polygon trianglelowOrangeL4th= new Polygon();
				trianglelowOrangeL4th.getPoints().setAll(
						300.0, 450.0, // + 15 to x
						398.0, 525.0, // + 5 to x   + 14 to y
						465.0, 360.0  // - 10 to x  +11
						);
				trianglelowOrangeL4th.setFill(Color.ORANGE);
				
				Ellipse ellipseOrangeL4th = new Ellipse();
				ellipseOrangeL4th.setCenterX(265.41);
				ellipseOrangeL4th.setCenterY(504.52);
				ellipseOrangeL4th.setRadiusX(45);
				ellipseOrangeL4th.setRadiusY(39);
				ellipseOrangeL4th.setFill(Color.ORANGE);
				
				Ellipse ellipseOrangeL4th2 = new Ellipse();
				ellipseOrangeL4th2.setCenterX(349.41);
				ellipseOrangeL4th2.setCenterY(565.52);
				ellipseOrangeL4th2.setRadiusX(48);
				ellipseOrangeL4th2.setRadiusY(41);
				ellipseOrangeL4th2.setFill(Color.ORANGE);
				
				// right
				
				//upper
				
				Polygon triangletoptoporangeR = new Polygon();
				triangletoptoporangeR.getPoints().setAll(
						560.0, 300.0,
						620.0, 188.0,
						680.0, 279.0
						);
				triangletoptoporangeR.setFill(Color.ORANGE);
				
				Ellipse ellipsetoporangeR = new Ellipse();
				ellipsetoporangeR.setCenterX(688.0);
				ellipsetoporangeR.setCenterY(145.78);
				ellipsetoporangeR.setRadiusX(50);
				ellipsetoporangeR.setRadiusY(44);
				ellipsetoporangeR.setFill(Color.ORANGE);
				ellipsetoporangeR.setRotate(45);
				
				Ellipse ellipsetoporangeR2 = new Ellipse();  
				ellipsetoporangeR2.setCenterX(720.31);
				ellipsetoporangeR2.setCenterY(235.14);
				ellipsetoporangeR2.setRadiusX(43);
				ellipsetoporangeR2.setRadiusY(40);
				ellipsetoporangeR2.setFill(Color.ORANGE);
				
				// lower
				
				Polygon tiranglelowOrangeR = new Polygon();
				tiranglelowOrangeR.getPoints().setAll(
						615.0, 510.0,
						723.0, 450.0,
						550.0, 361.0
						);
				tiranglelowOrangeR.setFill(Color.ORANGE);
				
				Ellipse ellipselowOrangeR = new Ellipse();
				ellipselowOrangeR.setCenterX(751.41);
				ellipselowOrangeR.setCenterY(502.52);
				ellipselowOrangeR.setRadiusX(45);
				ellipselowOrangeR.setRadiusY(44);
				ellipselowOrangeR.setFill(Color.ORANGE);
				
				Ellipse ellipselowOrangeR2 = new Ellipse(); 
				ellipselowOrangeR2.setCenterX(661.41); 
				ellipselowOrangeR2.setCenterY(561.52); 
				ellipselowOrangeR2.setRadiusX(49);
				ellipselowOrangeR2.setRadiusY(44);
				ellipselowOrangeR2.setFill(Color.ORANGE);
				
		// FIFTH LAYER
				//left
				// upper
				Polygon triangleyellowL = new Polygon();
				triangleyellowL.getPoints().setAll(
						346.50, 273.50, //(-5 to y) (+10 to x)
						450.50, 296.50, // (-10 to x (-8 to y))
						395.50, 207.50 // (+14 to y)
						);
				triangleyellowL.setFill(Color.YELLOW);
				
				
				Ellipse ellipseyellowL = new Ellipse();
				ellipseyellowL.setCenterX(338.10); //(+1.10)
				ellipseyellowL.setCenterY(158.94); //(+4.54) 
				ellipseyellowL.setRadiusX(46); //(-5)
				ellipseyellowL.setRadiusY(40); //(-5)
				ellipseyellowL.setFill(Color.YELLOW);
				ellipseyellowL.setRotate(45);
				
				Ellipse ellipseyellowL2 = new Ellipse();
				ellipseyellowL2.setCenterX(295.89); //-5
				ellipseyellowL2.setCenterY(237.18); 
				ellipseyellowL2.setRadiusX(40); // -12
				ellipseyellowL2.setRadiusY(39); //-5
				ellipseyellowL2.setFill(Color.YELLOW);
				
				// lower
				
				Polygon trianglelowyellowL5th= new Polygon();
				trianglelowyellowL5th.getPoints().setAll(
						315.0, 450.0, // + 15 to x
						395.0, 513.0, // + 5 to x   + 14 to y
						455.0, 371.0  // - 10 to x  +11
						);
				trianglelowyellowL5th.setFill(Color.YELLOW);
				
				Ellipse ellipselowyellowL5th = new Ellipse();
				ellipselowyellowL5th.setCenterX(265.41);
				ellipselowyellowL5th.setCenterY(504.52);
				ellipselowyellowL5th.setRadiusX(40);
				ellipselowyellowL5th.setRadiusY(34);
				ellipselowyellowL5th.setFill(Color.YELLOW);
				
				Ellipse ellipselowyellowL5th2 = new Ellipse();
				ellipselowyellowL5th2.setCenterX(349.41);
				ellipselowyellowL5th2.setCenterY(565.52);
				ellipselowyellowL5th2.setRadiusX(43);
				ellipselowyellowL5th2.setRadiusY(36);
				ellipselowyellowL5th2.setFill(Color.YELLOW);
				
				//right
				
				//upper
				
				Polygon triangletopyellowR = new Polygon();
				triangletopyellowR.getPoints().setAll(
						570.0, 290.0,
						620.0, 198.0,
						670.0, 275.0
						);
				triangletopyellowR.setFill(Color.YELLOW);
				
				Ellipse ellipsetopyellowR = new Ellipse();
				ellipsetopyellowR.setCenterX(688.0);
				ellipsetopyellowR.setCenterY(145.78);
				ellipsetopyellowR.setRadiusX(45);
				ellipsetopyellowR.setRadiusY(39);
				ellipsetopyellowR.setFill(Color.YELLOW);
				ellipsetopyellowR.setRotate(45);
				
				Ellipse ellipsetopyellowR2 = new Ellipse();  
				ellipsetopyellowR2.setCenterX(720.31);
				ellipsetopyellowR2.setCenterY(235.14);
				ellipsetopyellowR2.setRadiusX(38);
				ellipsetopyellowR2.setRadiusY(35);
				ellipsetopyellowR2.setFill(Color.YELLOW);
		
		
				// lower
				
				Polygon triangleloyellowR = new Polygon();
				triangleloyellowR.getPoints().setAll(
						618.0, 503.0,
						715.0, 450.0,
						560.0, 371.0
						);
				triangleloyellowR.setFill(Color.YELLOW);
				
				Ellipse ellipseloyellowR = new Ellipse();
				ellipseloyellowR.setCenterX(751.41);
				ellipseloyellowR.setCenterY(502.52);
				ellipseloyellowR.setRadiusX(40);
				ellipseloyellowR.setRadiusY(39);
				ellipseloyellowR.setFill(Color.YELLOW);
				
				Ellipse ellipseloyellowR2 = new Ellipse(); 
				ellipseloyellowR2.setCenterX(661.41); 
				ellipseloyellowR2.setCenterY(561.52); 
				ellipseloyellowR2.setRadiusX(44);
				ellipseloyellowR2.setRadiusY(39);
				ellipseloyellowR2.setFill(Color.YELLOW);
				
				//body
				Ellipse ellipseb = new Ellipse(); 
				ellipseb.setCenterX(507.50);
				ellipseb.setCenterY(352.50);
				ellipseb.setRadiusX(23);
				ellipseb.setRadiusY(50);
				ellipseb.setFill(Color.DARKBLUE);
				
				//body
				Ellipse ellipseb2 = new Ellipse(); 
				ellipseb2.setCenterX(507.50);
				ellipseb2.setCenterY(352.50);
				ellipseb2.setRadiusX(18);
				ellipseb2.setRadiusY(45);
				ellipseb2.setFill(Color.SKYBLUE);
				
				Ellipse ellipseb3 = new Ellipse(); 
				ellipseb3.setCenterX(507.50);
				ellipseb3.setCenterY(352.50);
				ellipseb3.setRadiusX(13);
				ellipseb3.setRadiusY(40);
				ellipseb3.setFill(Color.GREENYELLOW);
				
				Ellipse ellipseb4 = new Ellipse(); 
				ellipseb4.setCenterX(507.50);
				ellipseb4.setCenterY(352.50);
				ellipseb4.setRadiusX(8);
				ellipseb4.setRadiusY(35);
				ellipseb4.setFill(Color.GREENYELLOW);
		
		// first layer
		root.getChildren().add(text);
		root.getChildren().add(text2);
		root.getChildren().add(text3);
		root.getChildren().add(triangle);
		root.getChildren().add(triangle2);
		root.getChildren().add(triangle3);
		root.getChildren().add(triangle4);
		root.getChildren().add(ellipsel);
		root.getChildren().add(ellipsel2);
		root.getChildren().add(ellipsel3);
		root.getChildren().add(ellipsel4);
		root.getChildren().add(ellipser);
		root.getChildren().add(ellipser2);
		root.getChildren().add(ellipser3);
		root.getChildren().add(ellipser4);
		root.getChildren().add(ellipseb);
		root.getChildren().add(ellipseb2);
		root.getChildren().add(ellipseb3);
		root.getChildren().add(ellipseb4);
		
		//second layer
		
		//LEFT PART
		root.getChildren().add(trianglelightblueL);
		root.getChildren().add(ellipselightblueL);
		root.getChildren().add(ellipselightblueL2);
		
		root.getChildren().add(trianglelowSkyblueL);
		root.getChildren().add(ellipselowskyBlueL); 
		root.getChildren().add(ellipselowskyBlueL2);
		
		// RIGHT PART
		root.getChildren().add(triangletopskyBlueR); 
		root.getChildren().add(ellipsetopskyBlueR); 
		root.getChildren().add(ellipsetopskyBlueR2);
		
		root.getChildren().add(trianglelowskyBlueR); 
		root.getChildren().add(ellipselowskyBlueR);
		root.getChildren().add(ellipselowskyBlueR2);
		
		
		// THIRD LAYER
		// left
		root.getChildren().add(triangleyellowgreenL);
		root.getChildren().add(ellipseyellowgreenL);
		root.getChildren().add(ellipseyellowgreenL2); 
		
		root.getChildren().add(trianglelowSkyblueL3rd);
		root.getChildren().add(ellipseyellowGreenL3rd);
		root.getChildren().add( ellipseyellowGreenL3rd2);
		
		//right
		// top
		
		root.getChildren().add(triangletopyeltopgreenR);
		root.getChildren().add(ellipsetopyeltopgreenR);
		root.getChildren().add(ellipsetopyeltopgreenR2);
		
		
		//low part
		
		root.getChildren().add(trianglelowyellowGreenR);
		root.getChildren().add(ellipselowyellowGreenR);
		root.getChildren().add(ellipselowyellowGreenR2);
		
		
		//FORTH
		// left
		
		//upper
		root.getChildren().add(triangleorangeL);
		root.getChildren().add(ellipseorangeL);
		root.getChildren().add(ellipseorangeL2); 
		
		//lower
		root.getChildren().add(trianglelowOrangeL4th);  
		root.getChildren().add(ellipseOrangeL4th); 
		root.getChildren().add(ellipseOrangeL4th2);
		
		//right
		
		// upper
		
		root.getChildren().add(triangletoptoporangeR);
		root.getChildren().add(ellipsetoporangeR);
		root.getChildren().add(ellipsetoporangeR2);
	
		// lower
		
		root.getChildren().add(tiranglelowOrangeR);
		root.getChildren().add(ellipselowOrangeR);
		root.getChildren().add(ellipselowOrangeR2);
		
		//FIFTH
		
		//left
		
		//top
		root.getChildren().add(triangleyellowL);
		root.getChildren().add(ellipseyellowL);
		root.getChildren().add(ellipseyellowL2); 
		
		
		// lower
		root.getChildren().add(trianglelowyellowL5th); 
		root.getChildren().add(ellipselowyellowL5th);
		root.getChildren().add( ellipselowyellowL5th2);
		
		//right
		
		// top
		root.getChildren().add(triangletopyellowR);
		root.getChildren().add(ellipsetopyellowR);
		root.getChildren().add(ellipsetopyellowR2);
		
		// lower
		
		root.getChildren().add(triangleloyellowR);
		root.getChildren().add(ellipseloyellowR);
		root.getChildren().add(ellipseloyellowR2);
		
		Stage.setTitle("Nery, Thea Andrea");
		Stage.setScene(scene);
		Stage.show();
		
	}
}

