package kr.co.chatbot.web.vo.skillPayload.flow;

import kr.co.chatbot.web.vo.skillPayload.userRequest.Block;
import lombok.Data;

/**
 * 사용자와 챗봇의 대화 흐름을 담고 있는 필드로 trigger와 lastBlock으로 구성됩니다.<br/>
 * 이 필드는 사용자 발화를 발생시킨 트리거 정보와 직전에 실행된 블록 정보를 포함합니다.
 */
@Data
public class Flow {
    /**
     * 사용자 발화를 생성시킨 트리거 정보를 담고 있습니다.<br/>
     * 발화 입력, 버튼 클릭 등을 구분할 수 있는 Trigger Type과 사용자가 상호작용한 블록 정보가 포함됩니다.
     */
    private Trigger trigger;

    /**
     * 직전에 실행된 블록 정보로 id와 name을 포함합니다.
     */
    private Block lastBlock;
}
