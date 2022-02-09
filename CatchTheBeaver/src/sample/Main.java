package sample;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    static final int GAME_BOARD_WIDTH = 700;
    static final int GAME_BOARD_HEIGHT = 700;
    //monta pelaajaa
    static final int PLAYER_COUNT = 5; //vakio, ei voi muuttua
    private int hitCount = 0;

    @Override
    public void start(Stage primaryStage) throws Exception{


        Pane root = new Pane();

        //rakenne
        for (int i = 0; i<PLAYER_COUNT; i++) {

            Beaver player = new Beaver();

            //tapahtuman kuuntelija, joka kuuntelee hiirtä
            player.setOnMouseClicked(event -> {

                Beaver hittedBeaver = (Beaver) event.getSource(); //suluissa beaver tyyppimuunnos

                if (hittedBeaver == null){
                    return;
                }

                hittedBeaver.setCatched();
                hitCount++;
                if (hitCount<PLAYER_COUNT) {
                    primaryStage.setTitle("TILANNE: " + hitCount + "/" + PLAYER_COUNT);
                }else{
                    primaryStage.setTitle("GAME OVER!");

                }



            });

            root.getChildren().add(player); //lisätään majava paneeliin
            player.play();
        }

        Scene gameBoard = new Scene(root, 700,700);

        primaryStage.setTitle("Nappaa majava!");
        primaryStage.setScene(gameBoard);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    //luokka kuvalle, eli pelihahmo, peritään imageviewiin ominaisuudet
    public class Beaver extends ImageView implements Runnable{

        private final int PLAYER_WIDHT = 50;
        private final int PLAYER_HEIGHT = 50;

        private boolean isVisible = false;
        private boolean isCatched = false;

        private int sleepTime = 0;

        //konstruktori
        public Beaver(){
            super("sample/Images/beaver.png");
            //asetetaan hahmon koko
            this.setFitWidth(PLAYER_WIDHT);
            this.setFitHeight(PLAYER_HEIGHT);

            //random nukkumisaika majavalle
            sleepTime = getRandomValue(500,1000);
        }
        //metodi nappaamista varten
        public void setCatched() {
            isCatched = true;
        }

        //metodi, jossa luodaan uusi säie kun pelihahmoa kutsutaan
        public void play(){
            Thread t = new Thread(this);
            t.start(); //kutsuu run, metodia

        }

        @Override
        public void run() {
            while(!isCatched) {

                try {
                    Thread.sleep(sleepTime); //nukutaan 3 sekunttia
                    isVisible = !isVisible; //muutetaan kuvan näkyvyyttä

                    //minne majava randomisti ilmestyy
                    int x = getRandomValue(0,GAME_BOARD_WIDTH - PLAYER_WIDHT);
                    int y = getRandomValue(0,GAME_BOARD_HEIGHT - PLAYER_HEIGHT);

                    this.setLayoutX(x);
                    this.setLayoutY(y);

                    this.setVisible(isVisible);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        private int getRandomValue(int min, int max) {
            Random r = new Random();
            int randomValue = r.nextInt(max - min) + min;
            System.out.println(randomValue);
            return randomValue;
        }
    }
}
