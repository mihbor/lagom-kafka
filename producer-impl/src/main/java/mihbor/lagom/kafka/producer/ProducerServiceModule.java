package mihbor.lagom.kafka.producer;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class ProducerServiceModule extends AbstractModule implements ServiceGuiceSupport {

	@Override
	protected void configure() {
		bindServices(serviceBinding(ProducerService.class, ProducerServiceImpl.class));
	}

}
