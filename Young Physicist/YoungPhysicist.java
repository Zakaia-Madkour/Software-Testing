import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class YoungPhysicist {
    public Boolean in_Equilibrium(String str) throws FileNotFoundException {
        File myfile = new File(str);
        Scanner sc = new Scanner(myfile);
        int n = sc.nextInt();
        // check the value of the input to be in range
        if(n<1 || n> 100){
            sc.close();
            return null;
        }
        int sum_x=0;
        int sum_y=0;
        int sum_z=0;
        // sum the components of the forces in each coordinate
        for(int i =0 ; i < n ;i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            int z= sc.nextInt();
            //check the values of the components to be in range
            if(x<-100||x>100||y<-100||y>100||z<-100||z>100){
                sc.close();
                return null;
            }
            sum_x+=x;
            sum_y+=y;
            sum_z+=z;
        }
        sc.close();
        return (sum_x == 0 && sum_y == 0 && sum_z == 0);
    }
}
