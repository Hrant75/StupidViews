import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Hrant on 4/1/2017.
 */
public class CheckBox extends View{
    public boolean checked;
    private  String title;

    public CheckBox(String title){
        this.title = title;
    }
    public boolean isChecked(){
        return checked;
    }
    public void setChecked(boolean ch){
        checked = ch;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title);
        if(checked)
            stringBuilder.append(": checked");
        else
            stringBuilder.append(": unchecked");
        return stringBuilder.toString();
    }
}
