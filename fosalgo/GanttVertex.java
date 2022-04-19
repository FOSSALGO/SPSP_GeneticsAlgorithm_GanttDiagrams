package fosalgo;


public class GanttVertex {

    public double start_time;//hari ke
    public double end_time;
    public double duration;
    public double[] dedicationOfEmployee;

    public GanttVertex(double start_time, double duration, double[] dedicationOfEmployee) {
        this.start_time = start_time;
        this.end_time = start_time + duration;
        this.duration = duration;
        this.dedicationOfEmployee = dedicationOfEmployee;
    }

    public void setStartTime(double start_time) {
        this.start_time = start_time;
        this.end_time = start_time + duration;
    }  
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        int s = (int) start_time;
        for (int i = 0; i < s; i++) {
            sb.append("*");
        }
        int k = (int)duration;
        for (int i = s; i < (s+k); i++) {
            sb.append("#");
        }
        sb.append("start: "+start_time+" durasi: "+duration+" end: "+end_time+"\n");
        return sb.toString();
    }
}