public class MinMax {
    public static Double min(double[] arr){
        if(arr.length == 0){
            return null;
        }
        double min = arr[0];
        for(int i=1 ; i < arr.length; i++){
            if (arr[i]<min)
                min = arr[i];
        }
        return min;
    }
    public static Double max(double[] arr){
        if(arr.length ==0){
            return null;
        }
        double max = arr[0];
        for(int i=1 ; i < arr.length; i++){
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }
}
