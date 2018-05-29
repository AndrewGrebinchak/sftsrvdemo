package ua.ifr.sftsrv;

import static org.junit.Assert.fail;

import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.apache.tinkerpop.gremlin.structure.T;
import org.apache.tinkerpop.gremlin.structure.Vertex;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerFactory;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;
import org.junit.Test;

public class Gremlin1Test {

	@Test
	public void test() {
		TinkerGraph graph = TinkerFactory.createModern();
		GraphTraversalSource g = graph.traversal();
//		System.out.println(g.V().toList());
//		System.out.println(g.V().outE().toList());
//		System.out.println(g.V().inE().toList());
		System.out.println(g.V().values("age", "name").toList());		
//		System.out.println(g.V(1).outE("knows").values("weight").toList());
//		System.out.println(g.V(3).outV().values("name").toList());
//		System.out.println(g.V(1).out("knows").has("age", P.lt(30)).values("name").toList());
//		Vertex foobar = g.addV("person").property(T.id, 12).property("name", "marko").property("age", 29).next();
//		System.out.println(foobar.label());
//		
//		g.addE("knows").from(g.V(1)).to(foobar).property("weight", 0.4).iterate();
//        System.out.println( g.V(1).outE("knows").inV().values("name").toList());
//        
//        System.out.println( g.V().has("age",35).toList());

		//create node 'software' with properties
//        Vertex f2 = g.addV("software").property(T.id, 13).property("name", "lop").property("lang", "java").next();
//        System.out.println(f2.label());
        
        //add new edge with link from v1 to f2=software
//        g.addE("software").from(g.V(1)).to(f2).property("weight", 0.5).iterate();
//        System.out.println( g.V(1).outE("software").inV().values("name").toList());
//        System.out.println( g.V(1).outE("software").inV().values("lang").toList());
        
//		fail("Not yet implemented");
	}

}
