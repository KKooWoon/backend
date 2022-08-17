package wit.shortterm1.kkoowoon.global.error.exception;

import java.util.NoSuchElementException;

// Not Found Exception Root
public class EntityNotFoundException extends NoSuchElementException {

    private final ErrorCode errorCode;

    public EntityNotFoundException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public EntityNotFoundException(ErrorCode errorCode) {
        super(errorCode.message());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
