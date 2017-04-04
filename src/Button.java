/**
 * Created by Hrant on 4/1/2017.
 */
public class Button extends View{
    private  String title;

    public Button(){}

    public Button(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return title;
    }
}
