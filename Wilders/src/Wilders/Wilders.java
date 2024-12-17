package Wilders;

public class Wilders {
    String firstname;
    boolean aware;

    public Wilders(String firstname, boolean aware ) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getName(){
        return this.firstname;
    }

    public boolean getAware(){
        return this.aware;
    }

    public String setFirstname(String firstname){
        return this.firstname = firstname;
    }

    public boolean setAware(boolean aware){
        return this.aware = aware;
    }

    public String whoIAm(){
        if(this.aware){
            return "Je m'appelle " + this.firstname + " et je suis aware";
        }else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }
}
