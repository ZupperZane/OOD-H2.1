package src.Task3;

public class PasswordVal implements Validation{
    public Validation nextVal;
    @Override
    public  void NextVal(Validation next) {
        nextVal = next;
    }

    @Override
    public void validate(Registration request) throws Exception{
        String User = request.Password;
        String UserRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        if(User.matches(UserRegex)){
            if(nextVal!=null){
                nextVal.validate(request);
            }
        } else{
            throw new Exception("Password must be at least 8 Characters Long, contain 1 uppercacse and lowercase, and Contain one Digit");
        }

    }
}
