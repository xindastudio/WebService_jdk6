package unittest.cn.com.webservice.server;

import javax.xml.ws.Endpoint;

import cn.com.webservice.server.CalculatorImpl;

/**
 * @author wuliwei
 *
 */
public class StartUp {

	/**
	 * 发布CalculatorImpl 到http://localhost:8888/lj/Calculator这个地址
	 * 之前必须调用wsgen命令生成服务类CalculatorImpl的支持类,命令如下:
	 * wsgen -cp . WebServices.CalculatorImpl
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				Endpoint.publish("http://localhost:8080/Calculator", new CalculatorImpl());
			}
		}).start();
	}

}
