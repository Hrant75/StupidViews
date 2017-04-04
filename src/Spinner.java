import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Hrant on 4/1/2017.
 */
public class Spinner  extends View{
    public boolean isOpened;
    private List<String> spinnerItems;

    public Spinner(){
        spinnerItems = new ArrayList<>();
    }

    public void addItem(String item){
        spinnerItems.add(item);
    }

    public void addItem(String... items){
        spinnerItems.addAll(Arrays.asList(items));
    }
    public boolean isOpened(){
        return isOpened;
    }
    public void setOpened(boolean opened){
        isOpened = opened;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("\n");
        if(isOpened){
            stringBuilder.append("Spinner is opened");
            for (String string : spinnerItems) stringBuilder.append("\n" + string);
        }
        else stringBuilder.append("Spinner is closed");
        return stringBuilder.toString();
    }
}
