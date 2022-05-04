public class Q3 {
        String state = "NORMAL";
        String state1 = "TIME";
        String state2 = "min";
        String state3 = "ALARM";
        int m=0,h=0, D=1,M=1, Y=2000;


        void IO(char x){
            switch(state) {
                case "NORMAL": {
                    if (x == 'c')
                        state = "UPDATE";
                    if (x == 'b')
                        state = "ALARM";
                    if (x == 'a')
                        if (state1 == "TIME")
                            state1 = "DATE";
                        else
                            state1 = "TIME";
                }
                case "UPDATE":
                    if (x == 'd')
                        state = "NORMAL";
                    else if (x == 'c')
                        state = "UPDATE";
                    else {
                        switch (state2) {
                            case "min": {
                                if (x == 'a')
                                    state2 = "hour";
                                if (x == 'b')
                                    m++;
                            }
                            case "hour": {
                                if (x == 'a')
                                    state2 = "day";
                                if (x == 'b')
                                    h++;
                            }
                            case "day": {
                                if (x == 'a')
                                    state2 = "month";
                                if (x == 'b')
                                    D++;
                            }
                            case "month": {
                                if (x == 'a')
                                    state2 = "year";
                                if (x == 'b')
                                    M++;
                            }
                            case "year": {
                                if (x == 'a')
                                    state = "NORMAL";
                                if (x == 'b')
                                    Y++;
                            }}}
                case "ALARM":
                    if(x == 'd')
                        state = "NORMAL";
                    else if (x == 'a')
                        if(state3 == "ALARM")
                            state3 = "CHIME";
                        else
                            state = "ALARM"; }}

        void DisplayDate() {System.out.println(Y+"-"+M+"-"+D); }
        void DisplayTIME() {System.out.println( h+":"+m);}
}