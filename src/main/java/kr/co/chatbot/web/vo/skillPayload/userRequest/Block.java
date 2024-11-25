package kr.co.chatbot.web.vo.skillPayload.userRequest;

import lombok.Data;

/**
 * 사용자의 발화에 반응한 블록의 정보입니다.<br/>
 * 블록의 id와 name을 포함합니다.
 */
@Data
public class Block {
    private String id;
    private String name;
}
