package aed.individual6;

import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.set.Set;
import es.upm.aedlib.map.HashTableMap;

public class Suma {
	
	public static <E> Integer sumaRec(Integer sum, DirectedGraph<Integer, E> g, Vertex<Integer> currentVex, Set<Vertex<Integer>> seen) {
		if(!seen.contains(currentVex)) {
			sum+=currentVex.element().intValue();
			for(Edge<E> out : g.outgoingEdges(currentVex)) {
				seen.add(currentVex);
				Vertex<Integer> newVex=g.endVertex(out);
				sum=sumaRec(sum, g, newVex, seen);
			}
		}
		return sum;
	}
	
	public static <E> Map<Vertex<Integer>,Integer> sumVertices(DirectedGraph<Integer,E> g) {
		Map<Vertex<Integer>, Integer> map=new HashTableMap<Vertex<Integer>, Integer>();
		for(Vertex<Integer> vex : g.vertices()) {
			Set<Vertex<Integer>> seen=new HashTableMapSet<Vertex<Integer>>();
			Integer sum=0;
			sum=sumaRec(sum, g, vex, seen);
			map.put(vex, sum);
		}
		return map;
	}
}
