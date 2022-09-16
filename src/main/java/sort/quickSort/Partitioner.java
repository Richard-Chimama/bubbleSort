package sort.quickSort;

import sort.bubble.Sortable;
import sort.bubble.Swapper;

import java.util.Comparator;

public class Partitioner<E> {
    private final Comparator<E> comparator;
    private final Swapper swapper;

    public Partitioner(Comparator<E> comparator, Swapper swapper){
        this.comparator = comparator;
        this.swapper = swapper;
    }


    public int partition(Sortable<E> sortable, int start, int end, E pivot){
        var small = start;
        var large = end;
        while(large > small){
            while(comparator.compare(sortable.get(small),pivot ) < 0 && small < large){
                small++;
            }// while loop
            while(comparator.compare(sortable.get(large), pivot) >= 0 && small < large){
                large--;
            }
            if(small < large){
                swapper.swap(small, large);
            }
        }//second while loop

        return large;
    }

}
