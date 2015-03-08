package test;

import java.util.ArrayList;
import java.util.List;

public class TriangleRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> newRow=new ArrayList<Integer>();
        if(rowIndex<0){
            return newRow;
        }else if(rowIndex==0){
            newRow.add(1);
            return newRow;
        }else{
            List<Integer> lastRow = getRow(rowIndex-1);
            newRow.add(1);
            for(int i=1; i<rowIndex; i++){
                newRow.add(lastRow.get(i-1)+lastRow.get(i));
            }
            newRow.add(1);
        }
        return newRow;
    }
}
