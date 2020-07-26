package ru.stqa.pft.testbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
    @Test
    public void TestDistance() {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(0, 0);
        Assert.assertEquals(p1.distance(p2), 14.142135623730951);

    }
}
