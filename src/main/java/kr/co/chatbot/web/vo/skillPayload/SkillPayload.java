package kr.co.chatbot.web.vo.skillPayload;

import kr.co.chatbot.web.vo.skillPayload.action.Action;
import kr.co.chatbot.web.vo.skillPayload.bot.Bot;
import kr.co.chatbot.web.vo.skillPayload.flow.Flow;
import kr.co.chatbot.web.vo.skillPayload.intent.Intent;
import kr.co.chatbot.web.vo.skillPayload.userRequest.UserRequest;
import lombok.Data;

@Data
public class SkillPayload {
    private Intent intent;
    private UserRequest userRequest;
    private Bot bot;
    private Action action;
    private Flow flow;
}