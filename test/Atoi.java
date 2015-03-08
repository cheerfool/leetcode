package test;

public class Atoi {
    public int atoi(String str) {
        int y = 0;
        int flag = 1;
        State s = State.init;
        int n = str.length();
        for(int i=0; i<n; i++){
            char ch = str.charAt(i);
            if(s == State.init){
                if(ch == ' '){
                    continue;
                }else if(ch == '+'){
                    s = State.flag;
                    continue;
                }else if(ch == '-'){
                    flag = -1;
                    s = State.flag;
                    continue;
                }else if(isInt(ch)){
                    s = State.num;
                }else{
                    s = State.end;
                    return 0;
                }
            }else if(s == State.flag){
                if(isInt(ch)){
                    s = State.num;
                }else{
                    s = State.end;
                    return 0;
                }
            }else if(s == State.num){
                if(!isInt(ch)){
                    s = State.end;
                    return flag*y;
                }
            }
            
            int digit = ch-'0';
            if(flag>0){
                if((Integer.MAX_VALUE-digit)/10<y){
                    s = State.end;
                    return Integer.MAX_VALUE;
                }
            }else{
                if((Integer.MIN_VALUE+digit)/10>-y){
                    s = State.end;
                    return Integer.MIN_VALUE;
                }
            }
            y = y*10 + digit;
        }
        s= State.end;
        return flag*y;
    }
    
    boolean isInt(char ch){
        if((ch<'0')||(ch>'9'))
            return false;
        else
            return true;
    }
    
    enum State{
        init,flag,num,end;
    }
}
