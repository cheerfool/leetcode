package test;

public class CompareVersion {
    public int compareVersion(String version1, String version2) {
        int dot1= version1.indexOf('.');
        int dot2= version2.indexOf('.');
        int int1, int2, frac1, frac2;
        if(dot1==-1){
            int1= Integer.parseInt(version1);
            frac1= 0;
        }else{
            int1= Integer.parseInt(version1.substring(0,dot1));
            frac1= Integer.parseInt(version1.substring(dot1+1));
        }
        if(dot2==-1){
            int2= Integer.parseInt(version2);
            frac2= 0;
        }else{
            int2= Integer.parseInt(version2.substring(0,dot2));
            frac2= Integer.parseInt(version2.substring(dot2+1));
        }
    
        if(int1<int2){
            return -1;
        }else if(int1>int2){
            return 1;
        }else{
            if(frac1<frac2){
                return -1;
            }else if(frac1>frac2){
                return 1;   
            }else{
                return 0;
            }
        }
    }
}
