package q1refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	  iterateItems(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  iterateItems(edgeList, p);
      return null;
   }

    <T extends GraphObject> T iterateItems(List<T> itemList, String p) {
    	for (T item : itemList) {
			if (item.contains(p))
				System.out.println(item);
		}
		return null;
    }
}

class GraphObject {
	   String name;

	   public boolean contains(String p) {
	      return name.contains(p);
	   }
}
class Node extends GraphObject {

}

class Edge extends GraphObject {
   
}