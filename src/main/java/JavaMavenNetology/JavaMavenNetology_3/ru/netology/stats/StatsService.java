package JavaMavenNetology.JavaMavenNetology_3.ru.netology.stats;

public class StatsService {

    public long sumFullSales(long[] sales) {
        long resault = 0;
        for (long sale : sales) {
            resault += sale;
        }
        return resault;
    }

    public long sumMiddleSales(long[] sales) {
        long resault = 0;
        for (long sale : sales) {
            resault += sale;
        }
        return resault / sales.length;
    }

    public int monthPeakSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthMinimalSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthBotMiddleSales(long[] sales) {
        int resault = 0;
        for (long sale : sales) {
            if (sale < sumMiddleSales(sales)) {
                resault++;
            }
        }
        return resault;
    }

    public int monthUpMiddleSales(long[] sales) {
        int resault = 0;    
        for (long sale : sales) {
            if (sale > sumMiddleSales(sales)) {
                resault++;
            }
        }
        return resault;
    }
}
