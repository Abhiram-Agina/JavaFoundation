package JavaBuildingBlocks;

import java.util.*;

public class UsingFinalize {
	private static List objects = new ArrayList();
	protected void finalize() {
		objects.add(this);
	}
}
