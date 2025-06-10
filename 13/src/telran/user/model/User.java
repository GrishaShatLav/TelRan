package telran.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        // TODO use setEmail();
        this.email = email;
        this.password = password;

    }

    public String getEmail() {
        // TODO use validate email;
        if(setEmail(email)) {
            return email;
        }
        else {
            return "error";
        }
    }

    public boolean setEmail(String email) {
        int count = 0;
        int dotCount = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@'){
                count ++;
            }

        }
        for (int i = email.indexOf("."); i <email.length() ; i++) {
            if(email.charAt(i)=='.'){
                dotCount =0;
                for (int j = i; j < email.length(); j++) {
                    dotCount++;
                }
                break;
            }


        }
        if (email.contains("@")&&count==1
                &&email.indexOf(".")>email.indexOf("@")
                &&dotCount>=2
                &&email.matches("[a-zA-Z]+_+-+.+@"))
        {

            return true;
        }

        else {
            return false;
        }
    }
    /* TODO:
          1. @ exists and only 1
          2. '.' after @
          3. afrer last dot min 2 symbols
          4. Alphabetic digits _ - . @

     */

    private  boolean validateEmail(String email){
        return false;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "user{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
