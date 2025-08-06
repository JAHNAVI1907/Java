import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] runs={100,50,89,70,45};
        String names[]={"janu","uma","rami","valli","sneha"};
        String nicknames[]={"puchiki","duchiki","bochiki","pichik","sonupakodi"};
        Stack<Cricketer> st=new Stack<>();
        for(int i=0;i<runs.length;i++){
            Cricketer c1=new Cricketer(runs[i],names[i],nicknames[i]);
            st.push(c1);
        }
        for(Cricketer x:st){
            System.out.println(x.name+" "+x.run+" "+x.nickname);
        }
    }
    public static class Cricketer{
        int run;
        String name;
        String nickname;
    Cricketer(int run,String name,String nickname){
        this.run=run;
        this.name=name;
        this.nickname=nickname;
    }
    }
}