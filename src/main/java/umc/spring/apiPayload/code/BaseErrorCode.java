package umc.spring.apiPayload.code
public interface BaseErrorCode {

    public ErrorReason getReason();

    public ErrorReason getReasonHttpStatus();
}