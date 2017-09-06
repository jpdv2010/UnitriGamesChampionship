package com.UnitriGamesChampionship.unitriGamesChampionship.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by joaop on 06/09/2017.
 */
@Entity
public class Team {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    List<Competitor> competitors=new List<Competitor>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Competitor> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Competitor competitor) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Competitor> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Competitor> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Competitor get(int index) {
            return null;
        }

        @Override
        public Competitor set(int index, Competitor element) {
            return null;
        }

        @Override
        public void add(int index, Competitor element) {

        }

        @Override
        public Competitor remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Competitor> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Competitor> listIterator(int index) {
            return null;
        }

        @Override
        public List<Competitor> subList(int fromIndex, int toIndex) {
            return null;
        }
    };


}
