package kr.co.chatbot.web.vo.skillResponse;

import java.util.Map;

import lombok.Data;

/**
 * 스킬 응답은 크게 version/template/context/data 총 4가지 부분으로 구성됩니다.<br/>
 * <a href="https://kakaobusiness.gitbook.io/main/tool/chatbot/skill_guide/answer_json_format#skilltemplate">문서링크</a>
 * 
 */
@Data
public class SkillResponse {
    /**
     * 스킬 응답의 version을 나타냅니다. <major-version>.<minor-version>의 모습을 갖습니다.
     * 현재 스킬 응답의 version은 2.0만 지원됩니다.<br/>
     * version이 없다면 구 버전의 응답으로 간주하기 때문에, 항상 version을 포함해야 합니다.
     */
    private String version;
    /**
     * 스킬 응답의 출력 모양을 담고 있는 항목입니다. 출력으로 사용할 요소 그룹, 바로가기 응답 그룹 등을 포함합니다.
     */
    private String template;
    /**
     * 블록의 context 설정을 제어할 수 있습니다.
     */
    private String context;
    /**
     * 필요에 따라 커스텀한 데이터를 넣을 수 있는 항목입니다.
     */
    private Map<String, ?> data;

}
