public interface Fly {

    void takeOff();

    int ascend(int altitude);

    int descend(int altitude);

    void land();

    default void glide() {
        System.out.println("glides into the air.");
    }



}
