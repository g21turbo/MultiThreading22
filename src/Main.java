public class Main {

    public static void main(String[] args) {

        //for loop, five threads
        for (int i = 0; i < 5; i++) {
            MainThing mainThing = new MainThing(i);
            Thread myThread = new Thread(mainThing);
            myThread.start();

        }

        //two threads
//        MainThing mainThing = new MainThing();
//        MainThing mainThing2 = new MainThing();
//
//        mainThing.start();
//        mainThing2.start();
//    }
    }
}