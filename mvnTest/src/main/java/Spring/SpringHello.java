package Spring;

public class SpringHello {

    SpringHello(String hello){
        this.hello = hello;
        System.out.println(hello);
    }

String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
