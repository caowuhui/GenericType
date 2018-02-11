package com.taijue.modal.list;

import java.util.List;

public interface IPayloadList<E, P> extends List<E> {
	void setPayload(int index, P val);
}
