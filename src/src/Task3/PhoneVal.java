package src.Task3;

public class PhoneVal implements Validation{
    public Validation nextVal;
    @Override
    public void NextVal(Validation next) {
        nextVal = next;
    }

    @Override
    public void validate(Registration request) throws Exception{
       String phone = request.getPhoneNumber();
       //https://stackoverflow.com/questions/27631692/phone-number-validation-in-java
        // used the regex from this
       if (phone.matches("^[0-9]{9,11}$")){
           if(nextVal!=null){
               nextVal.validate(request);
           }
       } else{
           throw new Exception("Phone must be only Numbers & 9 Characters");
       }
    }
}
