import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        NodeGraph nodeA = new NodeGraph(null, "A");
        NodeGraph nodeB = new NodeGraph(null, "B");
        NodeGraph nodeC = new NodeGraph(null, "C");
        NodeGraph nodeD = new NodeGraph(null, "D");
        NodeGraph nodeE = new NodeGraph(null, "E");
        NodeGraph nodeF = new NodeGraph(null, "F");
        NodeGraph nodeG = new NodeGraph(null, "G");
        NodeGraph nodeH = new NodeGraph(null, "H");
        NodeGraph nodeI = new NodeGraph(null, "I");
        NodeGraph nodeJ = new NodeGraph(null, "J");

        List<NodeGraph> linksFromA = new ArrayList<>();
        linksFromA.add(nodeB);
        linksFromA.add(nodeC);
        linksFromA.add(nodeD);
        linksFromA.add(nodeE);
        nodeA.setLink(linksFromA);

        List<NodeGraph> linkFromB = new ArrayList<>();
        linkFromB.add(nodeF);
        linkFromB.add(nodeC);
        nodeB.setLink(linkFromB);

        List<NodeGraph> linkFromC = new ArrayList<>();
        linkFromC.add(nodeG);
        nodeC.setLink(linkFromC);

        List<NodeGraph> linkFromD = new ArrayList<>();
        linkFromD.add(nodeC);
        linkFromD.add(nodeH);
        nodeD.setLink(linkFromD);

        List<NodeGraph> linkFromE = new ArrayList<>();
        linkFromE.add(nodeD);
        linkFromE.add(nodeI);
        nodeE.setLink(linkFromE);

        List<NodeGraph> linkFromF = new ArrayList<>();
        linkFromF.add(nodeJ);
        nodeF.setLink(linkFromF);

        List<NodeGraph> linkFromG = new ArrayList<>();
        linkFromG.add(nodeH);
        linkFromG.add(nodeJ);
        nodeG.setLink(linkFromG);

        List<NodeGraph> linkFromH = new ArrayList<>();
        linkFromH.add(nodeJ);
        nodeH.setLink(linkFromH);

        List<NodeGraph> linkFromI = new ArrayList<>();
        linkFromI.add(nodeJ);
        nodeI.setLink(linkFromI);

        System.out.println(nodeA.value);
    }
}
