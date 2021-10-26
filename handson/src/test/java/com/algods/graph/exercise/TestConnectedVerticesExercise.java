package com.algods.graph.exercise;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.algods.graph.undirected.Graph;
import com.algods.graph.exercise.ConnectedVerticesExercise;

public class TestConnectedVerticesExercise
{
        private Graph graph;
	

	@Before
	public void setUp()
	{

                // this is an undirected graph with some cycles.
                graph = new Graph(13);

                graph.addEdge(0, 5);
                graph.addEdge(4, 3);
                graph.addEdge(0, 1);
                graph.addEdge(9, 12);
                graph.addEdge(6, 4);
                graph.addEdge(5, 4);
                graph.addEdge(0, 2);
                graph.addEdge(11, 12);
                graph.addEdge(9, 10);
                graph.addEdge(0, 6);
                graph.addEdge(7, 8);
                graph.addEdge(9, 11);
                graph.addEdge(5, 3);
	}

        @Test
        public void testConnected()
        {
           ConnectedVerticesExercise connectedVerticesExercise
                                        = new ConnectedVerticesExercise(graph);

           System.out.println("\n\n");
           System.out.println(connectedVerticesExercise.connected(0,3));
           System.out.println(connectedVerticesExercise.connected(3,0));
           System.out.println(connectedVerticesExercise.connected(2,12));

           System.out.println(connectedVerticesExercise.connected(5,3));
           System.out.println(connectedVerticesExercise.connected(3,5));

           System.out.println("\n\n");

        }
}


