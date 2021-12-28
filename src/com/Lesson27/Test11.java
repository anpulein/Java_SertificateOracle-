package com.Lesson27;

public class Test11 {
    void marafon(int tempVozduxa, int tempBega) throws PodvernutNoguException{
        if(tempBega > 12) {
            throw new PodvernutNoguException("Тумп бега был слышком высокий: " + tempBega);
        }
        if(tempVozduxa > 32) {
            throw new SlomalNoguException();
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        try {
            t.marafon(10, 20);
        }
        catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("В любом случае вы получите грамоту");
        }

    }

}

class PodvernutNoguException extends Exception {
    public PodvernutNoguException(String messsage) {
        super(messsage);
    }

    public PodvernutNoguException() {
    }
}

class SlomalNoguException extends RuntimeException {
    public SlomalNoguException(String message) {
        super(message);
    }

    public SlomalNoguException() {
    }
}
