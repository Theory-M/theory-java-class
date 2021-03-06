package pl.learn.theory.javaclass1.exceptions.network;

import java.util.Random;

public class StockExchange {

    private static final Random random = new Random();


    // constructor StockExchangeCreationException -- RuntimeException
    // throw exc ReadDataException -- RuntimeException
    // random % 2 -- parzyste lub nie -- raz wyjatek raz nie
    //

    public String readData() throws ReadDataException {
        if (random.nextInt(100) % 2 == 0) {
            throw new ReadDataException("readData exc");
        } else
            System.out.println("there was no exc in readData");
        return "data";
    }
    public StockExchange() throws StockExchangeCreationException {
        if (random.nextInt(100) % 2 == 1) {
            throw new StockExchangeCreationException("stockExchange exc");
        } else {
            System.out.println("there was no exc in StockExchange");
        }
    }

    public static void main(String[] args) {

        StockExchange stockExchange = new StockExchange();
//        System.out.println(stockExchange.readData());


        // kolejnosc
        String readData = null;
        try {
            stockExchange.readData();
            System.out.println("this will only print if method doesn't catch exc");
        }catch (ReadDataException exc){
            readData = "";
        }finally {
            System.out.println("finally will always complete");
        }

        System.out.println(readData);
    }


}

