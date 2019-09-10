package aed.caminos;

import java.util.Iterator;

import es.upm.aedlib.Entry;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.set.Set;
import es.upm.aedlib.set.HashTableMapSet;
import es.upm.aedlib.set.PositionListSet;
import es.upm.aedlib.priorityqueue.PriorityQueue;
import es.upm.aedlib.priorityqueue.HeapPriorityQueue;
import es.upm.aedlib.map.Map;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.graph.DirectedAdjacencyListGraph;


public class Transportistas {
	private DirectedGraph<Point,Integer> graph;
  
	public Transportistas(Integer[][] map) {
		this.graph=new DirectedAdjacencyListGraph<Point,Integer>();
		for(int x=0; x<map.length; x++) {
			for(int y=0; y<map[x].length; y++) {
				if(map[x][y]!=null) {
					graph.insertVertex(new Point(x,y));
				}
			}
		}
		Iterator<Vertex<Point>> v=graph.vertices().iterator();
		while(v.hasNext()) {
			Vertex<Point> vt1=v.next();
			Iterator<Vertex<Point>> v2=graph.vertices().iterator();
			while(v2.hasNext()) {
				Vertex<Point> vt2=v2.next();
				int x1=vt1.element().getX();
				int x2=vt2.element().getX();
				int y1=vt1.element().getY();
				int y2=vt2.element().getY();
				Integer peso=(map[x2][y2]-map[x1][y1]);
				if(peso<=0) {
					peso=1;
				}
				else {
					peso+=1;
				}
				if((vt1.element().getX()==vt2.element().getX()-1 || vt1.element().getX()==vt2.element().getX()+1) && vt1.element().getY()==vt2.element().getY()) {
					graph.insertDirectedEdge(vt1, vt2, peso);
				}
				if((vt1.element().getX()==vt2.element().getX() && (vt1.element().getY()==vt2.element().getY()-1 || vt1.element().getY()==vt2.element().getY()+1))) {
					graph.insertDirectedEdge(vt1, vt2, peso);
				}
			}
		}
	}
	
	private static Vertex<Point> findVertex(DirectedGraph<Point,Integer> g, Point xy) {
		for(Vertex<Point> v : g.vertices()) {
			if(v.element().equals(xy)) {
				return v;
			}
		}
		return null;
	}
	
	public PositionList<Point> pathFromTo(Point fromPoint, Point toPoint) {
		Vertex<Point> from=findVertex(graph, fromPoint);
		PositionList<Point> path=new NodePositionList<Point>();
		Set<Point> visited=new HashTableMapSet<Point>();
		path.addFirst(fromPoint);
		visited.add(fromPoint);
		return pathFromToRec(from, toPoint, path, visited);
	}

	private PositionList<Point> pathFromToRec(Vertex<Point> from, Point toPoint, PositionList<Point> path, Set<Point> visited) {
		if(path.last().element().getX()==toPoint.getX() && path.last().element().getY()==toPoint.getY()) {
			return path;
		}
		boolean found=false;
		Iterator<Edge<Integer>> it=graph.outgoingEdges(from).iterator();
		while(it.hasNext() && !found) {
			Edge<Integer> e=it.next();
			Vertex<Point> v=graph.endVertex(e);
			if(path.last().element().getX()==toPoint.getX() && path.last().element().getY()==toPoint.getY()) {
				found=true;
			}
			else if(!visited.contains(v.element())) {
				path.addLast(v.element());
				visited.add(v.element());
				path=pathFromToRec(v, toPoint, path, visited);
			}
		}
		if(!(path.last().element().getX()==toPoint.getX() && path.last().element().getY()==toPoint.getY())) {
			Position<Point> rem=path.last();
			visited.remove(rem.element());
			path.remove(rem);
		}
		return path;
	}

	public PositionList<Point> bestPathFromTo(Point fromPoint,Point toPoint) {
		PriorityQueue<Integer, Vertex<Point>> pq=new HeapPriorityQueue<Integer, Vertex<Point>>();
		Map<Vertex<Point>, Entry<Integer, Vertex<Point>>> cloud=new HashTableMap<Vertex<Point>, Entry<Integer, Vertex<Point>>>();
		Map<Vertex<Point>, Edge<Integer>> from=new HashTableMap<Vertex<Point>, Edge<Integer>>();
		for(Vertex<Point> v : graph.vertices()) {
			Vertex<Point> fr=findVertex(graph, fromPoint);
			if(fr==v) {
				pq.enqueue(0, v);
				cloud.put(v, pq.dequeue());
				pq.enqueue(0, v);
			}
			else {
				pq.enqueue(Integer.MAX_VALUE, v);
				cloud.put(v, pq.dequeue());
				pq.enqueue(Integer.MAX_VALUE, v);
			}
		}
		while(!pq.isEmpty()) {
			Entry<Integer, Vertex<Point>> ve=pq.dequeue();
			cloud.remove(ve.getValue());
			Vertex<Point> v=ve.getValue();
			for(Edge<Integer> e : graph.outgoingEdges(v)) {
				if(cloud.containsKey(graph.endVertex(e))) {
					Integer newcost=ve.getKey()+e.element();
					Entry<Integer, Vertex<Point>> en=cloud.get(graph.endVertex(e));
					Integer costv=en.getKey();
					if(newcost<costv) {

					}
				}
			}
		}
		return null;
	}
}
