package fall2020;

import static org.mockito.Mockito.*;
public class MockSendEmail {
	private SendEmail sendemail = mock(SendEmail.class);
    
	public MockSendEmail(FinderApp finder) {
		finder.setEmailService(sendemail);
	}
	public SendEmail getSendemail() {
		return sendemail;
	}

	public void setSendemail(SendEmail sendemail) {
		this.sendemail = sendemail;
	}

}
