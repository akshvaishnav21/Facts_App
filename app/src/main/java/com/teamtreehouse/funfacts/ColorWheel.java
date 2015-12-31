package com.teamtreehouse.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    // Fields (Member Variables) - Properties about the object
    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7",  // light gray
            "#0F6A6D",
            "#0F6D44",
            "#46F9AB",
            "#0C2B5C",
            "#38670E",
            "#D74335",
            "#E459A3",
            "#741290",
            "#35A6A1",
            "#199254",
            "#82D9AC",
            "#474DBC",
            "#246B76",
            "#2DE84F",
            "#84C325",
    };

    // Methods - Actions the object can take
    public int getColor() {
        String color;
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }
}
