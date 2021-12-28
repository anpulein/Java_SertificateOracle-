package com.Lesson27.homework;

public class TZ1 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Это  finall блок");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


class NeMyasoException extends RuntimeException {
    public NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends Exception {
    public NeVodaException(String message) {
        super(message);
    }
}

class Tiger {
    void eat(String food) {
        if(!food.equals("myaso")){
            throw new NeMyasoException("Tiger ne est " + food);
        }
        else {
            System.out.println("Tiger est " + food);
        }
    }

    void drink(String water) throws NeVodaException {
        if(!water.equals("voda")){
            throw new NeVodaException("Tigr ne pyet " + water);
        }
        else {
            System.out.println("Tiger pyet vodu");
        }
    }
}
