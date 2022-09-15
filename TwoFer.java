public class Twofer {
    public String twofer(String name) {
        if(name == null || name == ""){
        return ("One for you, one for me.");
       }else{
        return ("One for " + name + ", one for me.");
            
       }
    }
}

import static java.util.Objects.isNull;
public class Twofer {
    public String twofer(String name) {
        name = isNull(name) ? "you" : name;
        return "One for " + name + ", one for me.";
    }
}
