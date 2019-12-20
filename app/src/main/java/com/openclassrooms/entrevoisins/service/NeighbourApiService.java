package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;


/**
 * Neighbour API client
 */
public interface NeighbourApiService {

    /**
     * Get all my Neighbours
     * @return {@link List}
     */
    List<Neighbour> getNeighbours();

    List<Neighbour> getNeighbourFavorit();

    Neighbour getNeighbourById(int neighbourId);


    /**
     * Deletes a neighbour
     * @param neighbour
     */
    void deleteNeighbour(Neighbour neighbour);

    void deleteNeighbourfavortie(Neighbour neighbour);

    void addNeighbourFavorite(Neighbour neighbour);
}
