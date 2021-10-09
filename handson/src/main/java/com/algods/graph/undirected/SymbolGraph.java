package com.algods.graph.undirected;

import java.util.Map;
import java.util.stream.Stream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;


/**
  * <h1>SymbolGraph</h1>
  * This class is an implementation for Symbol Graph for graphs
  * <p> Implementation for Symbol Graph layer for Graphs  in Java
  *
  *
  * @author  Satish Srinivasan
  * @version 1.0
  * @since   2021-10-09
  */


public class SymbolGraph
{

    private Graph g;
    private Map<String, Integer> nameMap;
    private String[] indexArray;

    public SymbolGraph(String filePath, String delim)
    {
       this.populateNameMap(filePath,delim);
       this.populateIndexArray();
       this.populateGraph(filePath,delim);
    }


    public boolean contains(String s)
    {

       if(s == null || s.length() == 0)
       {
          return false;
       }

       return nameMap.containsKey(s);
    }

    public int index(String s)
    {
      
       if(s == null || s.length() == 0)
       {
          return -1;
       }

       return nameMap.get(s);
    }

    public String name(int v)
    {
       if(v < 0 || v >= indexArray.length)
       {
          return null;
       }
       return indexArray[v];
    }

    public Graph G()
    {
       return g;
    }

    private void populateNameMap(String filePath,String delim)
    {
         Path path = Paths.get(filePath);

         try(Stream<String> streamOfLines = Files.lines(path);)
         {
             streamOfLines.forEach(line -> {
                 String[] lineArray = line.split(delim);
                 for(String s:lineArray)
                 {
                     nameMap.put(s, nameMap.size());
                 }
              }
             );
         }catch(IOException e)
         {
             throw new RuntimeException(e.getMessage(),e);
         }


    }

    private void populateIndexArray()
    {
       indexArray = new String[nameMap.size()];

       for(String s:nameMap.keySet())
       {
          indexArray[nameMap.get(s)] = s;
       }
    }

    private void populateGraph(String filePath, String delim)
    {
       g = new Graph(nameMap.size());
       
       Path path = Paths.get(filePath);

       try(Stream<String> streamOfLines = Files.lines(path);)
       {
           streamOfLines.forEach(line -> {
                 String[] lineArray = line.split(delim);
                 int firstVertex = nameMap.get(lineArray[0]);

                 for(int i = 1; i < lineArray.length; i++)
                 {
                     g.addEdge(firstVertex, nameMap.get(lineArray[i]));
                 }
              }
           );
       }catch(IOException e)
       {
           throw new RuntimeException(e.getMessage(),e);
       }

  
    }
}
