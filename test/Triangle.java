package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Triangle {
    HashMap<Integer, ArrayList<ArrayList<Integer>>> map=new HashMap<Integer, ArrayList<ArrayList<Integer>>>();
    Triangle(){
        ArrayList<ArrayList<Integer>> triangle= new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> li=new ArrayList<Integer>();
        li.add(1);
        triangle.add(li);
        map.put(1,triangle);
    }
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        if(numRows<1){
            ArrayList<ArrayList<Integer>> triangle=new ArrayList<ArrayList<Integer>>();
            return triangle;
        }
        if(map.containsKey(numRows))
            return map.get(numRows);
        ArrayList<ArrayList<Integer>> lastTri= generate(numRows-1);
        ArrayList<Integer> lastline= lastTri.get(numRows-2);
        ArrayList<Integer> newline= new ArrayList<Integer>();
        newline.add(1);
        for(int i=0; i<numRows-2; i++){
            int tempSum= lastline.get(i)+lastline.get(i+1);
            newline.add(tempSum);
        }
        newline.add(1);
        ArrayList<ArrayList<Integer>> newTri= (ArrayList)lastTri.clone();
        newTri.add(newline);
        map.put(numRows, newTri);
        return newTri;
    }
}
