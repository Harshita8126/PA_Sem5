import java.util.Stack;

public class lc_901_onlinestockspan {
     Stack<int[]> st;
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            span+=st.pop()[1];
        }
        st.push(new int[]{price,span});
    return span;
    }
}
