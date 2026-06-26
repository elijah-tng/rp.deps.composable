package tripleo.elijah.nextgen.query;

import java.util.UUID;

public class QueryDatabase {
	public void advise(final Object aObject, final QueryId aQueryId) {
		tripleo.elijah_fluffy.util.NotImplementedException.raise_stop();
	}

	public interface QueryId {
		String getSnowflake();
	}
	public QueryId newUUIDId() {
		return new QueryId() {
			private final String id = UUID.randomUUID().toString();

			@Override
			public String getSnowflake() {
				return this.id;
			}
		};
	}
}
