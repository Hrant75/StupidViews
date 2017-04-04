import java.util.ArrayList;

/**
 * Created by Hrant on 4/1/2017.
 */
public class ViewGroup {
    public ArrayList<View> views;

    public ViewGroup() {
        this.views = new ArrayList<>();
    }

    public void addView(View view){
        views.add(view);
    }

    public void draw(){
        for(View v : views){
            System.out.println(v.toString());
        }
    }


}
