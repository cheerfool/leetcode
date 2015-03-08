package test;

public class IsNumber {
    public boolean isNumber(String str) {
        State s = State.init;
        boolean result = false;
        str = str.trim();
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(s == State.init){
                if(ch=='.'){
                    s = State.zerodot;
                }else if((ch=='+')||(ch=='-')){
                    s = State.flag;
                }else if(isDigit(ch)){
                    s = State.numInt;
                    result = true;
                }else{
                    return false;
                }
            }else if(s == State.flag){
                if(isDigit(ch)){
                    s = State.numInt;
                    result = true;
                }else if(ch=='.'){
                    s = State.zerodot;
                }else{
                    return false;
                }
            }else if(s == State.zerodot){
                if(isDigit(ch)){
                    s = State.numDouble;
                    result = true;
                }else{
                    return false;
                }
            }else if(s == State.numInt){
                if(ch == '.'){
                    s = State.dot;
                }else if(ch == 'e'){
                    s = State.e;
                    result = false;
                }else if(!isDigit(ch)){
                    return false;
                }
            }else if(s == State.dot){
                if(isDigit(ch)){
                    s = State.numDouble;
                }else if(ch=='e'){
                    s = State.e;
                    result = false;
                }else{
                    return false;
                }
            }else if(s == State.numDouble){
                if(ch == 'e'){
                    s = State.e;
                    result = false;
                }else if(!isDigit(ch)){
                    return false;
                }
            }else if(s == State.e){
                if(isDigit(ch)){
                    s = State.sci;
                    result = true;
                }else if((ch=='+')||(ch=='-')){
                    s = State.flag2;
                }else{
                    return false;
                }
            }else if(s == State.flag2){
                if(isDigit(ch)){
                    s = State.sci;
                    result = true;
                }else{
                    return false;
                }
            }else if(s == State.sci){
                if(!isDigit(ch))
                    return false;
            }
        }
        return result;
    }
    
    boolean isDigit(char ch){
        if((ch<'0')||(ch>'9'))
            return false;
        else
            return true;
    }
    
    enum State{
        init,flag,numInt,zerodot,dot,numDouble,e,flag2,sci;
    }
}
