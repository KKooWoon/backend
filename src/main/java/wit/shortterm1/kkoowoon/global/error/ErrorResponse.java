package wit.shortterm1.kkoowoon.global.error;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wit.shortterm1.kkoowoon.global.error.exception.ErrorCode;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ErrorResponse {

    private String message;
    private int status;
    private String code;

    private ErrorResponse(final ErrorCode code) {
        this.message = code.message();
        this.status = code.status();
        this.code = code.code();
    }

    public static ErrorResponse of(ErrorCode commonErrorCode) {
        return new ErrorResponse(commonErrorCode);
    }
}
