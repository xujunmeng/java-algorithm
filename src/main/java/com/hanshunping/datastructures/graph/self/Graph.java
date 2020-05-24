package com.hanshunping.datastructures.graph.self;

import com.junmeng.self.doubleLinkedList.Link;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by jgsoft on 2020/5/24.
 */
public class Graph {

    //存储顶点的集合
    private ArrayList<String> vertexList;

    //存储图对应的邻接矩阵
    private int[][] edges;

    //表示边的个数
    private int numOfEdges;

    //定义一个数组boolean[] ,记录某个节点是否被访问过
    private boolean[] isVisted;


    //构造器  n : 顶点的个数
    public Graph(int n) {

        //初始化矩阵，有n个顶点，对应的矩阵就是 n n
        edges = new int[n][n];

        //初始化 顶点的集合 vertexList
        vertexList = new ArrayList<>(n);

        //初始化时，边默认为0
        numOfEdges = 0;

        isVisted = new boolean[n];
    }

    //得到第一个邻接节点的下标 w
    //返回值是，如果存在就返回对应的下标，否则返回-1
    public int getFirstNeighbor(int index) {
        for (int j = 0; j < vertexList.size(); j++) {
            if (edges[index][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    //根据前一个邻接节点的下标来获取下一个邻接节点
    public int getNextNeighbor(int v1, int v2) {
        for (int j = v2+1; j < vertexList.size(); j++) {
            if (edges[v1][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    //深度优先遍历算法
    //i 第一次就是0
    private void dfs(boolean[] isVisted, int i) {
        //首先我们访问该节点，输出
        System.out.print(getValueByIndex(i) + "->");
        //将该节点设置为已经访问过
        isVisted[i] = true;
        //查找节点i的第一个邻接节点w
        int w = getFirstNeighbor(i);

        while (w != -1) {  //说明有
            if (!isVisted[w]) {  //如果w未被访问过
                dfs(isVisted, w);
            }
            //如果w节点已经被访问过
            w = getNextNeighbor(i, w);
        }
    }

    //对dfs，进行一个重载，遍历我们所有的节点，并进行dfs
    public void dfs() {
        //遍历所有的节点，进行dfs[回溯]
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!isVisted[i]) {
                dfs(isVisted, i);
            }
        }
    }


    //i代表对那个节点进行广度优先遍历
    //对一个节点进行广度优先遍历的方法
    private void bfs(boolean[] isVisted, int i) {
        int u;  //表示队列的头节点对应的下标
        int w;  //邻接节点w
        //队列，记录节点访问的顺序
        LinkedList queue = new LinkedList();
        //访问节点，输出节点的信息
        System.out.println(getValueByIndex(i) + "->");
        //标记为已访问
        isVisted[i] = true;
        //将节点加入队列
        queue.addLast(i);

        while (!queue.isEmpty()) {
            //取出队列的头节点下标
            u = (Integer) queue.removeFirst();
            //得到第一个邻接点的下标w
            w = getFirstNeighbor(u);

            while (w != -1) {  //找到了
                //是否访问过
                if (!isVisted[w]) {
                    System.out.print(getValueByIndex(w) + "->");
                    //标记已经访问
                    isVisted[w] = true;
                    //入队列
                    queue.addLast(w);
                }
                //如果访问过，以u为前驱点(不一定是直接前驱)，找w后面的下一个邻接点
                w = getNextNeighbor(u, w);  //体现出我们的广度优先
            }
        }
    }

    //要遍历所有的节点，都进行广度优先搜索
    public void bfs() {
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!isVisted[i]) {
                bfs(isVisted, i);
            }
        }
    }


    //插入节点
    public void insertVertex(String vertex) {
        vertexList.add(vertex);
    }

    /**
     * 添加边
     * @param v1 第一个顶点对应的下标   表示点的下标，即 第几个顶点
     * @param v2 第二个顶点对应的下标
     * @param weight 0 ：没有直接连接 1：有直接连接
     */
    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges = numOfEdges + 1;
    }

    //图，常用的方法

    //返回节点的个数
    public int getNumOfVertex() {
        return vertexList.size();
    }

    //返回边的数目
    public int getNumOfEdges() {
        return numOfEdges;
    }

    //返回节点i(下标)对应的数据  0 > A;  1 > B; 2 > C;
    public String getValueByIndex(int i) {
        return vertexList.get(i);
    }

    //返回 v1 和 v2 的权值
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    //显示图对应的矩阵
    public void showGraph() {
        for (int[] link : edges) {
            System.out.println(Arrays.toString(link));
        }
    }

}
