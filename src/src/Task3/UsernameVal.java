package src.Task3;

import java.sql.Ref;

public class UsernameVal implements Validation{
    public Validation nextVal;
    @Override
    public void NextVal(Validation next) {
        nextVal = next;
    }

    @Override
    public void validate(Registration request) throws Exception {
    String UserName = request.getUsername();
        if (UserName.length()>=5){
            if(nextVal!=null){
                nextVal.validate(request);
            }
        } else{
            throw new Exception("Username Not Valid Must be at least 5 Character");
        }
    }
}
