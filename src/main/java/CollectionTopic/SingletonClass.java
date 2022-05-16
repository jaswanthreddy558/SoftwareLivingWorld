package CollectionTopic;

public class SingletonClass {


    private SingletonClass(){

    }

    public static SingletonClass singletonClassMethod(){
        return new SingletonClass();
    }

}
