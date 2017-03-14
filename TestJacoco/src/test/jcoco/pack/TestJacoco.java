package test.jcoco.pack;

public class TestJacoco {
			
	public static void main(String[] args) {
		new TestJacoco().runTest(true);
	}

	private void runTest(boolean isExecute) {
		method1(isExecute);
	}

	private void method2(boolean isExecute) {
		if(isExecute){
			System.out.println("Call Method 3");
			method3();
		}else{
			System.out.println("Method 3 was not called");
		}
	}

	private void method1(boolean isExecute) {
		if(isExecute){
			System.out.println("Call Method 2");
			method2(isExecute);
		}else{
			method2(false);
		}
	}

	private void method3() {
		System.out.println("Method 3 got executed");
	}
}
