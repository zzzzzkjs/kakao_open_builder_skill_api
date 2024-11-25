package kr.co.chatbot.web.vo.skillResponse.template;

import java.util.ArrayList;

import lombok.Data;

/**
 * 텍스트 카드형 출력 요소입니다.<br/>
 * 텍스트 카드는 간단한 텍스트에 버튼을 추가하거나, 텍스트를 케로셀형으로 전달하고자 할 때 사용됩니다.
 */
@Data
public class TextCard {
    /**
     * 카드의 제목입니다.<br/>
     * 최대 50자
     */
    private String title;
    /**
     * 카드에 대한 상세 설명입니다.<br/>
     * 단일형인 경우, 최대 400자 (title에 따라 달라짐) 케로셀인 경우, 최대 128자
     */
    private String description;
    /**
     * 카드의 버튼들을 포함합니다.<br/>
     * 최대 3개
     */
    private ArrayList<Button> buttons;
}

//{
//    "version": "2.0",
//    "template": {
//      "outputs": [
//        {
//          "textCard": {
//            "title": "챗봇 관리자센터에 오신 것을 환영합니다.",
//            "description": "챗봇 관리자센터로 챗봇을 제작해 보세요. \n카카오톡 채널과 연결하여, 이용자에게 챗봇 서비스를 제공할 수 있습니다.",
//            "buttons": [
//              {
//                "action": "webLink",
//                "label": "소개 보러가기",
//                "webLinkUrl": "https://chatbot.kakao.com/docs/getting-started-overview/"
//              },
//              {
//                "action": "webLink",
//                "label": "챗봇 만들러 가기",
//                "webLinkUrl": "https://chatbot.kakao.com/"
//              }
//            ]
//          }
//        }
//      ]
//    }
//  }