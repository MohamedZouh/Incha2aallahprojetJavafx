package Application1;
	
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;




public class LoginEtudiant extends Application {
	@Override
	public void start(Stage primaryStage) throws ClassNotFoundException, SQLException {
		try {
			
			
			
			primaryStage.setTitle("ElectroBib");
			BorderPane root = new BorderPane();
			VBox vb =new VBox();
			HBox hBox1 =new HBox();
			hBox1.setPadding(new Insets(15));
			Scene scene = new Scene(root,700,700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			FileInputStream fis =new FileInputStream("C:\\Users\\Mohamed Amine\\Documents\\IRISI\\S2_IRISI1_19_20\\JAVA\\Notreprojetjava\\LogoAppJava.png");
			Image logo =new Image(fis);
			ImageView Plogo =new ImageView(logo);
			Plogo.setFitWidth(70);
			Plogo.setFitHeight(70);
			Label lab1 =new Label("Bienvenu dans la bibliothèque universitaire marocain");
			lab1.setPadding(new Insets(15));
			hBox1.getChildren().addAll(Plogo,lab1);
			root.setTop(hBox1);
			Label lab2 =new Label("Vueillez choisissez votre catégorie");
			ComboBox cb1 =new ComboBox();
			cb1.getItems().addAll("Etudiant","Professeur","Administrateur");
			Button bt1 =new Button("valider");
			bt1.setPadding(new Insets(10));
			vb.getChildren().addAll(lab2,cb1,bt1);
			vb.setPadding(new Insets(200));
			vb.setSpacing(50);
			root.setCenter(vb);
			
			
			Stage ChoixTypeConnexion =new Stage();
			BorderPane CTCRoot = new BorderPane();
			VBox CTCVb =new VBox();
			HBox CTCHbox =new HBox();
			CTCHbox.setPadding(new Insets(15));
			Scene CTCScene =new Scene(CTCRoot,700,700);
			CTCScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			ChoixTypeConnexion.setScene(CTCScene);
			CTCHbox.getChildren().addAll(Plogo,lab1);
			CTCRoot.setTop(CTCHbox);
			Label CTClab1 =new Label("Vous n'avez pas encore un compte");
			Hyperlink CTCHl1 =new Hyperlink("Activer votre compte");
			Label CTClab2 =new Label("Votre compte déjà activé");
			Hyperlink CTCHl2 =new Hyperlink("Connecter vous");
			CTCVb.getChildren().addAll(CTClab1,CTCHl1,CTClab2,CTCHl2);
			CTCVb.setPadding(new Insets(200));
			CTCVb.setSpacing(50);
			CTCRoot.setCenter(CTCVb);

			
			
			
			Stage LogInStage =new Stage();
			LogInStage.setTitle("ElectroBib");
			BorderPane LogInRoot = new BorderPane();
			VBox LogInVb =new VBox();
			HBox LogInHBox1 =new HBox();
			LogInHBox1.setPadding(new Insets(15));
			Scene LogInScene = new Scene(LogInRoot,700,700);
			LogInScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			LogInStage.setScene(LogInScene);
			Hyperlink hl1= new Hyperlink("Créer un compte");
			LogInHBox1.getChildren().addAll(Plogo,lab1,hl1);
			LogInRoot.setTop(LogInHBox1);
			Label LogInlab =new Label("Connetez vous à votre compte");
			TextField tf1 =new TextField("Nom utilisateur");
			PasswordField tf2 =new PasswordField();
			Button bt =new Button("se connecter");
			bt1.setPadding(new Insets(10));
			LogInVb.getChildren().addAll(LogInlab,tf1,tf2,bt);
			LogInVb.setPadding(new Insets(200));
			LogInVb.setSpacing(50);
			LogInRoot.setCenter(LogInVb);
			
			
			Stage SignUpStage =new Stage();
			SignUpStage.setTitle("ElectroBib");
			BorderPane SignUpRoot = new BorderPane();
			VBox SignUpVb =new VBox();
			HBox SignUpHBox =new HBox();
			SignUpHBox.setPadding(new Insets(15));
			Scene SignUpScene = new Scene(SignUpRoot,700,700);
			SignUpScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			SignUpStage.setScene(SignUpScene);
			Hyperlink SUHl =new Hyperlink("Se connecter");
			SignUpHBox.getChildren().addAll(Plogo,lab1,SUHl);
			SignUpRoot.setTop(SignUpHBox);
			Label SUlab =new Label("Vueillez renseigner les informations suivantes pour qu'on puisse vous identifier");
			Label DescRes =new Label();
			Label fac =new Label("Faculté/Ecole");
			ComboBox cb2 =new ComboBox();
			cb2.getItems().addAll("FST");
			Label nom =new Label("Nom");
			TextField SUtf1 =new TextField();
			SUtf1.setMaxWidth(200);
			Label prenom =new Label("Prénom");
			TextField SUtf2 =new TextField();
			SUtf2.setMaxWidth(200);
			Label cne =new Label("CNE");
			TextField SUtf3 =new TextField();
			SUtf3.setMaxWidth(200);
			Button SUbt1 =new Button("valider");
			bt1.setPadding(new Insets(10));
			SignUpVb.getChildren().addAll(SUlab,DescRes,fac,cb2,nom,SUtf1,prenom,SUtf2,cne,SUtf3,SUbt1);
			SignUpVb.setPadding(new Insets(100));
			SignUpVb.setSpacing(10);
			SignUpRoot.setCenter(SignUpVb);
			
			
			
			Stage COStage =new Stage();
			COStage.setTitle("ElectroBib");
			BorderPane CORoot = new BorderPane();
			VBox COVb =new VBox();
			HBox COHBox =new HBox();
			COHBox.setPadding(new Insets(15));
			Scene COScene = new Scene(CORoot,700,700);
			COScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			COStage.setScene(COScene);
			COHBox.getChildren().addAll(Plogo,lab1);
			CORoot.setTop(COHBox);
			Label labelNomEtudiant =new Label();
			Label Information =new Label("Bienvenu vous êtes sur le point de terminer l'activationde votre compte");
			Label labelTache =new Label("veillez renseigner les informations qui restent");
			Label labelNomUtilisateur =new Label("Entrer le nom d'utilisateur");
			TextField TfNU =new TextField();
			Label labelpasswd =new Label("entrer le password");
			TextField TfPasswd =new TextField();
			TfPasswd.setMaxWidth(200);
			TfNU.setMaxWidth(200);
			Button BtVd =new Button("valider");
			COVb.getChildren().addAll(labelNomEtudiant,Information,labelTache,labelNomUtilisateur,TfNU,labelpasswd,TfPasswd);
			COVb.setPadding(new Insets(100));
			COVb.setSpacing(10);
			CORoot.setCenter(COVb);
			
			Stage EspaceEtudiantStage =new Stage();
			EspaceEtudiantStage.setTitle("ElectroBib");
			BorderPane EspEtdRoot =new BorderPane();
			VBox EspEtdVbox =new VBox();
			HBox EspEtdHbox =new HBox();
			EspEtdHbox.setPadding(new Insets(15));
			Scene EspEtdScene =new Scene(EspEtdRoot,700,700);
			EspEtdScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			EspaceEtudiantStage.setScene(EspEtdScene);
			Hyperlink DeconHl =new Hyperlink("Déconnexion");
			EspEtdHbox.getChildren().addAll(Plogo,lab1,DeconHl);
			EspEtdRoot.setTop(EspEtdHbox);
			Label ModLab =new Label("ci dessous la liste de modules de votre filière choisissez n'importe lequel pour accéder aux ressources disponible");
			
			
			
			
			
			
			primaryStage.show();
			
			
            	try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Connexion établie");
				} catch (ClassNotFoundException e2) {
					
					e2.printStackTrace();
				}
			
            	final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:330/electro_bib_data_base?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "MP*NASAINCHA2AALLAH");
            	final Statement statement =  con.createStatement();

			
			
			BtVd.setOnAction(e->{
				String RqInsertion="insert into electro_bib_data_base.utilisateur values("+TfNU.getText()+","+TfPasswd.getText()+")";
				try {
					ResultSet res1= statement.executeQuery(RqInsertion);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			});
			
		
			 
			 
	
             
  
			
				 
				
					
					
            SUbt1.setOnAction(e->{
	             String rq ="select * from electro_bib_data_base.etudiant where cne='"+ SUtf3.getText().trim()+"'";
				 ResultSet res = null;
				try {
					res = statement.executeQuery(rq);
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				

				
					try {
						if(res.next()) {
							if(res.getString("NomEtudiant").equalsIgnoreCase(SUtf1.getText()) && res.getString("PrenomEtudiant").equalsIgnoreCase(SUtf2.getText()) && res.getString("Etablissement").equalsIgnoreCase((String) cb2.getValue())){
								COStage.show();
								SignUpStage.hide();
								labelNomEtudiant.setText("L'étudiant "+res.getString("NomEtudiant")+" "+res.getString("PrenomEtudiant")+" de la filière "+res.getString("Filiere")+" "+res.getString("Etablissement"));
							}
							else {
								DescRes.setText("Vueillez s'assureez des informations entrés");
							}
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            });
            
            
            
	        
				
				
			
			bt.setOnAction(e->{
				
				String RqCon ="select * from electro_bib_data_base.utilisateur where username='"+tf1.getText()+"'";
				
	        ResultSet ResCon=null;
	     
				try {
					ResCon =statement.executeQuery(RqCon);
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					if(ResCon.next()) {
						if(ResCon.getString("passwd").equalsIgnoreCase(tf2.getText())){
					        
						}
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});		
					
			hl1.setOnAction(e->{
				LogInStage.hide();
				SignUpStage.show();
			});
			
			SUHl.setOnAction(e->{
				SignUpStage.hide();
				LogInStage.show();
			});
			
			bt1.setOnAction(e->{
				if (cb1.getValue()=="Etudiant") {
					ChoixTypeConnexion.show();
					primaryStage.hide();
				}	
			});
			
			CTCHl1.setOnAction(e->{
				SignUpStage.show();
				ChoixTypeConnexion.hide();
			});
			
			
			CTCHl2.setOnAction(e->{
				LogInStage.show();
				ChoixTypeConnexion.hide();
			});
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}	
		

			
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	
	
	
}

