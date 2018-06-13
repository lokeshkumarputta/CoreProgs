package com.elife.corejavaprogs;

import java.util.HashMap;

public class LastRepeatingCharacter {
    public static Character getCharacter(String s){
        //remove all the spaces
        s = s.replaceAll(" ", "");
        Character rptChar = null;
        int count = 0;
        //Will store each character and it's count in MAP
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Character chr = null;
        for (int i = 0; i <s.length(); i++) {
             chr = s.charAt(i);
            if(map.containsKey(chr)){
//            	System.out.println(map.get(chr));
                map.put(chr,map.get(chr)+1);
                System.out.println(map.get(chr));
                count = map.get(chr);
            }else{
                map.put(chr, 1);
            }
        }
        //Iterate the string from end to start and return the character for which the count is > 1 in map
        for (int i = s.length()-1; i >=0 ; i--) {
            if(map.get(s.charAt(i))>1){
                rptChar = s.charAt(i);
//                count++;
                break;
            }
        }
        System.out.println("Last Repeating Character in '"+ s +"' is: " + rptChar + " count is:: " +count);
        return rptChar;
        
    }

    public static void main(String[] args) {
        String input = "tutorial aab aaa yea yea yea";
        Character result = getCharacter(input);
        if(result!=null){
            System.out.println("Last Repeating Character in '"+input+"' is: " + result + " count is "  );
        }else{
            System.out.println("No Repeating Character found");
        }
    }
}