/**
 * 
 */
package br.com.eduardomelle.function;

/**
 * @author eduardo
 *
 */
public enum OperationLambda {

	PLUS {

		@Override
		public double operate(double valueA, double valueB) {
			// TODO Auto-generated method stub
			return 0;
		}

	},
	MINUS {

		@Override
		public double operate(double valueA, double valueB) {
			// TODO Auto-generated method stub
			return 0;
		}

	},
	TIMES {

		@Override
		public double operate(double valueA, double valueB) {
			// TODO Auto-generated method stub
			return 0;
		}

	};

	public abstract double operate(double valueA, double valueB);

}
