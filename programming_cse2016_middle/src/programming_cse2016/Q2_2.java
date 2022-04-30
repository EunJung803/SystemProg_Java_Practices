package programming_cse2016;

/*
 * Question 2 (Ŭ���� ����, 5��). ���Ҽ� ������ �����ϱ� ���� Complex ��� Ŭ������ �ۼ��϶�. 
 * ���Ҽ��� ������ ���� ���¸� ���´�. 
 * 
 * �Ǽ��� + ����� * i  (���⼭ i�� -1�̴�) 
 * 
 * �Ǽ��ο� ������� ���� �����ϱ� ���� �Ǽ��� �������� ����϶�. ���� Ŭ���� ����ǥ�� �����϶�. 
 */

class Complex {
	private double real;
	private double imaginary; 
	
	public Complex(double a, double b) {
		this.real = a;
		this.imaginary = b;
	}
	public Complex add(Complex other) {
		double new_real; // ����� ��ȯ�� ��ü�� �Ǽ��� 
		double new_imaginary; // ����� ��ȯ�� ��ü�� �����
		// fill here! 
		
		new_real = this.real + other.getReal();
		new_imaginary = this.imaginary + other.getImaginary();
		
		Complex result = new Complex(new_real, new_imaginary);
		return result; 
	}
	public Complex sub(Complex other) {
		double new_real; // ����� ��ȯ�� ��ü�� �Ǽ��� 
		double new_imaginary; // ����� ��ȯ�� ��ü�� �����
		// fill here! 
		
		new_real = this.real - other.getReal();
		new_imaginary = this.imaginary - other.getImaginary();
		
		Complex result = new Complex(new_real, new_imaginary);
		return result; 
	}
	public Complex mul(Complex other) {
		double new_real; // ����� ��ȯ�� ��ü�� �Ǽ��� 
		double new_imaginary; // ����� ��ȯ�� ��ü�� �����
		// fill here! 
		
		new_real = (this.real * other.getReal()) - (this.imaginary * other.getImaginary());
		new_imaginary = (this.real * other.getImaginary()) + (this.imaginary * other.getReal());
		
		Complex result = new Complex(new_real, new_imaginary);
		return result; 
	}
	public double getReal() {
		return this.real;
	}
	public double getImaginary() {
		return this.imaginary;
	}
	}
	
	public class Q2_2 {
	public static void main(String[] args) {
		// test code 
		Complex c1 = new Complex(3, -1);
		Complex c2 = new Complex(-5, 2);
		Complex c1_add_c2 = c1.add(c2);
		Complex c1_sub_c2 = c1.sub(c2);
		Complex c1_mul_c2 = c1.mul(c2);
		System.out.println("c1 + c2 = " + c1_add_c2.getReal() + " + " + c1_add_c2.getImaginary() + "i"); // c1 + c2 = -2.0 + 1.0i 
		System.out.println("c1 - c2 = " + c1_sub_c2.getReal() + " + " + c1_sub_c2.getImaginary() + "i"); // c1 - c2 = 8.0 + -3.0i
		System.out.println("c1 * c2 = " + c1_mul_c2.getReal() + " + " + c1_mul_c2.getImaginary() + "i"); // c1 * c2 = -13.0 + 11.0i
	}
}