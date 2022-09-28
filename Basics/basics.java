class angryBirdsLevel {
    Screen screen = new Screen();
    Music music = new Music(2);
    Background background = new Background(1);

    RedBird redbird1 = new RedBird();
    YellowBird yellowbird1 = new YelllowBird();
    Bluebird bluebird = new Bluebird();
    boolean levelIsHappening = true;
    Slingshot slingshot = new Slingshot();
    Structure structure = new Structure(1);

    Bird[] birdarray = {redbird1, yellowbird1, bluebird};

    for (int i = 0; i < birdarray.length(); i++) {
        slingshot.put(birdarray[i]);

        if (slingshot.isPulledBackAndShot()) {
            if (birdarray[i] == YellowBird) {
                if (screenPressed == true) {
                    yellowbird1.ifPressed();
                }
            }
            if (birdarray[i] == Bluebird) {
                if  (screenPressed == true) {
                   bluebird.ifPressed();
                
                }
            }
        }

        

    }
}




