public class Phone {
    public void call() {
        System.out.println("Phone can make call");
    }

    public void sms() {
        System.out.println("Phone can send SMS");
    }
}

interface ICamera {
    void takePhoto();
    void recordVideo();
}

interface IMusicPlayer {
    void playMusic();
    void pauseMusic();
    void stopMusic();
}

class Smartphone extends Phone implements ICamera,IMusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("A smartphone can play music using music player interface");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A smartphone can pause music using music player interface");
    }

    @Override
    public void stopMusic() {
        System.out.println("A smartphone can stop music using music player interface");
    }

    @Override
    public void recordVideo() {
        System.out.println("A smartphone can record video using camera interface");
    }

    @Override
    public void takePhoto() {
        System.out.println("A smartphone can take photos using camera interface");
    }

    public void videoCalls() {
        System.out.println("A smartphone can make video calls using call and camera functionality");
    }

}
