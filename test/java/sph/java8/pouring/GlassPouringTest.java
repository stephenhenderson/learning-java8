package sph.java8.pouring;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

import junit.framework.Assert;
import org.junit.Test;

/**
 */
public class GlassPouringTest {

    @Test
    public void filterMapReduce() {
        List<String> list = asList("one", "two", "three")
                .stream()
                .filter(entry -> entry.startsWith("t"))
                .map(entry -> entry.toUpperCase())
                .collect(toList());

        assertEquals(asList("TWO","THREE"), list);
    }
}
