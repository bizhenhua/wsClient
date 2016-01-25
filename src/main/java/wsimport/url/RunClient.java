package wsimport.url;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhuc
 * @version 2012-5-20 涓嬪崍8:20:23
 */
public class RunClient {
	// wsimport -s ./src -p wsimport.url http://localhost:8080/Message?wsdl
	/**
	 * @param args
	 * @throws Exception_Exception
	 */
	public static void main(String[] args) throws Exception_Exception {
		// MessageService ms = new MessageService();
		// Message m = ms.getMessagePort();
		// System.out.println("瀹㈡埛绔墦鍗�");
		// System.out.println(m.toSayHello("hello, java6 webservice"));
		// Car c = m.getCar("zhuc-car");
		// System.out.println(c.getName());
		// System.out.println(c.getCapacity());

		// HelloWorldServiceService service = new HelloWorldServiceService();
		// HelloWorldService hs = service.getHelloWorldServicePort();

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		HelloWorldService hs = (HelloWorldService) context.getBean("jiangsuYdSubscriberSyncService");

		System.out.println("wsClient:" + hs.sayMessage("laobi"));
	}

}
