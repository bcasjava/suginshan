
public class MathCal {

	public static void main(String[] args) {
		
		int ans = Math.max(50, 60);
		System.out.println("max :"+ans);
		
		ans = Math.min(50, 60);
		System.out.println("min :"+ans);
		
		ans = Math.multiplyExact(50, 60);
		System.out.println("multiply : "+ans);
		
		
		ans = (int) (Math.random()*10);
		System.out.println("random num : "+ans);
		
		ans = Math.addExact(50, 60);
		System.out.println("addition : "+ans);
		
		ans = (int) Math.toRadians(88);
		System.out.println("radious : "+ans);
		
	}

}
