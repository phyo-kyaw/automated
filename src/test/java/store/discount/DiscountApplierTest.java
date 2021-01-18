package store.discount;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DiscountApplierTest {

    private DiscountApplier applier;

    @Before
    public void setup() {
        applier = new DiscountApplier();
    }

    @Test
    public void discountForMacAndIphoneTogether() {



        Item mac = new Item("MACBOOK", 1, 100);
        Item iphone = new Item("IPHONE", 1, 100);

        Basket basket = new Basket(Arrays.asList(mac, iphone));

        applier.apply(basket);

        double expected = ( 100 + 100) * 0.85;
        Assert.assertEquals(expected, basket.getAmount(),0.00001);
    }

    @Test
    public void discountForMacAndWindowsphoneTogether() {



        Item notebook = new Item("NOTEBOOK", 1, 100);
        Item wphone = new Item("WINDOWS PHONE", 1, 100);

        //Basket basket = new Basket(Arrays.asList(mac, wphone));
        Basket basket = new Basket(Arrays.asList(notebook, wphone));

        applier.apply(basket);

        double expected = ( 100 + 100) * 0.88;
        Assert.assertEquals(expected, basket.getAmount(),0.00001);
    }

    @Test
    public void discountForMacAndWindowsphoneTogether2() {


        Basket basket = new BasketBuilder()
                .w("NOTEBOOK", 100)
                .w("WINDOWS PHONE", 100)
                .build();

//        Item notebook = new Item("NOTEBOOK", 1, 100);
//        Item wphone = new Item("WINDOWS PHONE", 1, 100);
//
//        //Basket basket = new Basket(Arrays.asList(mac, wphone));
//        Basket basket = new Basket(Arrays.asList(notebook, wphone));

        applier.apply(basket);

        double expected = ( 100 + 100) * 0.88;
        Assert.assertEquals(expected, basket.getAmount(),0.00001);
    }
}