package src.Task3;

public class EmailVal implements Validation{
    public Validation nextVal;
    @Override
    public  void NextVal(Validation next) {
        nextVal = next;
    }

    @Override
    public void validate(Registration request) throws Exception{
        String email = request.getEmail();
        // this string is from https://www.baeldung.com/java-email-validation-regex
        String regex = "^[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        if (email.matches(regex)){
            //if(nextVal!=null){
                nextVal.validate(request);
         //   }
        } else{
            throw new Exception("Email needs to be a valid Address.0");
        }

    }
}
