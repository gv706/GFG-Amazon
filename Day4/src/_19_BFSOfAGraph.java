import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _19_BFSOfAGraph {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res=new ArrayList<>();
        boolean[] vis=new boolean[V];

        Queue<Integer> q=new LinkedList<>();
        int start=0;
        q.add(start);
        vis[start]=true;

        while (!q.isEmpty()){
            int ele=q.poll();
            res.add(ele);
            ArrayList<Integer> al=adj.get(ele);
            for (int a:al){
                if (!vis[a]){
                    q.add(a);
                    vis[a]=true;
                }
            }
        }

        return res;
        //Time: O(V+E)
        //Space: O(V)
    }
}
