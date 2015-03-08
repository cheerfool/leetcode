package test;

import java.util.ArrayList;

public class ZigZag {
    public String convert(String s, int nRows) {
        if(nRows<2)
            return s;
        StringBuffer result= new StringBuffer();
        ArrayList<StringBuffer> sbs= new ArrayList<StringBuffer>();
        for(int i=0; i<nRows; i++)
            sbs.add(new StringBuffer());
        int index=0, step=1;
        for(char ch: s.toCharArray()){
            sbs.get(index).append(ch);
            if(index+step>nRows-1){
                step=-1;
            }else if(index+step<0){
                step=1;
            }
            index+=step;
        }
        for(StringBuffer sb: sbs){
            result.append(sb);
        }
        return result.toString();
    }
}
