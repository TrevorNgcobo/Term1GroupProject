package za.ac.cput.sinovuyo;

public class SinovuyoApp {
    private String name;
    private boolean female = false;

    public SinovuyoApp (String name){
        this.name = name;
    }

    public Object getName() {

        return name;
    }

    public void gender(){
        female = true;
    }

    public void printGenderMessage(){
        if(!female){
            throw new IllegalStateException();
        }
        System.out.println("I am male!");
    }

    public String getGenderMessage(){
        if(!female){
            throw new IllegalStateException();
        }
        return "I am female";
    }

}
