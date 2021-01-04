package djk_Sample;

public class dfsTraversal
{

    Graph g;
    public dfsTraversal(Graph g)
    {
        this.g=g;
    }


    class NodeData
    {
        int arrival;
        int departure;
        int NodeVal;

        public NodeData(int arrival, int departure, int nodeVal)
        {
            this.arrival = arrival;
            this.departure = departure;
            this.NodeVal = nodeVal;
        }
    }


}
