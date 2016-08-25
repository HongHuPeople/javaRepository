package com.axis.utils;

import java.util.ArrayList;

import java.util.List;

import com.axis.base.BaseEntity;


public class ListUtil {
	
	/**
	 * 将一个集合分解为多个小集合
	 * @param targe  需要拆分的集合
	 * @param size	 分解后集合长度
	 * @return
	 */
	public static <T extends BaseEntity> List<List<T>> createList(List<T> targe, int size) {
		List<List<T>> listArr = new ArrayList<List<T>>();
		// 获取被拆分的数组个数
		int arrSize = targe.size() % size == 0 ? targe.size() / size : targe.size() / size + 1;
		for (int i = 0; i < arrSize; i++) {
			List<T> sub = new ArrayList<T>();
			// 把指定索引数据放入到list中
			for (int j = i * size; j <= size * (i + 1) - 1; j++) {
				if (j <= targe.size() - 1) {
					sub.add(targe.get(j));
				}
			}
			listArr.add(sub);
		}
		return listArr;
	}
}
