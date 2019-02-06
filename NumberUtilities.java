


public class NumberUtilities {

    public static String getRange(int stop) {
        String retVal = "";
        
        for(int i = 0;i<stop;i++){
            retVal = retVal+i;
        }
        
        return retVal;
    }

    public static String getRange(int start, int stop) {
        String retVal = "";
        
        for(int i = start;i<stop;i++){
            retVal = retVal+i;
        }
        
        return retVal;
    }


    public static String getRange(int start, int stop, int step) {
        String retVal = "";
        
        for(int i = start;i<stop;i=i+step){
            retVal = retVal+i;
        }
        
        return retVal;
    }

    public static String getEvenNumbers(int start, int stop) {
        String retVal = "";
        
        for(int i = start;i<stop;i++){
            if(i%2==0){
            retVal = retVal+i;
        }
        }
        
        return retVal;
    }


    public static String getOddNumbers(int start, int stop) {
               String retVal = "";
        
        for(int i = start;i<stop;i++){
            if(i%2==1){
            retVal = retVal+i;
        }
        }
        
        return retVal;
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
