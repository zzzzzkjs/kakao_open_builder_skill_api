package kr.co.chatbot.web.vo.skillPayload.bot;

import lombok.Data;

/**
 * 사용자의 발화를 받은 봇의 정보를 담고 있는 필드입니다.
 */
@Data
public class Bot {
    /**
     * 봇의 고유한 식별자입니다.
     */
    private String id;
    /**
     * 설정된 봇의 이름입니다.
     */
    private String name;
}
