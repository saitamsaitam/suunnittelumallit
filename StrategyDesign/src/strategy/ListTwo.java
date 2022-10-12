package strategy;


import java.util.List;

public class ListTwo implements ListConverter {

	@Override
	public String listToString(List list) {
        String stringList = "";
        String lista[] = new String[list.size()];

        for(int i = 0; i<list.size(); i++) {
            lista[i] = list.get(i).toString();
        }

        for(int i = 1; i<list.size()+1; i++) {
        	stringList += lista[i-1];
            if(i%2 == 0) {
            	stringList += "\n";
            }
        }
        return stringList;
    }
}