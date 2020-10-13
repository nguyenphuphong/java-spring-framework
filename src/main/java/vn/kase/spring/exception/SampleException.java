package vn.kase.spring.exception;

public class SampleException extends RuntimeException {
    private static final long serialVersionUID = 2256350166862953852L;

    public SampleException(String msg) {
        super(msg);
    }
}
