import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.TextView;

public class fragmentTestAndroidSlidingWindow extends Fragment {
    public void meanlessCode() {
        // meanlessCode
        // meanlessCode
        // meanlessCode
        // meanlessCode
        // meanlessCode
        // meanlessCode

        System.out.println("meanless Code Block");
    }

    public Object instantiateItem(ViewGroup container, int position) {
        // Inflate a new layout from our resources
        View view = getActivity().getLayoutInflater().inflate(R.layout.pager_item,
            container, false);
        // Add the newly created View to the ViewPager
        container.addView(view);

        // Retrieve a TextView from the inflated View, and update it's text
        TextView title = (TextView) view.findViewById(R.id.item_title);
        title.setText(String.valueOf(position + 1));

        Log.i(LOG_TAG, "instantiateItem() [position: " + position + "]");

        // Return the View
        return view;
    }
}
