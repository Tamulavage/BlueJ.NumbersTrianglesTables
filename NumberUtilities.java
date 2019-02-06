


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String retVal = "";
        
        for(int i = start;i<stop;i=i+step){
            retVal = retVal+i;
        }
        
        return retVal;
    }

    public static String getEvenNumbers(int start, int stop) {
    /*    String retVal = "";
        
        for(int i = start;i<stop;i++){
            if(i%2==0){
            retVal = retVal+i;
        }
        }
        
        return retVal;*/
        // re-writeen below
       return getRange((start%2==0)?start:(start+1), stop, 2);
    }


    public static String getOddNumbers(int start, int stop) {
         /*      String retVal = "";
        
        for(int i = start;i<stop;i++){
            if(i%2==1){
            retVal = retVal+i;
        }
        }
        
        return retVal; */
        //re-writeen below
        return getRange((start%2==1)?start:(start+1), stop, 2);
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String retVal = "";
        int tempSum = 0;
        
        for(int i = start;i<=stop;i++){
            
            tempSum = (int)Math.pow(i,exponent)*1;
          
            retVal = retVal + tempSum;
        }
        
        return retVal;
    }
}
