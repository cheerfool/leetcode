package test;

import java.util.Stack;

public class ValidParentheses {
	   public boolean isValid(String s) {
	        Stack stack= new Stack();
	        int n= s.length();
	        for(int i=0; i<n; i++){
	            char ch= s.charAt(i);
	            if((ch=='{')||(ch=='[')||(ch=='(')){
	                stack.push(ch);
	            }else{
	                if(stack.size()==0)
	                    return false;
	                if(ch=='}'){
	                    if((char)stack.pop()!='{')
	                        return false;
	                }else if(ch==']'){
	                    if((char)stack.pop()!='[')
	                        return false;
	                }else if(ch==')'){
	                    if((char)stack.pop()!='(')
	                        return false;
	                }else{
	                    return false;
	                }
	            }
	        }
	        return stack.size()==0;
	    }
}
