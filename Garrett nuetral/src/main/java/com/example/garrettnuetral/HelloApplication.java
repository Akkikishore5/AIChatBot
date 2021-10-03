package com.example.garrettnuetral;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.animation.ScaleTransition;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;


import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        Polygon fullhair = new Polygon();

        fullhair.getPoints().addAll(new Double[]{
                136.0, 302.0,
                127.0, 278.0,
                131.0, 240.0,
                111.0, 210.0,
                105.0, 171.0,
                109.0, 109.0,
                150.0, 71.0,
                173.0, 65.0,
                173.0, 48.0,
                214.0, 26.0,
                273.0, 26.0,
                320.0, 39.0,
                370.0, 79.0,
                404.0, 142.0,
                388.0, 232.0,
                394.0, 257.0,
                382.0, 290.0,
                377.0, 192.0,
                357.0, 182.0,
                351.0, 168.0,
                330.0, 174.0,
                291.0, 162.0,
                250.0, 160.0,
                200.0, 140.0,
                146.0, 156.0,
                146.0, 181.0,
                136.0, 204.0,
                136.0, 302.0,

        });

        Color fullhairc = Color.web("#150B08");
        fullhair.setFill(fullhairc);

        Polygon hair1 = new Polygon();

        hair1.getPoints().addAll(new Double[]{
                108.0, 127.0,
                105.0, 170.0,
                111.0, 210.0,
                124.0, 200.0,
                137.0, 201.0,
                139.0, 190.0,
                108.0, 127.0,

        });

        Color hair1c = Color.web("#27201B");
        hair1.setFill(hair1c);

        Polygon hair2 = new Polygon();

        hair2.getPoints().addAll(new Double[]{
                171.0, 125.0,
                180.0, 113.0,
                192.0, 110.0,
                210.0, 95.0,
                217.0, 96.0,
                195.0, 113.0,
                171.0, 125.0,

        });

        Color hair2c = Color.web("#48332D");
        hair2.setFill(hair2c);

        Polygon hair3 = new Polygon();

        hair3.getPoints().addAll(new Double[]{
                233.0, 140.0,
                238.0, 130.0,
                268.0, 123.0,
                282.0, 126.0,
                255.0, 136.0,
                233.0, 140.0,

        });

        Color hair3c = Color.web("#2C1711");
        hair3.setFill(hair3c);

        Polygon hair4 = new Polygon();

        hair4.getPoints().addAll(new Double[]{
                333.0, 151.0,
                337.0, 88.0,
                326.0, 48.0,
                314.0, 37.0,
                285.0, 30.0,
                248.0, 27.0,
                231.0, 33.0,
                231.0, 42.0,
                259.0, 51.0,
                284.0, 75.0,
                280.0, 94.0,
                246.0, 109.0,
                217.0, 136.0,
                233.0, 149.0,
                251.0, 151.0,
                286.0, 155.0,
                333.0, 151.0,

        });

        Color hair4c = Color.web("#48332D");
        hair4.setFill(hair4c);

        Polygon mainface = new Polygon();

        mainface.getPoints().addAll(new Double[]{
                382.0, 290.0,
                377.0, 192.0,
                357.0, 182.0,
                351.0, 168.0,
                330.0, 174.0,
                291.0, 162.0,
                250.0, 160.0,
                200.0, 140.0,
                146.0, 156.0,
                146.0, 181.0,
                136.0, 204.0,
                136.0, 302.0,
                145.0, 342.0,
                157.0, 384.0,
                222.0, 472.0,
                236.0, 476.0,
                262.0, 478.0,
                283.0, 476.0,
                305.0, 465.0,
                356.0, 404.0,
                372.0, 367.0,
                376.0, 313.0,
                382.0, 290.0,

        });

        Color mainfacec = Color.web("#ECADA2");
        mainface.setFill(mainfacec);

                Polygon hairshade = new Polygon();

        hairshade.getPoints().addAll(new Double[]{
                377.0, 192.0,
                357.0, 182.0,
                351.0, 168.0,
                330.0, 174.0,
                291.0, 162.0,
                250.0, 160.0,
                200.0, 140.0,
                146.0, 156.0,
                146.0, 181.0,
                136.0, 204.0,
                137.0, 225.0,
                165.0, 203.0,
                205.0, 197.0,
                250.0, 195.0,
                295.0, 199.0,
                333.0, 202.0,
                346.0, 202.0,
                378.0, 219.0,
                377.0, 192.0,
        });

        Color hairshadec = Color.web("#AC7D6C");
        hairshade.setFill(hairshadec);

        Polygon leftbrow = new Polygon();

        leftbrow.getPoints().addAll(new Double[]{
                142.0, 227.0,
                141.0, 238.0,
                144.0, 244.0,
                163.0, 236.0,
                193.0, 235.0,
                228.0, 242.0,
                240.0, 240.0,
                240.0, 232.0,
                219.0, 218.0,
                191.0, 212.0,
                162.0, 218.0,
                142.0, 227.0,
        });

        Color browc = Color.web("#1D1411");
        leftbrow.setFill(browc);

        Polygon rightbrow = new Polygon();

        rightbrow.getPoints().addAll(new Double[]{
                262.0, 229.0,
                264.0, 237.0,
                274.0, 241.0,
                304.0, 234.0,
                340.0, 234.0,
                370.0, 232.0,
                368.0, 221.0,
                342.0, 211.0,
                323.0, 208.0,
                298.0, 212.0,
                276.0, 220.0,
                262.0, 229.0,
        });

        rightbrow.setFill(browc);

        Polygon leftouteye = new Polygon();

        leftouteye.getPoints().addAll(new Double[]{
                189.0, 250.0,
                208.0, 251.0,
                221.0, 257.0,
                210.0, 264.0,
                196.0, 270.0,
                177.0, 269.0,
                170.0, 260.0,
                189.0, 250.0,
        });

        Color outeyec = Color.web("#6E605F");
        leftouteye.setFill(outeyec);

        Polygon leftineye = new Polygon();

        leftineye.getPoints().addAll(new Double[]{
                185.0, 254.0,
                185.0, 260.0,
                188.0, 264.0,
                196.0, 266.0,
                204.0, 262.0,
                206.0, 254.0,
                195.0, 252.0,
                185.0, 254.0,
        });

        Color ineyec = Color.web("#261712");
        leftineye.setFill(ineyec);

        Polygon leftinineye = new Polygon();

        leftinineye.getPoints().addAll(new Double[]{
                199.0, 253.0,
                195.0, 252.0,
                190.0, 253.0,
                191.0, 257.0,
                195.0, 259.0,
                198.0, 258.0,
                199.0, 253.0,
        });

        Color inineyec = Color.web("#0F0905");
        leftinineye.setFill(inineyec);

        Polygon rightouteye = new Polygon();

        rightouteye.getPoints().addAll(new Double[]{
                305.0, 247.0,
                329.0, 247.0,
                338.0, 257.0,
                328.0, 265.0,
                304.0, 264.0,
                291.0, 261.0,
                289.0, 252.0,
                305.0, 247.0,
        });

        rightouteye.setFill(outeyec);

        Polygon rightineye = new Polygon();

        rightineye.getPoints().addAll(new Double[]{
                303.0, 249.0,
                303.0, 255.0,
                307.0, 259.0,
                313.0, 261.0,
                320.0, 259.0,
                324.0, 255.0,
                324.0, 250.0,
                314.0, 248.0,
                303.0, 249.0,
        });

        rightineye.setFill(ineyec);

        Polygon rightinineye = new Polygon();

        rightinineye.getPoints().addAll(new Double[]{
                308.0, 248.0,
                308.0, 250.0,
                311.0, 254.0,
                316.0, 254.0,
                318.0, 249.0,
                314.0, 248.0,
                308.0, 248.0,
        });

        rightinineye.setFill(inineyec);

        Polygon nosemain = new Polygon();

        nosemain.getPoints().addAll(new Double[]{
                240.0, 232.0,
                262.0, 230.0,
                268.0, 297.0,
                288.0, 317.0,
                291.0, 327.0,
                285.0, 337.0,
                275.0, 337.0,
                269.0, 341.0,
                260.0, 349.0,
                246.0, 350.0,
                238.0, 341.0,
                230.0, 338.0,
                222.0, 339.0,
                219.0, 330.0,
                220.0, 316.0,
                239.0, 300.0,
                240.0, 232.0,
        });

        Color nosemainc = Color.web("#EFACA7");
        nosemain.setFill(nosemainc);

        Polygon noseshade = new Polygon();

        noseshade.getPoints().addAll(new Double[]{
                264.0, 246.0,
                262.0, 230.0,
                268.0, 297.0,
                288.0, 317.0,
                291.0, 327.0,
                285.0, 337.0,
                275.0, 337.0,
                269.0, 341.0,
                260.0, 349.0,
                246.0, 350.0,
                238.0, 341.0,
                230.0, 338.0,
                222.0, 339.0,
                219.0, 330.0,
                220.0, 316.0,
                239.0, 300.0,
                239.0, 251.0,
                232.0, 270.0,
                213.0, 292.0,
                219.0, 316.0,
                217.0, 330.0,
                220.0, 339.0,
                222.0, 347.0,
                230.0, 352.0,
                243.0, 351.0,
                245.0, 351.0,
                253.0, 351.0,
                261.0, 350.0,
                276.0, 349.0,
                286.0, 342.0,
                287.0, 338.0,
                293.0, 327.0,
                292.0, 317.0,
                296.0, 293.0,
                269.0, 261.0,
                264.0, 246.0,
        });

        Color noseshadec = Color.web("#9D6C63");
        noseshade.setFill(noseshadec);

        Polygon stache = new Polygon();

        stache.getPoints().addAll(new Double[]{
                191.0, 372.0,
                208.0, 361.0,
                242.0, 355.0,
                273.0, 355.0,
                299.0, 360.0,
                321.0, 369.0,
                326.0, 377.0,
                315.0, 383.0,
                276.0, 372.0,
                240.0, 370.0,
                201.0, 380.0,
                191.0, 378.0,
                191.0, 372.0,
        });

        Color stachec = Color.web("#91675F");
        stache.setFill(stachec);

        Polygon beard = new Polygon();

        beard.getPoints().addAll(new Double[]{
                145.0, 342.0,
                157.0, 384.0,
                222.0, 472.0,
                236.0, 476.0,
                262.0, 478.0,
                283.0, 476.0,
                305.0, 465.0,
                356.0, 404.0,
                372.0, 367.0,
                374.0, 337.0,
                348.0, 358.0,
                333.0, 382.0,
                332.0, 405.0,
                296.0, 441.0,
                279.0, 452.0,
                235.0, 453.0,
                214.0, 443.0,
                201.0, 412.0,
                184.0, 394.0,
                175.0, 367.0,
                145.0, 342.0,
        });

        Color beardc = Color.web("#7C574F");
        beard.setFill(beardc);

        Polygon lip = new Polygon();

        lip.getPoints().addAll(new Double[]{
                206.0, 383.0,
                210.0, 379.0,
                236.0, 372.0,
                246.0, 372.0,
                252.0, 376.0,
                264.0, 373.0,
                303.0, 381.0,
                304.0, 384.0,
                291.0, 389.0,
                280.0, 397.0,
                265.0, 402.0,
                244.0, 402.0,
                229.0, 398.0,
                215.0, 387.0,
                206.0, 383.0,
        });

        Color lipc = Color.web("#B0525A");
        lip.setFill(lipc);

        Polygon innerlip = new Polygon();

        innerlip.getPoints().addAll(new Double[]{
                213.0, 381.0,
                229.0, 380.0,
                252.0, 386.0,
                272.0, 382.0,
                300.0, 382.0,
                291.0, 387.0,
                276.0, 386.0,
                253.0, 390.0,
                230.0, 384.0,
                216.0, 382.0,
                213.0, 381.0,
        });

        Color innerlipc = Color.web("#612125");
        innerlip.setFill(innerlipc);

        BorderPane layout = new BorderPane();
        layout.getChildren().add(mainface);
        layout.getChildren().add(fullhair);
        layout.getChildren().add(hair1);
        layout.getChildren().add(hair2);
        layout.getChildren().add(hair4);
        layout.getChildren().add(hair3);
        layout.getChildren().add(hairshade);
        layout.getChildren().add(leftbrow);
        layout.getChildren().add(rightbrow);
        layout.getChildren().add(leftouteye);
        layout.getChildren().add(leftineye);
        layout.getChildren().add(leftinineye);
        layout.getChildren().add(rightouteye);
        layout.getChildren().add(rightineye);
        layout.getChildren().add(rightinineye);
        layout.getChildren().add(nosemain);
        layout.getChildren().add(noseshade);
        layout.getChildren().add(stache);
        layout.getChildren().add(beard);
        layout.getChildren().add(lip);
        layout.getChildren().add(innerlip);



        Scene scene = new Scene(layout, 600,500);
        stage.setScene(scene);
        stage.show();
    }

}