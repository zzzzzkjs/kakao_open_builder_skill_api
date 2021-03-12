package kr.co.tvpoint.web.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.tvpoint.web.vo.RequestMessage;

@RestController
public class ChatBotController {
	@RequestMapping("/")
	public String welcome() {// Welcome page, non-rest
		System.out.println("서버상태 체크용");
		return "Welcome! server is running.";
	}

	// 메세지
	@SuppressWarnings({ "unchecked" })
	@RequestMapping(value = "/choice_random", method = RequestMethod.POST, headers = "Accept=application/json")
	public @ResponseBody HashMap<String, Object> choice_random(@RequestBody RequestMessage requestMessage) {

		System.out.println("[/choice_random]" + requestMessage.toString());

		HashMap<String, Object> message = requestMessage.getUserRequest();
		HashMap<String, Object> user = (HashMap<String, Object>) message.get("user");

		String userId = (String) user.get("id");
		String utterance = (String) message.get("utterance");

		System.out.println("===========@@@@@@@@==========");
		System.out.println(userId);
		System.out.println(utterance);
		System.out.println("===========@@@@@@@@==========");

		// 조건부
		String selected = "";
		if ("안녕".equals(utterance) || "안뇽".equals(utterance)) {
			selected = "안뇽(야옹)";
		} else if (utterance.equals("메인화면")) {
			selected = "첫 화면을 호출합니다.";
		} else if (utterance.contains("vs")) {
			selected = vsFunction(utterance, "vs");
		} else if (utterance.contains("VS")) {
			selected = vsFunction(utterance, "VS");
		} else if (utterance.contains("vS")) {
			selected = vsFunction(utterance, "vS");
		} else if (utterance.contains("Vs")) {
			selected = vsFunction(utterance, "Vs");
		} else if (utterance.contains("사랑")) {
			selected = "뇽뇽이도 사랑한다뇽(뽀뽀)";
		} else if (utterance.contains("뇽뇽이한테 물어보기!")) {
			selected = "드디어 뇽뇽이가 돌아왔습니다!!!!!\n\n" + "🐱제 1탄 결정왕 뇽뇽이🐱\n" + "그동안 결정하기 어려우셨던 분들 모두 주목해주세요!\n"
					+ "vs를 포함하여 단어를 제시하면 뇽뇽이가 대답할 줄꺼에요.\n\n" + "⭐예시⭐\n" + "😳결정장애 철수 : 짜장면 vs 짬뽕\n"
					+ "🐱결정왕 뇽뇽이 : 짜장면!\n\n" + "이제 철수는 결정하기 쉬어질 것입니다😃\n\n\n"
					+ "🙏🏻 요청사항은 \"상담원으로 전환\" 후 문의주시면 최대한 빠르게 반영하도록하겠습니다.";
		} else if (utterance.contains("사다리")) {
			selected = "사다리게임은 아직 준비중이라뇽..쫌만 기다려 달라뇽!!(미소)";
//			MessageButtonVO msgBtn = new MessageButtonVO();
//			msgBtn.setLabel("네이버 사다리게임");
//			msgBtn.setUrl(
//					"https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%82%AC%EB%8B%A4%EB%A6%AC%EA%B2%8C%EC%9E%84");

//			jobjText.setMessage_button(msgBtn);
//			jobjText.setText("사다리게임!");

//			res_vo.setMessage(jobjText);

//			return res_vo;

		} else if (utterance.contains("결정") || utterance.contains("선택")) {
			selected = "짜장면 vs 짬뽕  요로케 물어보면 뇽뇽이가 대신 골라준다뇽(크크)";
		} else if (utterance.contains("졸려")) {
			selected = "졸리면 언능 세수하러 가라뇽!";
		} else if (utterance.contains("시간") || utterance.contains("몇 시")) {
			selected = "섹시(푸하하)";
		}
//		else if (utterance.contains("손문")) {
//			selected = "월급나오면 사주겠다뇽~";
//		} 
		else if (utterance.contains("나가있어")) {
			selected = "뇽뇽이 미워하지 말라뇽..(훌쩍)";
		} else if (utterance.contains("뇽뇽아") || "야".equals(utterance)) {
			selected = "뇽뇽이 불렀뇽??(잘난척)";
		} else {
			selected = "뇽뇽이 무슨말인지 모르겠다뇽...(허걱)\n\n" + "vs를 포함하여 단어를 제시하면 뇽뇽이가 대답할 줄꺼에요.\n\n" + "⭐예시⭐\n"
					+ "😳결정장애 철수 : 짜장면 vs 짬뽕\n" + "🐱결정왕 뇽뇽이 : 짜장면!\n";

		}

		// 응답부
		HashMap<String, Object> responseJson = new HashMap<String, Object>();
		HashMap<String, String> selectedMessage = new HashMap<String, String>();

		selectedMessage.put("msg", selected);

		responseJson.put("version", "2.0");
		responseJson.put("data", selectedMessage);

		System.out.println("/choice_random responseJson : " + responseJson.toString());

		return responseJson;
	}

	protected String vsFunction(String utterance, String verifier) {
		System.out.println("vsFucntion utterance=" + utterance);
		int ran = 0;
		String question[] = utterance.split(verifier);
		String returnMessage = "";
		for (int i = 0; i < question.length; i++) {
			if (question[i].contains("죽음") || question[i].contains("자살") || question[i].contains("죽자")
					|| question[i].contains("죽는다")) {
				returnMessage = "무서운 소리 하지 말라뇽..(눈물)";
				return returnMessage;
			}
		}
		if (question.length < 2) {
			returnMessage = "뇽뇽이 그정도로 멍청하지 않다뇽!!";
		} else if (question.length == 2) {
			ran = (int) (Math.random() * 100);
			System.out.println("ran2==" + ran);
			if (ran < 50) {
				returnMessage = question[0] + "!";
			} else {
				returnMessage = question[1] + "!";
			}
		} else if (question.length == 3) {
			ran = (int) (Math.random() * 100);
			System.out.println("ran3==" + ran);
			if (ran > 0 && ran <= 33) {
				returnMessage = question[0] + "!";
			} else if (ran > 33 && ran <= 66) {
				returnMessage = question[1] + "!";
			} else {
				returnMessage = question[2] + "!";
			}
		} else {
			returnMessage = "뇽뇽이 여러개 말하면 헤깔린다뇽(헤롱)";
		}
		return returnMessage;
	}

}
