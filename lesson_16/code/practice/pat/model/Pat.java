package practice.pat.model;

public class Pat {

    private int id;
    private String typ;
    private int age;
    private String nickname;

    public Pat(int id, String typ, int age, String nickname) {
        this.id = id;
        this.typ = typ;
        this.age = age;
        this.nickname = nickname;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTyp() {
        return typ;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void display(){
        System.out.println("ID: "+id+"; Typ of pat: "+typ+"; Pet's age: "+age+"; Pet name: "+nickname);
    }
    public void sound(String nickname){
        System.out.println("Our pet "+nickname+" makes some sounds! ");
    }
    public void eat(String nickname){
        System.out.println("Our pet "+nickname+" eat with gusto! ");
    }
    public void sleep(String nickname){
        System.out.println("Our pet "+nickname+" sleeps sweetly! ");
    }
    public void game(String nickname){
        System.out.println("Our pet "+nickname+" plays happily! ");
    }
    public void walk(String nickname){
        System.out.println("Our pet "+nickname+" enjoys walking! ");
    }
    public static void split(){
        System.out.println("-----------------------------------------------------------");
    }
}
