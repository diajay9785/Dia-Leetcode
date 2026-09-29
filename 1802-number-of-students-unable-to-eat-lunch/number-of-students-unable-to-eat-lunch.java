class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> stdq=new LinkedList<>();
        Queue<Integer> sanq=new LinkedList<>();
        int m=students.length;
        int n=sandwiches.length;
        for(int i=0;i<m;i++){
            stdq.add(students[i]);
        }
        for(int j=0;j<n;j++){
            sanq.add(sandwiches[j]);
        }
        int count=0;
        while(!(stdq.isEmpty() || sanq.isEmpty())){
            if(stdq.peek()==sanq.peek()){
                stdq.poll();
                sanq.poll();
                count=0;
            }
            else{
                int num=stdq.poll();
                stdq.add(num);
                count++;
            }
            if(count == stdq.size()) {
                break;
            }
        }
        return stdq.size();
    }
}