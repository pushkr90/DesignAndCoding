package djk_Sample;

public class main {

    public static void main(String[] args)
    {
        Graph g=new Graph();
        g.addEdge("1","2",6);
        g.addEdge("1","3",6);
        g.addEdge("1","4",6);
        g.addEdge("2","3",7);
        g.addEdge("2","5",7);
        g.addEdge("3","4",7);
        g.addEdge("3","5",7);
        g.addEdge("3","6",7);
        g.addEdge("4","6",7);
        g.addEdge("5","6",7);
        g.print();
        System.out.println(g.numOfFanouts(0));
        System.out.println(g.numV());

    }


}
