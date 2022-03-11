public class Watermelon {
    public Boolean evenly_divisible(int x){

        // check the range of the input for validity
        if( x<1 || x>100)
            return null;

        // return the output when the input is valid
        //If the weight is even then it could be divided into two even weighed parts.
        return ( (x % 2 == 0) && (x != 2) );
    }

}
