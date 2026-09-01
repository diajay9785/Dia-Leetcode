class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    HashMap<String,Integer> map1=new HashMap<>();
    HashMap<String,Integer> map2=new HashMap<>();
    ArrayList<String> ans=new ArrayList<>();
    int min=Integer.MAX_VALUE;
    for(int i=0;i<list1.length;i++){
            map1.put(list1[i],i);
    }
    for(int i=0;i<list2.length;i++){
            map2.put(list2[i],i);
    }
    for(int i=0;i<list1.length;i++){
        if(map2.containsKey(list1[i])){
            int sum=map2.get(list1[i])+map1.get(list1[i]);
            if(sum<min){
                min=sum;
                ans.clear();
                ans.add(list1[i]);
            }
            else if(sum==min){
                ans.add(list1[i]);
            }
        }
    }
    String[] result = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}