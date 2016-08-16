package com.example.hwhong.newyorktimesclone;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Popular extends ListFragment {

    String[] titles = {"Clinton Declares Election a ‘Moment of Reckoning’",
            "Is a Police Shooting a Crime? It Depends on the Officer’s Point of View",
            "Standouts in Mobile Gaming",
            "Smile for the Phone, Creep",
            "Facebook Profit Nearly Triples on Mobile Ad Sales and New Users",
            "Art of the AIDS Years: What Took Museums So Long?",
            "Mets Lose as Familia and Offense Again Fail to Convert",
            "Putin Says Doping Sanctions Devalue Rio Olympic Medals",
            "College Football Playoff to Avoid Future New Year’s Eve Conflicts",
            "In Rio Slum, a Gleaming Hotbed of ... Badminton?"};

    String[] descriptions = {"When there are no ceilings, the sky’s the limit",
            "The longstanding deference given officers in lethal-force cases, enshrined in the laws of some states and Supreme Court rulings, is receiving public scrutiny.",
        "A selection of innovative, beautiful and meaningful games with music, cartoons or even real-world themes.",
        "That nonlethal weapon, the smartphone, can deliver justice. But only if you can unlock it.",
        "The social media company also said it was looking ahead to what it hopes will spur future growth: video and video advertising.",
        "For my generation of American gay men, the AIDS epidemic was a second Vietnam War. A historical survey of the era is long overdue.",
        "The Rockies scored two runs in the ninth to win, as the Mets’ offense continued to struggle.",
        "Victories by other athletes at the Summer Games will be “tasteless,” Russia’s president says.",
        "Because of poor TV ratings in 2015, future semifinals will be played either on Saturdays or holidays.",
        "An Olympian got his start at a facility hand-built by his father."};

    private ListView listView;

    public Popular() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_popular, container, false);

        listView = (ListView) fragmentView.findViewById(R.id.list);
        Adapter adapter = new Adapter(getActivity(), titles, descriptions);
        listView.setAdapter(adapter);

        return fragmentView;
    }

}
