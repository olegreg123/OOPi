package OOP;

public class Engine {
    String type;
    String horsepower;
    String start;
    String stop;

    public Engine (String type, String horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public String toString(){
     return "The car consumes is " + type + " , and  horsepower is  " + horsepower;

    }
    public String start () {
        return "Engine is started";
    }
    public  String stop () {
        return "Engine is stoped";
    }

}

