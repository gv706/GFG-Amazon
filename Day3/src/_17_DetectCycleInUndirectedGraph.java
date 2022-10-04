import java.util.ArrayList;

public class _17_DetectCycleInUndirectedGraph {
    static boolean check(int v,int p, boolean[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[v]=true;
        ArrayList<Integer> al=adj.get(v);
        for (int va:al){
            if (!vis[va]){
                if(check(va,v, vis, adj)) return true;
            }
            else if (va!=p)
                return true;
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis=new boolean[V];
        for (int i=0;i<V;i++){
            if (!vis[i]) {
                if (check(i, -1, vis, adj)) return true;
            }
        }
        return false;
    }
}
