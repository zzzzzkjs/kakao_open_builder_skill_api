package kr.co.chatbot.web.vo.skillPayload.userRequest;

import lombok.Data;

/**
 * Skill Request에서 사용자에 대한 정보를 userRequest.user에 담아서 제공하고 있습니다.
 */
@Data
public class User {
    /**
     * 사용자를 식별할 수 있는 key로 최대 70자의 값을 가지고 있습니다.<br/>
     * 이 값은 특정한 bot에서 사용자를 식별할 때 사용할 수 있습니다.<br/>
     * 동일한 사용자더라도, 봇이 다르면 다른 id가 발급됩니다.
     */
    private String id;
    /**
     * 현재는 botUserKey만 제공합니다.
     */
    private String type;
    /**
     * <a href="https://kakaobusiness.gitbook.io/main/tool/chatbot/skill_guide/answer_json_format#user.properties">문서링크</a><br/>
     * 
     * user.properties - 추가적으로 제공하는 사용자의 속성 정보입니다.<br/>
     * <br/>
     * 
     * plusfriendUserKey String<br/>
     * <br/>
     * 
     * 카카오톡 채널에서 제공하는 사용자 식별키 입니다.<br/>
     * 카카오톡 채널의 자동응답 API에서 제공하던 user_key와 같습니다. (https://github.com/plusfriend/auto_reply#specification-1)<br/>
     * 모든 사용자에게 제공되는 값으로, botUserKey와 마찬가지로 봇에서 사용자를 식별하는데 사용할 수 있습니다.<br/>
     * <br/>
     * 
     * appUserId String<br/>
     * <br/>
     * 
     * 봇 설정에서 앱키를 설정한 경우에만 제공되는 사용자 정보입니다.<br/>
     * 앱키를 설정하기 위해서는 카카오 디벨로퍼스 사이트에서 앱을 생성해야 합니다.<br/>
     * 카카오 디벨로퍼스 앱 생성하기 : (https://developers.kakao.com/docs/latest/ko/getting-started/app)<br/>
     * 앱 키가 정상적으로 등록된 경우, 카카오 로그인으로 받는 사용자 식별자와 동일한 값을 얻을 수 있습니다.<br/>
     * <br/>
     * 
     * isFriend Boolean<br/>
     * <br/>
     * 
     * 사용자가 봇과 연결된 카카오톡 채널을 추가한 경우 제공되는 식별키입니다.<br/>
     * 채널을 추가한 경우만 True 값이 전달되며, 채널을 추가하지 않은 경우/차단한 경우에는 값이 전달되지 않습니다.<br/>
     * <br/>
     * 
     * {
     * ...,
     * "userRequest": {
     * ...
     * "user": {
     * "id": "<사용자 botUserKey>",
     * "type": "botUserKey",
     * "properties": {
     * "plusfriendUserKey": "<카카오톡 채널 사용자 id>",
     * "appUserId": "<app user id>",
     * "isFriend" : true
     * }}},
     * ...
     * }
     */
    private Object properties;
}
