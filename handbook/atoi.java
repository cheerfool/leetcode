package handbook;

public class atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int myAtoi(String str) {
        int len = str.length();
        int result=0, sign=1;
        for(int i=0; i<len; i++){
            char head= str.charAt(i);
            if('0'<=head && head<='9'){
                if(i>0 && str.charAt(i-1)=='-')
                    sign=-1;
                result+= sign*(head-'0');
                for(int j=i+1; j<len; j++){
                    char ch= str.charAt(j);
                    if(ch<'0' || ch>'9')
                        return result;
                    int unit=ch-'0';
                    if(sign>0 && (Integer.MAX_VALUE-unit)/10>=result)
                        result= result*10 + unit;
                    else if(sign<0 && (Integer.MIN_VALUE+unit)/10<=result)
                        result= result*10 - unit;
                        
                }
                return result;
            }
        }
        return result;
    }
}
