package org.example;

import java.util.Comparator;

public class BublleSort  implements Sort, SortSupport{

    private Comparator comparator = null;
    private Swapper swapper = null;

    @Override
    public void setComparator(Comparator comparator){
        this.comparator = comparator;
    }

    @Override
    public void setSwapper(Swapper swapper){
        this.swapper = swapper;
    }

    @Override
    public void sort(Sortable collection) {
        var n = collection.size();
        while (n > 1) {
            for (int j = 0; j < n-1; j++) {
                if (comparator.compare(collection.get(j), collection.get(j + 1)) > 0) {
                    swapper.swap(j, j+1);
                }
            }
            n--;
        }//end of sort
    }

}//end of the class
