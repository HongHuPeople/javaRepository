package com.axis.utils;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class GoodsUtils {
	
	public static Map<String, String> analysisMap = new HashMap<String, String>(){
		{
			put("LK", "幸运");
			put("IQ", "悟性");
			put("HP", "血量");
			put("MP", "法力");
			put("HIT", "命中");
			put("CRIT", "暴击几率");
			put("EVAD", "闪避");
			put("ATK", "攻击力");
			put("DEF", "防御力");
			put("VIT", "体质");
			put("STR", "力量");
			put("AGI", "敏捷");
			put("ZL", "智力");
			
			put("lk", "幸运");
			put("iq", "悟性");
			put("hp", "血量");
			put("mp", "法力");
			put("hit", "命中");
			put("crit", "暴击几率");
			put("evad", "闪避");
			put("atk", "攻击力");
			put("def", "防御力");
			put("vit", "体质");
			put("str", "力量");
			put("agi", "敏捷");
			put("zl", "智力");
		}
	};
	
	public static String analysisGoodsDeltil(String detil){
		StringBuffer showDetil = new StringBuffer();
		JSONObject jsStr = JSONObject.parseObject(detil);
		for (String str : jsStr.keySet()) {
			showDetil.append(analysisMap.get(str)+":"+jsStr.get(str)+",");
		}
		System.out.println(showDetil.deleteCharAt(showDetil.length()-1));
		return showDetil.toString();
	}
}
