package com.algods.graph.directed.dfs.path;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.directed.DiGraph;
import com.algods.graph.directed.dfs.path.BreadthFirstDirectedPaths;


public class TestBreadthFirstDirectedPaths
{
	private DiGraph g;
	

	@Before
	public void setUp()
	{
		g = new DiGraph(13);
		g.addEdge(4,2);
		g.addEdge(2,3);
		g.addEdge(3,2);
		g.addEdge(6,0);
		g.addEdge(0,1);
		g.addEdge(2,0);
		g.addEdge(11,12);
		g.addEdge(12,9);
		g.addEdge(9,10);
		g.addEdge(9,11);
                g.addEdge(8,9);
                g.addEdge(10,12);
                g.addEdge(11,4);
                g.addEdge(4,3);
                g.addEdge(3,5);
                g.addEdge(7,8);
                g.addEdge(8,7);
	        g.addEdge(5,4);
                g.addEdge(0,5);
                g.addEdge(6,4);
                g.addEdge(6,9);
                g.addEdge(7,6);	
	}
	
	@Test
	public void testHaspathTo()
	{

                BreadthFirstDirectedPaths breadthFirstDirectedPaths = new BreadthFirstDirectedPaths(g,0);

                assertTrue(breadthFirstDirectedPaths.hasPathTo(2));
                assertFalse(breadthFirstDirectedPaths.hasPathTo(6));
                assertFalse(breadthFirstDirectedPaths.hasPathTo(9));
                assertTrue(breadthFirstDirectedPaths.hasPathTo(0));
	}

        @Test
        public void testPrintPath1()
        {
               BreadthFirstDirectedPaths breadthFirstDirectedPaths = new BreadthFirstDirectedPaths(g,0);
               int dest1 = 2;

               System.out.format("\n\n path for %s is:\n", dest1);

               Iterable<Integer> itl = breadthFirstDirectedPaths.pathTo(dest1);

               if(itl != null)
               {
                  for(int k:itl)
                  {
                     System.out.print(k + " ");

                  }
                  
               }else
               {
                  System.out.println("No Path found");
               }

               System.out.println("\n\n");

               assertEquals(true,true);
        }

        @Test
        public void testPrintPath2()
        {
               BreadthFirstDirectedPaths breadthFirstDirectedPaths = new BreadthFirstDirectedPaths(g,0);
               int dest1 = 3;

               System.out.format("\n\n path for %s is:\n", dest1);

               Iterable<Integer> itl = breadthFirstDirectedPaths.pathTo(dest1);

               if(itl != null)
               {
                  for(int k:itl)
                  {
                     System.out.print(k + " ");

                  }

               }else
               {
                  System.out.println("No Path found");
               }

               System.out.println("\n\n");

               assertEquals(true,true);
        }




}

