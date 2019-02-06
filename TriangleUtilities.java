 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String retVal = "";
        
        for(int x=0;x<numberOfStars; x++) {
            retVal = retVal + "*";
        }
        
        return retVal;
    }
    
    public static String getTriangle(int numberOfRows) {
        String retVal = "";
        
        for(int x=1; x<= numberOfRows; x++) {
            retVal = retVal + getRow(x) + "\n";
        }
        return retVal;
    }


    public static String getSmallTriangle() {
        String retVal = "";
        
        retVal = getTriangle(4);
        
        return retVal;
    }

    public static String getLargeTriangle() {
         String retVal = "";
        
        retVal = getTriangle(9);
        
        return retVal;
    }
}
