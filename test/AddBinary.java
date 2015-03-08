package test;

public class AddBinary {
    public String addBinary(String a, String b) {
        int la= a.length(), lb= b.length();
        int n= Math.max(la, lb);
        int c=0;
        StringBuffer sb= new StringBuffer(n+1);
        for(int i=0; i<n; i++){
            int ia= (i<la?a.charAt(la-1-i):'0') -'0';
            int ib= (i<lb?b.charAt(lb-1-i):'0') -'0';
            sb.append((ia+ib+c)%2);
            c= (ia+ib+c)/2;
        }
        if(c==1)
            sb.append(1);
        return sb.reverse().toString();
    }
}
