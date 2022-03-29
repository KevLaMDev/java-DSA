package datastructures;

import codechallenges.WordRepeater;
import codechallenges.hashmap.HashMap;
import org.junit.jupiter.api.Test;

public class WordRepeaterTest {
    @Test
    void wordRepeaterSample1() {
        String test = "Once upon a time, there was a brave princess who...";
        WordRepeater wordRepeater = new WordRepeater();
        assert(wordRepeater.findFirstRepeat(test).equals("a"));
    }
    @Test
    void wordRepeaterSample2() {
        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        WordRepeater wordRepeater = new WordRepeater();
        assert(wordRepeater.findFirstRepeat(test).equals("it"));
    }
    @Test
    void wordRepeaterSample3() {
        String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        WordRepeater wordRepeater = new WordRepeater();
        assert(wordRepeater.findFirstRepeat(test).equals("summer"));
    }
    // stretch goal tests
    @Test
    void wordRepeaterGetEntriesTest() {
        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        WordRepeater wordrepeater = new WordRepeater();
        System.out.println(wordrepeater.getIndividualWordCount(test));
    }
    @Test
    void wordRepeaterGetMostCommonWords() {
        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        WordRepeater wordRepeater = new WordRepeater();
        System.out.println(wordRepeater.getMostCommonWords(test));
    }

}
