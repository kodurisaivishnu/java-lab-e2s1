// import dept3.CSE3;
// import dept3.ECE3;
// import dept3.CE3;
// import dept3.ME3;

package pak;
import dept3.*;

public class Dept3Main {
    public static void main(String args[])
    {
        CSE3 cse=new CSE3();
        ECE3 ece=new ECE3();
        CE3 ce=new CE3();
        ME3 me=new ME3();

        cse.displaySubjects();
        ece.displaySubjects();
        me.displaySubjects();
        ce.displaySubjects();
    }
}
