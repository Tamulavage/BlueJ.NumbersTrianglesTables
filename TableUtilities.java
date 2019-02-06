 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String retVal = "";
        
        for(int y=1; y<=tableSize; y++) // col loop
        {
        for(int x=y; x<=(tableSize*y); x = x+y)  // row
        {
            retVal = retVal + retVal.format("%3d",x) + " |";
            if(x==(tableSize*y)){
                retVal = retVal + "\n";
            }
        }
    }
        
        
        return retVal;
    }
}
