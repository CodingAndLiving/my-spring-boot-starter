package autoconfigure.core;

public class Boss implements Person {

    private String name;
    private String age;
    private boolean enable;

    public Boss(String name, String age, boolean enable) {
        this.name = name;
        this.age = age;
        this.enable = enable;
    }

    public void say() {
        if (enable){
            System.out.println("name:"+name+"\nage:"+age);
        }
    }
}
