package AtomationTestsUtil.Controls;

public final class ContextRepository {
	private static volatile ContextRepository instance = null;

	private ContextRepository() {
	}

	static ContextRepository get() {
		if (instance == null) {
			synchronized (ContextRepository.class) {
				if (instance == null) {
					instance = new ContextRepository();
				}
			}
		}
		return instance;
	}

}
