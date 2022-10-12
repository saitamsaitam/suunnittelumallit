package strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOne implements ListConverter {

    @Override
    public String listToString(List list) {
        String stringList = "";
        ArrayList arrayList = new ArrayList();
        for(int i=0; i<list.size(); i++) {
            arrayList.add(list.get(i));
        }

        for(Iterator i = arrayList.iterator(); i.hasNext();) {
        	stringList += i.next()+"\n";
        }


        return stringList;
    }
}