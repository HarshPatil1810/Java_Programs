class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();

        for(int student:students ){
            q.offer(student);
        }

        int c=0;
        int index=0;

        while(!q.isEmpty()){
            if(q.peek() == sandwiches[index]){
                q.poll();
                index++;

                c=0;
            }else{
                q.offer(q.poll());
                c++;
            }

            if(c==q.size()){
                break;
            }

           
        }
         return q.size();
    }
}
