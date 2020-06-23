package com.hanshunping.datastructures.graph.self;

/**
 * Created by jgsoft on 2020/5/24.
 */
public class GraphDemo {

    public static void main(String[] args) {
        //测试一把图是否创建OK

        //节点的个数
        int n = 5;

        //顶点的值
        String vertexs[] = {"A", "B", "C", "D", "E"};

        //创建图对象
        Graph graph = new Graph(n);
        //循环的添加顶点
        for (String vertex : vertexs) {
            graph.insertVertex(vertex);
        }

        //添加边
        //A-B A-C
        //B-C B-D B-E
        graph.insertEdge(0, 1, 1);//A-B
        graph.insertEdge(0, 2, 1);//A-C
        graph.insertEdge(1, 2, 1);//B-C
        graph.insertEdge(1, 3, 1);//B-D
        graph.insertEdge(1, 4, 1);//B-E

        //显示一把邻接矩阵
        graph.showGraph();

        //测试一把，dfs遍历是否OK
        System.out.println("深度遍历");
//        graph.dfs();  //A -> B -> C -> D -> E

        System.out.println("广度优先遍历");
        graph.bfs();

    }

}
