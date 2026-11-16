public class Assignment01Q05 
{
public static int findShortestPath(int[][] m, int i, int j) 
{
    if (i == j) //vertex is itself
    {
        return 0;
    }

    int n = m.length;
    int[] dist = new int[n]; //max length of a path
    
    for (int k = 0; k < n; k++) 
    {
        dist[k] = -1;
    }
    dist[i] = 0;

    for (int step = 0; step < n - 1; step++) 
    {
        boolean updated = false;
        
        for (int u = 0; u < n; u++)
        {
            if (dist[u] != -1)// to make sure were not going backwards
            { 
                for (int v = 0; v < n; v++)
                {
                    if (m[u][v] == 1)//direct path exists
                    { 
                        if (dist[v] == -1 || dist[u] + 1 < dist[v])//in case v was unvisited - its valid
                        {
                            dist[v] = dist[u] + 1;
                            updated = true;
                        }
                    }
                }
            }
        }
        
        if (updated == false)//no updates means no shorter path - no need for the rest of the loop as any other path will be longer at best.
        {
            break;
        }
    }

    return dist[j];
}

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}