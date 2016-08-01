package org.smpp.smscsim;

import org.smpp.pdu.SubmitSM;
import org.smpp.smscsim.ShortMessageValue;

public interface ShortMessageStore {
	void submit(SubmitSM message, String messageId, String systemId);

	void cancel(String messageId);

	void replace(String messageId, String newMessage);

	ShortMessageValue getMessage(String messageId);

	String print();

}