package com.algods.graph.directed.order;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.SymbolDiGraph;
import com.algods.graph.directed.order.Topological;


public class TestTopological
{
	private DiGraph g;
        private String jobs;
	

	@Before
	public void setUp()
	{

                // the file should be in the classpath
                jobs = "./src/test/resources/jobs.txt";


		g = new DiGraph(13);

		g.addEdge(0,1);
		g.addEdge(0,5);
		g.addEdge(0,6);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,5);
		g.addEdge(5,4);
		g.addEdge(6,4);
		g.addEdge(6,9);
		g.addEdge(7,6);
                g.addEdge(8,7);
                g.addEdge(9,10);
                g.addEdge(9,11);
                g.addEdge(9,12);
                g.addEdge(11,12);
	}
	
        @Test
        public void testIsDAG()
        {

           SymbolDiGraph symbolDiGraph = new SymbolDiGraph(jobs, "/");
           DiGraph g = symbolDiGraph.G();

           Topological topological = new Topological(g);

           assertTrue(topological.isDAG());

        }

        @Test 
        public void testTopologicalOrder()
        {

           SymbolDiGraph symbolDiGraph = new SymbolDiGraph(jobs, "/");
           DiGraph g = symbolDiGraph.G();

           Topological topological = new Topological(g);

           Iterable<Integer> order = topological.order();

           System.out.println("\n\n");
           System.out.println("Topological order for jobs:\n");

           for(int k:order)
           {
               System.out.print(symbolDiGraph.name(k) + "   ");
           }

           System.out.println("\n\n");

           assertEquals(true,true);
        }

}

