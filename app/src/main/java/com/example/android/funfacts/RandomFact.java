package com.example.android.funfacts;

import android.content.Context;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by Dat on 2015-08-03.
 */
public class RandomFact {
    public int surprise = 0;
    public void randomFact (Context context) {
        Random randomizer = new Random();
        surprise = randomizer.nextInt(20);
        if (surprise == 11) {
            Toast.makeText(context, "The creator of this app loves ice tea! Impressive!", Toast.LENGTH_SHORT).show();
        }

    }
}
