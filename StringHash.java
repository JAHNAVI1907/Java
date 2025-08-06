import java.util.HashMap;
class StringHash {
    public static void main(String[] args) {
        HashMap <String,Integer> x= new HashMap<>();
        String[] str={"hello","janu","uma","janu","uma","june"};
        for(int i=0;i<str.length;i++){
            String temp=str[i];
           if(x.containsKey(temp)){
              int prev=x.get(temp);
              x.put(temp,prev+1);
           }else{
               x.put(temp,1);
           }
        }
           for(String y:x.keySet()){
            System.out.println(y+" -> "+x.get(y));
           }
    }
}