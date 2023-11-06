package practice;

public class UserAppl {
    public static void main(String[] args) {
        User user= new User("Peter@gmail.com","Aa1!ghjd"); //создали пользователя
        user.setEmail("Peter@gmail.com");
        user.setPassword("Aa1!ghjd");
        System.out.println(user);
    }
}
