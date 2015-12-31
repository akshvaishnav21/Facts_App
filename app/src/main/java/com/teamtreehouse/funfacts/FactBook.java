package com.teamtreehouse.funfacts;

import java.util.Random;

public class FactBook {
    // Fields (Member Variables) - Properties about the object
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "According to a recent survey lol is the most overused word.",
            "Whatever is the most annoying word according to a recent study.",
            "Banging your head against a wall burns 150 calories an hour.",
            "Pteronophobia is the fear of being tickled by feathers!",
            "When hippos are upset, their sweat turns red.",
            "A flock of crows is known as a murder.",
            "The average woman uses her height in lipstick every 5 years.",
            "Human saliva has a boiling point three times that of regular water.",
            "Cherophobia is the fear of fun.",
            "During your lifetime, you will produce enough saliva to fill two swimming pools.",
            "An eagle can kill a young deer and fly away with it.\n",
            "Polar bears can eat as many as 86 penguins in a single sitting.",
            "King Henry VIII slept with a gigantic axe beside him.",
            "There is a species of spider called the Hobo Spider.",
            "Heart attacks are more likely to happen on a Monday.",
            "Comets were observed and recorded as early as 239 BC by Chinese astronomers.",
            "India has the largest postal network in the world with over 1, 55,015 post offices.",
            "Bandra Worli Sealink has steel wires equal to the earth's circumference.",
            "Science day in Switzerland is dedicated to Ex-Indian President, APJ Abdul Kalam",
            "India is the world's second-largest English speaking country.",
            "When you sneeze,your heart stops for a mili-second.",
            "More than 50% of the people in the world have never made or received a telephone call.\n",
            "If you sneeze too hard, you can fracture a rib.\n",
            "In every episode of Seinfeld there is a Superman somewhere.",
            "The cigarette lighter was invented before the match.",
            "A duck's quack doesn't echo, and no one knows why.",
            "Like fingerprints, everyone's tongue print is different.",
            "Ethernet is a registered trademark of Xerox, Unix is a registered trademark of AT&T.\n",
            "Every year about 98% of atoms in your body are replaced.\n",
            "Hot water is heavier than cold.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };

    // Methods - Actions the object can take
    public String getFact() {
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
