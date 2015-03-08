package test;

public class IsNumber2 {
    public boolean isNumber(String s) {
        s=s.trim();
        String[] regexes={
            "[+-]?[0-9]+\\.?[0-9]*",
            "[+-]?\\.[0-9]+",
            "[+-]?[0-9]+\\.?[0-9]*e[+-]?[0-9]+",
            "[+-]?\\.[0-9]+e[+-]?[0-9]+"
        };
        for(String regex:regexes){
            if(s.matches(regex))
                return true;
        }
        return false;
    }
}
