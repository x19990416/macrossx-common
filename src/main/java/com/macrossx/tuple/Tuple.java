package com.macrossx.tuple;

/**
 * 1元组
 * 
 * @author starseeker.limin@gmail.com(X-Forever)
 *
 * @param _1 Nullable，元组的第一个元素
 */
public class Tuple<T1> {
	public final T1 _1;

	public Tuple(T1 _1) {
		this._1 = _1;
	}

	@Override
	public String toString() {
		return "("+_1+")";
	}
}
