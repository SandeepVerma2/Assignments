class Login{
    String userId = "Ajay",password = "password";
    int attempt=0;
    public String loginUser(String user, String pass) {

        if(attempt == 3){
            return "Wrong Credentials 3 times\n Contact Admin";
        }


        if(user == userId && pass == password){
            attempt=0;
            return "Welcome "+ user;
        }else{
            attempt++;
            return "Wrong Credentials";
        }
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {}
}