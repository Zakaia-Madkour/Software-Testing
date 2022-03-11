import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class YoungPhysicistTest {

    @Test
    public void in_Equilibrium() throws FileNotFoundException {
        //--------------specify the path of test directory on you machine here--------------------------------
        String filePath ="D:\\Studying\\Semester 2\\Testing\\Labs\\Assignment 1\\Young physicist\\TestCases";
        //----------------------------------------------------------------------------------------------------

        //-------Modify the loop variable to include your newly added test cases------------------------------
        for (int i=1; i<=4;i++){
            String testFileName =filePath+"/test"+ i +".txt";
            // reading the result from the result file
            String resultFileName =filePath+"/result"+ i +".txt";
            File resultFile = new File(resultFileName);
            Scanner in = new Scanner(resultFile);

            // reading the test result and translating it
            String expected_result = in.nextLine();
            Boolean result_expected=null;
            if(expected_result.equalsIgnoreCase("true"))
                result_expected = true;
            else if(expected_result.equalsIgnoreCase("false"))
                result_expected = false;
            else if(expected_result.equalsIgnoreCase("null"))
                result_expected = null;

            // calling the function we need to test
            Boolean result = new YoungPhysicist().in_Equilibrium(testFileName);
            assertEquals(result_expected,result);
            in.close();

        }
    }
}