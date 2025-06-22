class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> res=new ArrayList<>();
        StringBuilder group=new StringBuilder();

        for(char c:s.toCharArray()){
            group.append(c);
            if(group.length()==k){
                res.add(group.toString());
                group.setLength(0);
            }
        }

        if(group.length() > 0){
            while(group.length() < k){
                group.append(fill);
                
            }
            res.add(group.toString());
        }

        return res.toArray(new String[0]);

    }
}
