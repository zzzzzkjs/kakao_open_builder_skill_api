package kr.co.tvpoint.web.vo;

import java.util.HashMap;

public class RequestMessage {
	private HashMap<String, Object> intent;
	private HashMap<String, Object> userRequest;
	private HashMap<String, Object> bot;
	private HashMap<String, Object> action;

	public HashMap<String, Object> getIntent() {
		return intent;
	}

	public void setIntent(HashMap<String, Object> intent) {
		this.intent = intent;
	}

	public HashMap<String, Object> getUserRequest() {
		return userRequest;
	}

	public void setUserRequest(HashMap<String, Object> userRequest) {
		this.userRequest = userRequest;
	}

	public HashMap<String, Object> getBot() {
		return bot;
	}

	public void setBot(HashMap<String, Object> bot) {
		this.bot = bot;
	}

	public HashMap<String, Object> getAction() {
		return action;
	}

	public void setAction(HashMap<String, Object> action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "\n== RequestMessage start ==\n\n" + " intent=>" + intent.toString() + "\n\n userRequest=>"
				+ userRequest.toString() + "\n\n bot=>" + bot.toString() + "\n\n action=>" + action.toString()
				+ "\n\n== RequestMessage end ==\n";
	}

}