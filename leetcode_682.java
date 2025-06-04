class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st = new Stack<>();
        for(String s:operations){
            switch(s){
                case "+":
                    int last = st.pop();
                    int secondLast = st.peek();
                    int newScore = last + secondLast;
                    st.push(last);           // push back the last popped element
                    st.push(newScore);       // push the new score
                    break;

                case "D":
                    st.push(2 * st.peek());
                    break;

                case "C":
                    st.pop();
                    break;

                default:
                    st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int score:st){
            sum+=score;
        }
        return sum;
    }

}
