package recursive_Tree_Graph;

public class getSubset_6 {
    static int n;
    static int[] ch;
    public void DFS(int L){
        if(L==n+1){
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i]==1){tmp+=(i+" ");}

                }
            if(tmp.length()>0){
                System.out.println(tmp);
            }
        }else{
            ch[L]=1;
            DFS(L+1);
            ch[L]=0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        getSubset_6 getSubset = new getSubset_6();
        n=3;
        ch=new int[n+1];
        getSubset.DFS(1);
    }
}
