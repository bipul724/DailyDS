class Disjoint {
    int parent[];
    int size[];

    public Disjoint(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

    }

    public int findPair(int u) {
        if (parent[u] == u) {
            return u;
        }
        parent[u] = findPair(parent[u]);
        return parent[u];
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findPair(u);
        int ulp_v = findPair(v);

        if (ulp_u == ulp_v) {
            return;
        } else if (size[ulp_u] > size[ulp_v]) {
            size[ulp_u] += size[ulp_v];
            parent[ulp_v] = ulp_u;
        } else {
            size[ulp_v] += size[ulp_u];
            parent[ulp_u] = ulp_v;
        }
    }
}

class Solution {
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        Disjoint ds = new Disjoint(n * n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                int dr[] = { -1, 0, 1, 0 };
                int dc[] = { 0, -1, 0, 1 };

                for (int k = 0; k < 4; k++) {
                    int newr = i + dr[k];
                    int newc = j + dc[k];

                    if (newr >= 0 && newc >= 0 && newr < n && newc < n && grid[newr][newc] == 1) {
                        int nodeNo = i * n + j;
                        int adjNodeNo = newr * n + newc;
                        ds.unionBySize(nodeNo, adjNodeNo);
                    }
                }
            }
        }
        int mx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    continue;
                }
                int dr[] = { -1, 0, 1, 0 };
                int dc[] = { 0, -1, 0, 1 };
                HashSet<Integer> components = new HashSet<>();
                for (int k = 0; k < 4; k++) {
                    int newr = i + dr[k];
                    int newc = j + dc[k];

                    if (newr >= 0 && newc >= 0 && newr < n && newc < n && grid[newr][newc] == 1) {
                        components.add(ds.findPair(newr * n + newc));
                    }
                }
                int sizeTotal = 0;
                for (Integer parent : components) {
                    sizeTotal +=  ds.size[parent];

                }
                mx = Math.max(mx, sizeTotal + 1);
            }
        }

        for (int i = 0; i < n * n; i++) {
            mx = Math.max(mx, ds.size[ds.findPair(i)]);
        }

        return mx;

    }
}