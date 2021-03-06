package Application1;
	
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
import DBConnection.DBHandler;




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
			Label lab1 =new Label("Bienvenu dans la biblioth�que universitaire marocain");
			lab1.setPadding(new Insets(15));
			hBox1.getChildren().addAll(Plogo,lab1);
			root.setTop(hBox1);
			Label lab2 =new Label("Vueillez choisissez votre cat�gorie");
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
			Label CTClab2 =new Label("Votre compte d�j� activ�");
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
			Hyperlink hl1= new Hyperlink("Cr�er un compte");
			LogInHBox1.getChildren().addAll(Plogo,lab1,hl1);
			LogInRoot.setTop(LogInHBox1);
			Label InfLab =new Label();
			Label LogInlab =new Label("entrer votre CNE");
			TextField tf1 =new TextField();
			Label PassWdLab =new Label("entrer votre mot de passe");
			PasswordField tf2 =new PasswordField();
			Button bt =new Button("se connecter");
			bt1.setPadding(new Insets(10));
			LogInVb.getChildren().addAll(InfLab,LogInlab,tf1,PassWdLab,tf2,bt);
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
			Label fac =new Label("Facult�/Ecole");
			ComboBox cb2 =new ComboBox();
			cb2.getItems().addAll("FST");
			Label nom =new Label("Nom");
			TextField SUtf1 =new TextField();
			SUtf1.setMaxWidth(200);
			Label prenom =new Label("Pr�nom");
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
			Label Information =new Label("Bienvenu vous �tes sur le point de terminer l'activationde votre compte");
			Label labelTache =new Label("veillez vueillez donner un mot de passe pour les connexions ult�rieurs");
			PasswordField TfPasswd =new PasswordField();
			TfPasswd.setMaxWidth(200);
			Button BtVd =new Button("valider");
			COVb.getChildren().addAll(labelNomEtudiant,Information,labelTache,TfPasswd,BtVd);
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
			Hyperlink DeconHl =new Hyperlink("D�connexion");
			EspEtdHbox.getChildren().addAll(Plogo,lab1,DeconHl);
			EspEtdRoot.setTop(EspEtdHbox);
			Label EtatLab =new Label("Connexion r�ussite");
			Hyperlink EspEtHl =new Hyperlink("Passer � votre espace");
			Hyperlink EspFlHl =new Hyperlink();
			EspEtdVbox.getChildren().addAll(EtatLab,EspEtHl,EspFlHl);
			EspEtdVbox.setPadding(new Insets(100));
			EspEtdVbox.setSpacing(10);
			EspEtdRoot.setCenter(EspEtdVbox);
			
			
			
			
			
			primaryStage.show();
			
			
			
			
			
			
            	try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					System.out.println("Connexion �tablie");
				} catch (ClassNotFoundException e2) {
					
					e2.printStackTrace();
				}
			
            	final Connection con = DriverManager.getConnection("jdbc:mysql://localhost:330/electro_bib_data_base?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "MP*NASAINCHA2AALLAH");
            	final Statement statement =  con.createStatement();

			
			
			BtVd.setOnAction(e->{
				final String Cne="'"+SUtf3.getText().trim()+"'";
				Connection connection = null;
				DBHandler handler;
				handler=new DBHandler();
				String insert ="insert into electro_bib_data_base.utilisateur(CNE,passwd) values(?,?)";
				try {
					connection =handler.getConnection();
				} catch (ClassNotFoundException | SQLException e2) {

					e2.printStackTrace();
				}
				PreparedStatement pst = null;
				try {
					pst = connection.prepareStatement(insert);
				} catch (SQLException e2) {

					e2.printStackTrace();
				}
				try {
					pst.setString(1, Cne);
					pst.setString(2, TfPasswd.getText());
					pst.executeUpdate();
				} catch (SQLException e2) {

					e2.printStackTrace();
				}
				
				COStage.hide();
				EspaceEtudiantStage.show();
			});
			
		
			 	
					
            SUbt1.setOnAction(e->{
            	 final String Cne="'"+SUtf3.getText().trim()+"'";
	             String rq ="select * from electro_bib_data_base.etudiant where cne="+Cne ;
				 ResultSet res = null;
				try {
					res = statement.executeQuery(rq);
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
				

				
					try {
						if(res.next()) {
							if(res.getString("NomEtudiant").equalsIgnoreCase(SUtf1.getText()) && res.getString("PrenomEtudiant").equalsIgnoreCase(SUtf2.getText()) && res.getString("Etablissement").equalsIgnoreCase((String) cb2.getValue())){
								COStage.show();
								SignUpStage.hide();
								labelNomEtudiant.setText("L'�tudiant "+res.getString("NomEtudiant")+" "+res.getString("PrenomEtudiant")+" de la fili�re "+res.getString("Filiere")+" "+res.getString("Etablissement"));
							}
							else {
								DescRes.setText("Vueillez s'assureez des informations entr�s");
							}
						}
						else {
							DescRes.setText("Vueillez s'assureez des informations entr�s");
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
            });
            
            
    
			
			bt.setOnAction(e->{
				String Cne="'"+tf1.getText().trim()+"'";
				String RqFil="select * from electro_bib_data_base.etudiant where CNE="+Cne;
				String RqCon ="select * from electro_bib_data_base.utilisateur where CNE="+Cne;
				
	        ResultSet ResCon=null;
	     
				try {
					ResultSet ResFil =statement.executeQuery(RqFil);
					ResCon =statement.executeQuery(RqCon);
					if(ResFil.next()) {
						if(!ResCon.next()) {
							InfLab.setText("vueillez activer votre compte ");
						}
						else  {
							if(ResCon.getString("passwd").equalsIgnoreCase("'"+tf2.getText().trim()+"'")){
								EspFlHl.setText("Voir les ressources disponible pour la fili�re "+ResFil.getString("Filiere"));
								LogInStage.hide();
								EspaceEtudiantStage.show();
							}
							else {
								InfLab.setText("mot de passe incorecte");	
							}
						}
					}
					else {
						InfLab.setText("vueillez s'assurer des informations entr�s");
					}	
				} catch (SQLException e1) {
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

