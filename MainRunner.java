// Example class definitions with explicit constructors
class Helicopter {
    public Helicopter() {
        System.out.println("Helicopter created");
    }
}

class Market {
    public Market() {
        System.out.println("Market created");
    }
}

class Mall {
    public Mall() {
        System.out.println("Mall created");
    }
}

class Train {
    public Train() {
        System.out.println("Train created");
    }
}

class Ring {
    public Ring() {
        System.out.println("Ring created");
    }
}

class Auto {
    public Auto() {
        System.out.println("Auto created");
    }
}

class Auditorium {
    public Auditorium() {
        System.out.println("Auditorium created");
    }
}

class SpaceShip {
    public SpaceShip() {
        System.out.println("SpaceShip created");
    }
}

class Alien {
    public Alien() {
        System.out.println("Alien created");
    }
}

class Bullet {
    public Bullet() {
        System.out.println("Bullet created");
    }
}

class Galaxy {
    public Galaxy() {
        System.out.println("Galaxy created");
    }
}

class Spoon {
    public Spoon() {
        System.out.println("Spoon created");
    }
}

class BlackHole {
    public BlackHole() {
        System.out.println("BlackHole created");
    }
}

class Cake {
    public Cake() {
        System.out.println("Cake created");
    }
}

class Wrapper {
    public Wrapper() {
        System.out.println("Wrapper created");
    }
}

public class MainRunner {
    public static void main(String[] args) {
        Helicopter[] helicopters = new Helicopter[5];
        Market[] markets = new Market[5];
        Mall[] malls = new Mall[5];
        Train[] trains = new Train[5];
        Ring[] rings = new Ring[5];
        Auto[] autos = new Auto[5];
        Auditorium[] auditoriums = new Auditorium[5];
        SpaceShip[] spaceships = new SpaceShip[5];
        Alien[] aliens = new Alien[5];
        Bullet[] bullets = new Bullet[5];
        Galaxy[] galaxies = new Galaxy[5];
        Spoon[] spoons = new Spoon[5];
        BlackHole[] blackHoles = new BlackHole[5];
        Cake[] cakes = new Cake[5];
        Wrapper[] wrappers = new Wrapper[5];

        // Initializing the arrays with new instances
        for (int i = 0; i < 5; i++) {
            helicopters[i] = new Helicopter();
            markets[i] = new Market();
            malls[i] = new Mall();
            trains[i] = new Train();
            rings[i] = new Ring();
            autos[i] = new Auto();
            auditoriums[i] = new Auditorium();
            spaceships[i] = new SpaceShip();
            aliens[i] = new Alien();
            bullets[i] = new Bullet();
            galaxies[i] = new Galaxy();
            spoons[i] = new Spoon();
            blackHoles[i] = new BlackHole();
            cakes[i] = new Cake();
            wrappers[i] = new Wrapper();
        }

        // Example of storing one location in a variable
        
        Helicopter firstHelicopter = helicopters[0];
        Market firstMarket = markets[0];
        Mall firstMall = malls[0];
        Train firstTrain = trains[0];
        Ring firstRing = rings[0];
        Auto firstAuto = autos[0];
        Auditorium firstAuditorium = auditoriums[0];
        SpaceShip firstSpaceShip = spaceships[0];
        Alien firstAlien = aliens[0];
        Bullet firstBullet = bullets[0];
        Galaxy firstGalaxy = galaxies[0];
        Spoon firstSpoon = spoons[0];
        BlackHole firstBlackHole = blackHoles[0];
        Cake firstCake = cakes[0];
        Wrapper firstWrapper = wrappers[0];
    }
}
