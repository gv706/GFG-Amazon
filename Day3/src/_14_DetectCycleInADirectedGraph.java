import java.util.ArrayList;

public class _14_DetectCycleInADirectedGraph {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] vis=new boolean[V];
        boolean[] dfsVis=new boolean[V];

        for (int i=0;i<V;i++){
            if (!vis[i] && check(adj, i, vis, dfsVis))
                return true;
        }
        return false;
    }

    static boolean check(ArrayList<ArrayList<Integer>> adj, int u, boolean[] vis, boolean[] dfsVis){
        vis[u]=true;
        dfsVis[u]=true;
        ArrayList<Integer> al=adj.get(u);
        for (int v:al){
            if (!vis[v]){
                if (check(adj, v, vis, dfsVis))
                    return true;
            }
            else if (dfsVis[v])
                return true;
        }

        dfsVis[u]=false;
        return false;
    }
}
