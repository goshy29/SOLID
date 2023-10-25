public class LiskovSubstitutionPrinciple {
    //This principle states that “Derived or child classes must be substitutable for their base or
    // parent classes”. In other words, if class A is a subtype of class B, then we should be able
    // to replace B with A without interrupting the behavior of the program.
    //
    //This principle is bit tricky and interesting all it designed based on Inheritance concepts ,
    // so let’s better understand this with an example.
    //
    //Let’s consider I have an abstract class called SocialMedia , who supported all social
    // media activity for user to entertain them like below.
}
abstract class SocialMedia {
    public abstract  void chatWithFriend();
    public abstract void publishPost(Object post);
    public abstract  void sendPhotosAndVideos();
    public abstract  void groupVideoCall(String... users);
}
class Facebook extends SocialMedia {
    public void chatWithFriend() {
        //logic
    }
    public void publishPost(Object post) {
        //logic
    }
    public void sendPhotosAndVideos() {
        //logic
    }
    public void groupVideoCall(String... users) {
        //logic
    }
}
class WhatsApp extends SocialMedia {
    public void chatWithFriend() {
        //logic
    }
    public void publishPost(Object post) {
        //Not Applicable
    }
    public void sendPhotosAndVideos() {
        //logic
    }
    public void groupVideoCall(String... users) {
        //logic
    }
}

    // UNSTEAD !!
interface SocialMediaI {
        public void chatWithFriend();
        public void sendPhotosAndVideos();
}
interface SocialPostAndMediaManager {
    public void publishPost(Object post);
}
interface VideoCallManager{
    public void groupVideoCall(String... users);
}
class Instagram implements SocialMediaI ,SocialPostAndMediaManager{
    public void chatWithFriend(){
        //logic
    }
    public void sendPhotosAndVideos(){
        //logic
    }
    public void publishPost(Object post){
        //logic
    }
}
