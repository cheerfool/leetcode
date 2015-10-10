package handbook;

public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("   /.dsf-12345lln"));
	}

    public static int myAtoi2(String str) {
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
                    if(sign>0 && (Integer.MAX_VALUE-unit)/10<result)
                        return Integer.MAX_VALUE;
                    else if(sign<0 && (Integer.MIN_VALUE+unit)/10>result)
                        return Integer.MIN_VALUE;
                    result = result * 10 + sign*unit;
                }
                return result;
            }
        }
        return result;
    }
    
    public static int myAtoi(String str) {
        int len = str.length();
        int i = 0;
        while(i<len && str.charAt(i)==' ')
            i++;
        int result=0, sign=1;
        if(i==len)
            return result;
        if(str.charAt(i)=='+'){
            i++;
        }else if(str.charAt(i)=='-'){
            sign = -1;
            i++;
        }
        for(int j=i; j<len; j++){
            char ch= str.charAt(j);
            if(ch<'0' || ch>'9')
                return result;
            int unit=ch-'0';
            if(sign>0 && (Integer.MAX_VALUE-unit)/10<result)
                return Integer.MAX_VALUE;
            else if(sign<0 && (Integer.MIN_VALUE+unit)/10>result)
                return Integer.MIN_VALUE;
            result = result * 10 + sign*unit;
        }
        return result;
    }
}
