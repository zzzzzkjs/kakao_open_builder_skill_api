package kr.co.chatbot.web.vo.skillResponse.template;

import java.util.ArrayList;

import lombok.Data;

/**
 * 스킬 응답의 출력 모양을 담고 있는 항목입니다.<br/>
 * 출력으로 사용할 요소 그룹, 바로가기 응답 그룹 등을 포함합니다.
 */
@Data
public class SkillTemplate {
    /**
     * 출력 그룹
     * Array<Component> 필수여부y 1개 이상 3개 이하
     */
    private ArrayList<Object> outputs;

    /**
     * 바로가기 그룹
     * Array<QuickReply> 필수여부n 10개 이하
     */
    private Object[] quickReplies;
}

//{
//"version": "2.0",
//"template": {
//"outputs": [
//  {
//    "textCard": {
//      "title": "챗봇 관리자센터에 오신 것을 환영합니다.",
//      "description": "챗봇 관리자센터로 챗봇을 제작해 보세요. \n카카오톡 채널과 연결하여, 이용자에게 챗봇 서비스를 제공할 수 있습니다.",
//      "buttons": [
//        {
//          "action": "webLink",
//          "label": "소개 보러가기",
//          "webLinkUrl": "https://chatbot.kakao.com/docs/getting-started-overview/"
//        },
//        {
//          "action": "webLink",
//          "label": "챗봇 만들러 가기",
//          "webLinkUrl": "https://chatbot.kakao.com/"
//        }
//      ]
//    }
//  }
//]
//}
//}