public class svm_parameter
{
	/* svm_type */
	public static final int C_SVC = 0;
	public static final int NU_SVC = 1;
	public static final int ONE_CLASS = 2;
	public static final int C_SVR = 3;

	/* kernel_type */
	public static final int LINEAR = 0;
	public static final int POLY = 1;
	public static final int RBF = 2;
	public static final int SIGMOID = 3;

	public int svm_type;
	public int kernel_type;
	public double degree;	// for poly
	public double gamma;	// for poly/rbf/sigmoid
	public double coef0;	// for poly/sigmoid

	// these are for training only
	public double cache_size; // in MB
	public double eps;	// stopping criteria
	public double C;	// for C_SVC and C_SVR
	public double nu;	// for NU_SVC and ONE_CLASS
	public double p;	// for C_SVR
	public int shrinking;	// use the shrinking heuristics
}
