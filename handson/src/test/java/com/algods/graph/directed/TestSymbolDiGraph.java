package com.algods.graph.directed;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;	


import org.junit.Before;
import org.junit.Test;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.SymbolDiGraph;

public class TestSymbolDiGraph
{

        private String jobs;
	

	@Before
	public void setUp()
	{
            // the file should be in the classpath
            jobs = "./src/test/resources/jobs.txt";
		
	}

        @Test
        public void testSymbolDiGraphForJobs()
        {


            SymbolDiGraph symbolDiGraph = new SymbolDiGraph(jobs, "/");


            DiGraph g = symbolDiGraph.G();

            System.out.println("Vertices: " + g.V() + " Edges: " + g.E());
            System.out.println("\n");
            for(int i = 0; i < g.V(); i++)
            {
               System.out.println(symbolDiGraph.name(i) + ":");
               for(int k:g.adj(i))
               {
                  System.out.print(symbolDiGraph.name(k) + "   ");
               }
               System.out.println("\n");

            }

            assertEquals(true, true);
        }

        @Test
        public void testGetJobs()
        {

            SymbolDiGraph symbolDiGraph = new SymbolDiGraph(jobs, "/");

            DiGraph g = symbolDiGraph.G();
            String source = "Algorithms";

            System.out.println("\n\n" + source + ":\n\n");

            for(int k:g.adj(symbolDiGraph.index(source)))
            {
                System.out.println("    " + symbolDiGraph.name(k));
            }

            System.out.println("\n\n");

            assertEquals(true, true);

        }


}

