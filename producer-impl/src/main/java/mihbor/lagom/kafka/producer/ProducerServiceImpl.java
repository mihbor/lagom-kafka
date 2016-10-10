package mihbor.lagom.kafka.producer;

import com.lightbend.lagom.javadsl.api.ServiceCall;

import akka.Done;

public class ProducerServiceImpl implements ProducerService {

	@Override
	public ServiceCall<Object, Done> produceTo(String topic) {
		// TODO Auto-generated method stub
		return null;
	}

}
