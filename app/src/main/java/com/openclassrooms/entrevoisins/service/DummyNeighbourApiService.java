package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();
    private static List<Neighbour> neighboursFavoris = new ArrayList<>();


    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }


    @Override
    public List<Neighbour> getNeighbourFavorit(){ List<Neighbour> favNeighbourList = new ArrayList<>();               //get favorite in list
        for (Neighbour neighbour : neighbours){
            if (neighbour.getFavorite()){
                favNeighbourList.add(neighbour);
            }
        }
        return favNeighbourList;
    }

    @Override
    public Neighbour getNeighbourById(int neighbourId) {
       for(Neighbour neighbour : neighbours){
           if(neighbour.getId() == neighbourId){
               return neighbour;
           }
       }
        return null;
    }


    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }

    @Override
    public void deleteNeighbourfavortie(Neighbour neighbour) {
        neighbours.get(neighbours.indexOf(neighbour)).setFavorite(false);        //Add to favorite
    }

    @Override
    public void addNeighbourFavorite(Neighbour neighbour) {
        neighbours.get(neighbours.indexOf(neighbour)).setFavorite(true);
    }


}
