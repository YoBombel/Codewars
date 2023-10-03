package org.example.RankUp;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentlyUsedWordsInATextTest {

    @Test
    void top3() {
        assertEquals(Arrays.asList("e", "d", "a"),    MostFrequentlyUsedWordsInAText.top3("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), MostFrequentlyUsedWordsInAText.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        assertEquals(Arrays.asList("won't", "wont"),  MostFrequentlyUsedWordsInAText.top3("  //wont won't won't "));
        assertEquals(Arrays.asList("e"),              MostFrequentlyUsedWordsInAText.top3("  , e   .. "));
        assertEquals(Arrays.asList(),                 MostFrequentlyUsedWordsInAText.top3("  ...  "));
        assertEquals(Arrays.asList(),                 MostFrequentlyUsedWordsInAText.top3("  '  "));
        assertEquals(Arrays.asList(),                 MostFrequentlyUsedWordsInAText.top3("  '''  "));
        assertEquals(Arrays.asList("a", "of", "on"),  MostFrequentlyUsedWordsInAText.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")) ));
    }
}