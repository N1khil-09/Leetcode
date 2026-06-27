class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        long mul=rowIndex;
        if(rowIndex==0){
            return list;
        }
        long nr=rowIndex;
        long dr=1;
        for(int i=1;i<=rowIndex-1;i++){
            
            list.add((int)mul);
            mul*=(rowIndex-(i));
            mul/=i+1;
            
        }
        list.add(1);
        return list;
        
    }
}