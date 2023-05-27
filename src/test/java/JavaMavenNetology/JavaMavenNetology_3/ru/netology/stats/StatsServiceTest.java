package JavaMavenNetology.JavaMavenNetology_3.ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void testSumFullSales() {
        StatsService service = new StatsService();
        long[] statisticsSales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumFullSales(statisticsSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumMiddleSales() {
        StatsService service = new StatsService();
        long[] statisticsSales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 15;
        long actual = service.sumMiddleSales(statisticsSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthPeakSales() {
        StatsService service = new StatsService();
        long[] statisticsSales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 8;
        long actual = service.monthPeakSales(statisticsSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinimalSales() {
        StatsService service = new StatsService();
        long[] statisticsSales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 9;
        long actual = service.monthMinimalSales(statisticsSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthBotMiddleSales() {
        StatsService service = new StatsService();
        long[] statisticsSales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 5;
        long actual = service.monthBotMiddleSales(statisticsSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthUpMiddleSales() {
        StatsService service = new StatsService();
        long[] statisticsSales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 5;
        long actual = service.monthUpMiddleSales(statisticsSales);

        Assertions.assertEquals(expected, actual);
    }

}
