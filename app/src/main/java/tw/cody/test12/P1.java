package tw.cody.test12;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class P1 extends Fragment {
    private View mainView;
    private ViewFlipper flipper;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
//        return inflater.inflate(R.layout.p1,container,false);
        mainView = inflater.inflate(R.layout.p1,container,false);
        flipper = mainView.findViewById(R.id.flipper);
//        flipper.getAccessibilityClassName()   //?
        View v0 = flipper.getChildAt(0);  //?
        View v1 = flipper.getChildAt(1);
        View v2 = flipper.getChildAt(2);
        View v3 = flipper.getChildAt(3);
//        flipper.setOnClickListener(new View.OnClickListener() {    //?
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        ClickListener listener = new ClickListener();
//        listener.onClick(v0);   //?
        v0.setOnClickListener(listener);
        v1.setOnClickListener(listener);
        v2.setOnClickListener(listener);
        v3.setOnClickListener(listener);
        return mainView;
    }


    private class ClickListener implements View.OnClickListener {   //?

        @Override
        public void onClick(View v) {
            flipper.showNext();
        }
    }
}
