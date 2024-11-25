package kr.co.chatbot.web.vo.skillPayload.flow;

import kr.co.chatbot.web.vo.skillPayload.userRequest.Block;
import lombok.Data;

/**
 * 사용자 발화를 발생시킨 트리거 정보입니다.<br/>
 * type은 블록 호출 유형을 나타내며 referrerBlock은 사용자가 상호작용한 블록의 정보를 포함합니다.
 */
@Data
public class Trigger {
    /**
     * 사용자 발화를 발생시킨 Trigger Type에 대한 정보입니다.<br/>
     * trigger.type 값은 Output Type과 Action Type의 조합으로 이루어지며<br/>
     * 각 상황에 맞는 Trigger Type은
     * <a href="https://kakaobusiness.gitbook.io/main/tool/chatbot/skill_guide/answer_json_format#user.properties">문서링크</a>에서 확인
     */
    private String type;
    /**
     * 사용자 발화가 발생할 때 상호작용이 일어난 블록의 정보로<br/>
     * 해당 블록의 id와 name을 포함합니다.
     */
    private Block referrerBlock;
}
