package com.algods.graph.undirected;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;
import com.algods.graph.undirected.SymbolGraph;

public class TestSymbolGraph
{

        private String routes;
        private String movies;
	

	@Before
	public void setUp()
	{
            // both the files should be in the classpath
            routes = "./src/test/resources/routes.txt";
            movies = "./src/test/resources/movies.txt";
		
	}
	
	@Test
	public void testSymbolGraphForRoutes()
	{


            SymbolGraph symbolGraph = new SymbolGraph(routes, " ");

            System.out.println(symbolGraph.name(0));
            System.out.println(symbolGraph.name(1));
            System.out.println(symbolGraph.name(2));
            System.out.println(symbolGraph.name(3));
            System.out.println(symbolGraph.name(4));
            System.out.println(symbolGraph.name(5));
            System.out.println(symbolGraph.name(6));
            System.out.println(symbolGraph.name(7));
            System.out.println(symbolGraph.name(8));
            System.out.println(symbolGraph.name(9));

            System.out.println("\n\n");

            Graph g = symbolGraph.G();
             
            System.out.println("Vertices: " + g.V() + " Edges:" + g.E());
            System.out.println("\n");
            for(int i = 0; i < g.V(); i++)
            {
               System.out.println(symbolGraph.name(i) + ":");
               for(int k:g.adj(i))
               {
                  System.out.print(symbolGraph.name(k) + " ");
               }
               System.out.println("\n");

            }

            assertEquals(true, true);
	}

        @Test
        public void testGetRoute()
        {

            SymbolGraph symbolGraph = new SymbolGraph(routes, " ");

            Graph g = symbolGraph.G();
            String source = "JFK";

            System.out.println("\n\n" + source + ":\n\n");

            for(int k:g.adj(symbolGraph.index(source)))
            {
                System.out.print(symbolGraph.name(k) + "  ");
            }

            System.out.println("\n\n");

            assertEquals(true, true);

        }


        @Test
        public void testSymbolGraphForMovies()
        {


            SymbolGraph symbolGraph = new SymbolGraph(movies, "/");


            Graph g = symbolGraph.G();

            System.out.println("Vertices: " + g.V() + " Edges:" + g.E());
            System.out.println("\n");
            for(int i = 0; i < g.V(); i++)
            {
               System.out.println(symbolGraph.name(i) + ":");
               for(int k:g.adj(i))
               {
                  System.out.print(symbolGraph.name(k) + "   ");
               }
               System.out.println("\n");

            }

            assertEquals(true, true);
        }

        @Test
        public void testGetMovies()
        {

            SymbolGraph symbolGraph = new SymbolGraph(movies, "/");

            Graph g = symbolGraph.G();
            String source = "Bacon, Kevin";

            System.out.println("\n\n" + source + ":\n\n");

            for(int k:g.adj(symbolGraph.index(source)))
            {
                System.out.println("    " + symbolGraph.name(k));
            }

            System.out.println("\n\n");

            assertEquals(true, true);

        }


}

