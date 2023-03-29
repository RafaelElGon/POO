package JFrameAgenda;

public class Contato {
    private String name;
    private int age;

    public Contato(String name, int age){
        this.age = age;
        this.name = name;
    }

    public Contato(){
        this("", 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
