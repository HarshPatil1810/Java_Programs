class Solution {
    List<String> res=null;
    String[] mapping =new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        res=new ArrayList<>();
        if(digits.length()==0) return res;
        dfs(0,digits,new StringBuilder());
        return res;
    
    }
    void dfs(int length,String digit,StringBuilder temp){
        if(length==digit.length()){
            res.add(temp.toString());
            return;
        }

        char ch=digit.charAt(length);
        String str=mapping[ch-'0'];
        for(char c:str.toCharArray()){
            temp.append(c);
            dfs(length+1,digit,temp);
            temp.deleteCharAt(temp.length()-1);
        }

    }
}