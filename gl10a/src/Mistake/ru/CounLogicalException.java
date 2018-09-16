package Mistake.ru;

public class CounLogicalException extends Exception {

    public CounLogicalException(String messege, Throwable e) {
        super(messege, e);
    }
    public CounLogicalException(String messege) {
        super(messege);
    }
    public CounLogicalException(Throwable e) {
        super(e);
    }
    public CounLogicalException() {
    }
    
}
