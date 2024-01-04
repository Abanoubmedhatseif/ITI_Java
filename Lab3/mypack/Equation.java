package mypack;

import java.util.List;
import java.util.function.Function;

	@FunctionalInterface
	public interface Equation extends Function <List<Double>,Double> {
		public Double apply (List<Double> numbers);
	} // end class

