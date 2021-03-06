package info.company.zeus;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by prashanth on 3/25/17.
 */

public class Party_frag extends Fragment {
    private static final int NUM_PAGES = 2;
    private ViewPager mPager;
    private SampleAdapter pagerAdapter;
    public String owner;

    public Party_frag(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.host_frag, container, false);
        mPager = (ViewPager) view.findViewById(R.id.viewpager);
        pagerAdapter=  buildAdapter();
        mPager.setAdapter(pagerAdapter);
        return view;
    }

    private SampleAdapter buildAdapter() {
        return(new SampleAdapter(getActivity(), getChildFragmentManager(),owner));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
