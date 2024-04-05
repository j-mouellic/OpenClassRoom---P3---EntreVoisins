package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;

public class SetFavoriteNeighbourEvent {

    public Neighbour neighbour;

    public SetFavoriteNeighbourEvent(Neighbour neighbour) {
        this.neighbour = neighbour;
    }
}
