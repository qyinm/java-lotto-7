package lotto.exception;

public enum LottoErrorCode implements ErrorCode {
    INVALID_LOTTO_LENGTH("로또 번호는 6개여야 합니다.");

    private final String message;

    LottoErrorCode(String message) {
        this.message = message;
    }


    @Override
    public String getMessage() {
        return message;
    }
}
