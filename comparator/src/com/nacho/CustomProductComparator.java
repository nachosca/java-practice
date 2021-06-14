package com.nacho;

import java.util.Comparator;

public class CustomProductComparator implements Comparator<DefaultProduct> {


    @Override
    public int compare(DefaultProduct o1, DefaultProduct o2) {
        int comp = o1.getCategoryName().compareTo(o2.getCategoryName());

        if (comp != 0)
            return comp;

        comp = Double.compare(o1.getPrice(), o2.getPrice());

        if (comp != 0)
            return comp;

        return o1.getProductName().compareTo(o2.getProductName());

    }

}
