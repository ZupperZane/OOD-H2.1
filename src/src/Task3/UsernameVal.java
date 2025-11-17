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
    if ( UserName == null ){
        if (UserName.length()>5){
            //Valid
            nextVal.validate(request);
        }
    } throw new Exception("Username must be at least 5 Characters.");

    }
}
