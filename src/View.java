/**
 * Created by Hrant on 4/1/2017.
 */
public abstract class View{

    private OnClickListener onClickListener;

    public void performClick(){
        onClickListener.onClick(this);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener{
        public void onClick(View v);
    }
}
