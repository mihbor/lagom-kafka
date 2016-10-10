package mihbor.lagom.kafka.producer;

import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;


import static com.lightbend.lagom.javadsl.api.Service.named;
import static com.lightbend.lagom.javadsl.api.Service.restCall;
import static com.lightbend.lagom.javadsl.api.transport.Method.*;

import akka.Done;

public interface ProducerService extends Service {
	
	ServiceCall<Object, Done> produceToTopic(String topic);
	
	ServiceCall<Object, Done> produceToTopicWithKey(String topic, Object key);
	
	@Override
	default Descriptor descriptor() {
		return named("producer").withCalls(
			restCall(POST, "/api/produce/:topic", this::produceToTopic),
			restCall(PUT, "/api/produce/:topic/:key", this::produceToTopicWithKey)
		);
	}
}
