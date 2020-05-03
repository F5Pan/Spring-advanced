package com.wayne.form;

public interface FormConvert<S, T> {
	T convert(S s);
}
