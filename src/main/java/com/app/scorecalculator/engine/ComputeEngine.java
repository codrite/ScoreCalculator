package com.app.scorecalculator.engine;

import java.util.Set;
import java.util.TreeSet;

public abstract class ComputeEngine<E extends Comparable<E>> {

    protected Set<E> elementSet;

    public ComputeEngine() {
        this.elementSet = new TreeSet<>();
    }

    public void addElementsForSorting(Set<E> unsortedElements) {
        elementSet.addAll(unsortedElements);
    }

    public abstract Integer calculateScore();

}
