package org.sejong.sulgamewiki.notification.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sejong.sulgamewiki.common.exception.ErrorCode;
import org.sejong.sulgamewiki.common.exception.constants.ErrorSource;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum NotificationErrorCode implements ErrorCode {
    NOTIFICATION_NOT_FOUND("알림이 존재하지 않습니다.", HttpStatus.NOT_FOUND, ErrorSource.OTHERS),
    INVALID_NOTIFICATION_REQUEST("잘못된 알림 요청입니다.", HttpStatus.BAD_REQUEST, ErrorSource.OTHERS);

    private final String message;
    private final HttpStatus status;
    private final ErrorSource errorSource;
}