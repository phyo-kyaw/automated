package store.discount;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class ProposalGeneratorTest {

    @Test
    public void discountWhenChristmas() {

        Basket basket = new BasketBuilder()
                .w("MACKBOOK", 1000)
                .build();

        Calendar christmas = new GregorianCalendar(2015, Calendar.DECEMBER, 25);

        Clock fakeClock = Mockito.mock(Clock.class);
        Mockito.when(fakeClock.now()).thenReturn(christmas);

        ProposalGenerator generator = new ProposalGenerator(fakeClock);
        double finalAmount = generator.calculateDiscount(basket);

        Assert.assertEquals(1000*0.15, finalAmount, 0.0001);
    }

}