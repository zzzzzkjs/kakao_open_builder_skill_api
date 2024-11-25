package kr.co.chatbot.web.vo.skillPayload.intent;

import lombok.Data;

/**
 * <a href= "https://kakaobusiness.gitbook.io/main/tool/chatbot/skill_guide/answer_json_format#intent">문서링크</a><br/>
 * 발화와 일치하는 블록의 정보를 담고 있는 필드입니다. 발화가 지식+에 일치하는 경우, 일치하는 지식의 목록을 포함합니다.
 */
@Data
public class Intent {

    /**
     * 블록 id입니다.
     */
    private String id;
    /**
     * 블록명이며, 지식의 경우 “지식+”로 노출합니다.
     */
    private String name;
    /**
     * api doc에 정확한 설명 없음
     */
    private Object extra;
}
