package Observer;

public class Button {

    public void onClick() {
        if (onClockListener != null) {
            onClockListener.onClick(this);
        }
    }

    public interface OnClickListener {
        public void onClick(Button button);
    }

    private OnClickListener onClockListener;

    public void setOnClockListener(OnClickListener onClickListener) {
        this.onClockListener = onClickListener;
    }
}
