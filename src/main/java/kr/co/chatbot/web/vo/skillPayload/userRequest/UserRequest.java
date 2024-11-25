package kr.co.chatbot.web.vo.skillPayload.userRequest;

import lombok.Data;

/**
 * 사용자의 정보를 담고 있는 필드입니다. 사용자의 발화와 반응한 블록의 정보를 추가적으로 포함합니다.
 */
@Data
public class UserRequest {
    /**
     * 사용자의 시간대를 반환합니다.한국에서 보낸 요청이라면 “Asia/Seoul”를 갖습니다.
     */
    private String timezone;

    private Block block;

    /**
     * 봇 시스템에 전달된 사용자의 발화입니다.
     */
    private String utterance;

    /**
     * 사용자의 언어를 반화합니다.
     * 한국에서 보낸 요청이라면 “ko”를 갖습니다
     */
    private String lang;

    private User user;

}
